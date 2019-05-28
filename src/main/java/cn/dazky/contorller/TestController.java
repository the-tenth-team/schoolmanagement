package cn.dazky.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/admin")
    public String admin(){
        return "BackgroundManagement/index";
    }
}
