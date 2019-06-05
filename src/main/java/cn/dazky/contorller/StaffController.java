package cn.dazky.contorller;

import cn.dazky.pojo.RoleAnthorityInfo;
import cn.dazky.pojo.RoleInfo;
import cn.dazky.pojo.StaffInfo;
import cn.dazky.service.RoleAnthorityService;
import cn.dazky.service.RoleInfoSerivce;
import cn.dazky.service.RoleService;
import cn.dazky.service.StaffService;
import cn.dazky.util.Msg;
import cn.dazky.vo.Condition;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Pattern;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.chen
 * @2019-05-26 10:01
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    private RoleAnthorityService roleAnthorityService;

    @Autowired
    private RoleInfoSerivce roleInfoSerivce;

    /**
     * 后台登录认证
     *
     * @param user_number   用户名
     * @param user_password 密码
     * @return 成功返回：用户对象
     * 失败返回：null
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String user_number, String user_password, HttpSession session) throws UnsupportedEncodingException {


        System.out.println("用户名" + user_number + "------------" + "密码" + user_password);

        Subject subject = SecurityUtils.getSubject();

        if (!subject.isAuthenticated()) {
            // 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(user_number, user_password);
            // rememberme
            token.setRememberMe(true);
            try {
                System.out.println("1. " + token.hashCode());
                // 执行登录.
                subject.login(token);
            }
            // 所有认证时异常的父类.
            catch (AuthenticationException ae) {
                System.out.println("登录失败: " + ae.getMessage());
                return "fail";
            }
        }
        StaffInfo staffInfo = staffService.login(user_number);
        session.setAttribute("user", staffInfo);
        return "ok";
    }

    /**
     * 进入首页 且动态的显示左侧菜单
     *
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model, HttpSession session) {
        List<String> stairMenu = new ArrayList<>();//存放一级菜单
        Map<Integer, List<RoleAnthorityInfo>> secondMenu = new HashMap<>();
        StaffInfo staffInfo = (StaffInfo) session.getAttribute("user");
        //先查询一级菜单
        List<RoleAnthorityInfo> roleAnthorityInfoList = roleAnthorityService.getAllWithAnthortyByRoleId(staffInfo.getRoleId(), 1);
        //System.out.println(roleAnthorityInfoList);
        //查出1级菜单对应的2级子菜单
        for (int i = 0; i < roleAnthorityInfoList.size(); i++) {
            //把1级菜单放入集合中
            stairMenu.add(i, roleAnthorityInfoList.get(i).getAnthortyInfo().getAnthortyName());
            List<RoleAnthorityInfo> secondRoleAnthorityInfoList = roleAnthorityService.getAllWithAnthortyByRoleId(staffInfo.getRoleId(), roleAnthorityInfoList.get(i).getAnthortyId());
            //把每一个一级菜单拥有的二级子菜单放到map中
            secondMenu.put(i + 1, secondRoleAnthorityInfoList);
        }
        //System.out.println("二级"+secondMenu);
        model.addAttribute("stairMenu", stairMenu);
        model.addAttribute("secoudMenu", secondMenu);
        return "BackgroundManagement/index";
    }

    /**
     * 更新当前登陆员工数据
     *
     * @param staffInfo
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateStaff")
    public Msg updateStaff(StaffInfo staffInfo, HttpSession session) {
        StaffInfo user = (StaffInfo) session.getAttribute("user");
        staffInfo.setRoleId(user.getRoleId());
        staffInfo.setStaffId(user.getStaffId());
        staffInfo.setStaffState(user.getStaffState());
        System.out.println("获取数据" + staffInfo);
        staffService.update(staffInfo);
        return Msg.success();
    }

    /**
     * 进入员工管理页面
     *
     * @return
     */
    @RequestMapping("/ToStaffMangement")
    public String ToStaffMangement() {
        return "BackgroundManagement/staff/staffManagement";
    }

    @RequestMapping("/getStaffList")
    @ResponseBody
    public Map<String,Object> getStaffList(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<StaffInfo> staffInfoList = staffService.getStaffAll();
        PageInfo<StaffInfo> pageInfo = new PageInfo<>(staffInfoList);
        Map<String,Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    /**
     * 员工的条件查询
     * @param condition
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/getStaffByCondition")
    @ResponseBody
    public Map<String,Object> getStaffByCondition(Condition condition,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo<StaffInfo> pageInfo = null;
        List<StaffInfo> staffInfoList = new ArrayList<>();
        if (condition.getCondition().equals("0")){
            PageHelper.startPage(page,limit);
            staffInfoList = staffService.getStaffAll();
            pageInfo = new PageInfo<>(staffInfoList);
        }else{
            PageHelper.startPage(page,limit);
            staffInfoList = staffService.getStaffByCondition(condition);
            pageInfo = new PageInfo<>(staffInfoList);
        }
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    /**
     * 进入员工的查看及编辑页面
     * @param staffId
     * @param model
     * @return
     */
    @RequestMapping("/getStaffManagementSeeAndUp")
    public String getStaffManagementSeeAndUp(Integer staffId,Model model){
        model.addAttribute("staffId",staffId);
        return "/BackgroundManagement/staff/staffManagementSeeAndUp";
    }

    /**
     * 显示查看员工的信息
     * @param staffId
     * @return
     */
    @ResponseBody
    @RequestMapping("/getStaffById")
    public Map<String,Object> getStaffById(Integer staffId ){
        StaffInfo user = staffService.getStaffById(staffId);
        RoleInfo roleInfo = roleInfoSerivce.getRoleById(user.getRoleId());
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("roleInfo",roleInfo);
        return map;
    }

    @ResponseBody
    @RequestMapping("/updateStaffByStaffId")
    public Msg  updateStaffByStaffId(StaffInfo staffInfo){
        System.out.println("---------"+staffInfo);
        staffService.update(staffInfo);
        return Msg.success();
    }

}
