package cn.dazky.contorller;

import cn.dazky.pojo.StudentInfo;
import cn.dazky.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-22 9:40
 */
@Controller
public class StudentController {
    @Autowired
    StudentInfoService studentInfoService;
    @RequestMapping("/getStuInfo")
    public String getStuInfo(Model model){
        System.out.println("service"+studentInfoService);
        List<StudentInfo> students=studentInfoService.getAllStudent();

        model.addAttribute("students",students);
        return "demo/getData";
    }
}
