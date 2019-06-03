package cn.dazky.contorller;

import cn.dazky.service.RoleStatisticsService;
import cn.dazky.service.StaffService;
import cn.dazky.service.StudentInfoService;
import cn.dazky.vo.Cartogram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    /**
     * 进入后台登陆页面
     * @return
     */
    @RequestMapping("/adminlogin")
    public String adminlogin(){
        return "BackgroundManagement/login";
    }

    @RequestMapping("/adminMain")
    public String adminMain(Model model){
        Integer studentCount = studentInfoService.getStudentCount();
        Integer staffCount = staffService.getStaffCount();
        model.addAttribute("studentCount",studentCount);
        model.addAttribute("staffCount",staffCount);
        return "BackgroundManagement/main";
    }

    @RequestMapping("/getRoleCount")
    @ResponseBody
    public List<Cartogram> getRoleCount(){
        List<Cartogram> all = roleStatisticsService.getAll();
        return all;
    }
}
