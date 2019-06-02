package cn.dazky.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/adminlogin")
    public String adminlogin(){
        return "BackgroundManagement/login";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "BackgroundManagement/index";
    }
}
