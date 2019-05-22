package cn.dazky.Contorller;

import cn.dazky.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-22 9:40
 */
@Controller
public class StudentController {
    @RequestMapping("getStuInfo")
    public String getStuInfo(Model model){
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("陈礼剑","201700005690"));
        students.add(new Student("万鹏","201700005691"));
        students.add(new Student("钟久荣","201700005692"));
        students.add(new Student("陈志可","201700005693"));
        model.addAttribute("students",students);
        return "getData";
    }
}
