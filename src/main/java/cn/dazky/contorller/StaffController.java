package cn.dazky.contorller;

import cn.dazky.pojo.RoleAnthorityInfo;
import cn.dazky.pojo.StaffInfo;
import cn.dazky.service.RoleAnthorityService;
import cn.dazky.service.StaffService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    /**
     * 后台登录认证
     * @param user_number 用户名
     * @param user_password 密码
     * @return 成功返回：用户对象
     *         失败返回：null
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String user_number, String user_password, HttpSession session) throws UnsupportedEncodingException {


        System.out.println("用户名"+user_number+"------------"+"密码"+user_password);

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
        session.setAttribute("user",staffInfo);
        return "ok";
    }

    /**
     * 进入首页 且动态的显示左侧菜单
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model,HttpSession session){
        List<String> stairMenu = new ArrayList<>();//存放一级菜单
        Map<Integer,List<RoleAnthorityInfo>> secondMenu = new HashMap<>();
        StaffInfo staffInfo = (StaffInfo) session.getAttribute("user");
        //先查询一级菜单
        List<RoleAnthorityInfo> roleAnthorityInfoList = roleAnthorityService.getAllWithAnthortyByRoleId(staffInfo.getRoleId(),1);
        System.out.println(roleAnthorityInfoList);
        //查出1级菜单对应的2级子菜单
        for (int i=0;i<roleAnthorityInfoList.size();i++){
            //把1级菜单放入集合中
            stairMenu.add(i,roleAnthorityInfoList.get(i).getAnthortyInfo().getAnthortyName());
            List<RoleAnthorityInfo> secondRoleAnthorityInfoList = roleAnthorityService.getAllWithAnthortyByRoleId(staffInfo.getRoleId(), roleAnthorityInfoList.get(i).getAnthortyId());
            //把每一个一级菜单拥有的二级子菜单放到map中
            secondMenu.put(i+1,secondRoleAnthorityInfoList);
        }
        System.out.println("二级"+secondMenu);
        model.addAttribute("stairMenu",stairMenu);
        model.addAttribute("secoudMenu",secondMenu);
        return "BackgroundManagement/index";
    }
}
