package cn.dazky.contorller;

import cn.dazky.pojo.RoleInfo;
import cn.dazky.pojo.StaffInfo;
import cn.dazky.service.RoleInfoSerivce;
import cn.dazky.service.RoleStatisticsService;
import cn.dazky.service.StaffService;
import cn.dazky.service.StudentInfoService;
import cn.dazky.vo.Cartogram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 鹏
 * @2019-05-28 10:10
 * 后台登陆管理的控制器
 */
@Controller
public class LoginController {

    @Autowired
    RoleStatisticsService roleStatisticsService;

    @Autowired
    StudentInfoService studentInfoService;

    @Autowired
    StaffService staffService;

    @Autowired
    RoleInfoSerivce roleInfoSerivce;

    /**
     * 进入后台登陆页面
     * @return
     */
    @RequestMapping("/adminlogin")
    public String adminlogin(){
        return "BackgroundManagement/login";
    }

    /**
     * 显示后台主页
     * @param model
     * @return
     */
    @RequestMapping("/adminMain")
    public String adminMain(Model model){
        Integer studentCount = studentInfoService.getStudentCount();
        Integer staffCount = staffService.getStaffCount();
        model.addAttribute("studentCount",studentCount);
        model.addAttribute("staffCount",staffCount);
        return "BackgroundManagement/main";
    }

    /**
     * 主页面的人数统计
     * @return
     */
    @RequestMapping("/getRoleCount")
    @ResponseBody
    public List<Cartogram> getRoleCount(){
        List<Cartogram> all = roleStatisticsService.getAll();
        return all;
    }

    /**
     * 显示个人的信息
     * @return
     */
    @RequestMapping("/getPersonal")
    public String getPersonal(HttpSession session,Model model){
        return "BackgroundManagement/personal";
    }

    @ResponseBody
    @RequestMapping("/getAdmin")
    public Map<String, Object> getAdmin(HttpSession session){
        StaffInfo staffInfo = (StaffInfo) session.getAttribute("user");
        StaffInfo user = staffService.getStaffById(staffInfo.getStaffId());
        RoleInfo roleInfo = roleInfoSerivce.getRoleById(user.getRoleId());
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("roleInfo",roleInfo);
        return map;
    }


}
