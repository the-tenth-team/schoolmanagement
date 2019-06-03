package cn.dazky.contorller;

import cn.dazky.pojo.StudentInfo;
import cn.dazky.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-22 9:40
 */
@Controller
public class StudentController {

    @Autowired
    StudentInfoService studentInfoService;
    @RequestMapping(value = "/getStuInfo",method = RequestMethod.DELETE)
    public String getStuInfo(Model model){
        System.out.println("service"+studentInfoService);
        List<StudentInfo> students=studentInfoService.getAllStudent();
        model.addAttribute("students",students);
        return "demo/getData";
    }

    @RequestMapping("/")
    public String Default(Model model){
        model.addAttribute("notices",studentInfoService.getAllNotice());
        return "index";
    }

    @RequestMapping("/index1")
    public String Index1(){
        return "TheFrontDeskManagement/forgetpwd/index-forgetpwd-first";
    }
    @RequestMapping("/index2")
    public String Index2(){
        return "TheFrontDeskManagement/forgetpwd/index-forgetpwd-second";
    }
    @RequestMapping("/index3")
    public String Index3(){
        return "TheFrontDeskManagement/forgetpwd/index-forgetpwd-third";
    }
    @RequestMapping("/index4")
    public String Index4(){
        return "TheFrontDeskManagement/forgetpwd/index-forgetpwd-fourth";
    }
    @RequestMapping("/index5")
    public String Index5(){
        return "index";
    }
    @RequestMapping("/index6")
    public String index6(){
        return "TheFrontDeskManagement/forgetpwd/index-forgetpwd-fifth";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(String old_pwd,String new_pwd){
        System.out.println(old_pwd+"==="+old_pwd);
        return "aaaa";
    }

    @RequestMapping("/getValiData")
    @ResponseBody
    public String getValiData(String old_pwd,String new_pwd){
        System.out.println(old_pwd+"==="+old_pwd);
        return "123456";
    }

    @RequestMapping("/judegValiDate")
    @ResponseBody
    public String judegValiDate(){
        return "123456";
    }

    @RequestMapping("/studentIndex")
    public String studentIndex(){
        return "/TheFrontDeskManagement/studentManagemeut/index";
    }

    @RequestMapping("/left")
    public String left(){
        return "/TheFrontDeskManagement/studentManagemeut/left";
    }

    @RequestMapping("/right")
    public String right(){
        return "/TheFrontDeskManagement/studentManagemeut/right";
    }


    @RequestMapping("/updatePwd")
    public String updatePwd(){
        return "/TheFrontDeskManagement/studentManagemeut/student-uppwd";
    }

    @RequestMapping("/personalInformation")
    public String personalInformation(){
        return "/TheFrontDeskManagement/studentManagemeut/student-information";
    }

    @RequestMapping("/studnetScore")
    public String studnetScore(){
        return "/TheFrontDeskManagement/studentManagemeut/student-score";
    }

    @RequestMapping("/studentpay")
    public String studentpay(){
        return "/TheFrontDeskManagement/studentManagemeut/student-pay";
    }

    @RequestMapping("/monthCriticism")
    public String monthCriticism(){
        return "/TheFrontDeskManagement/studentManagemeut/student-month-criticism";
    }

    @RequestMapping("/addmonthCriticism")
    public String addmonthCriticism(){
        return "/TheFrontDeskManagement/studentManagemeut/student-add-month-criticism";
    }





}
