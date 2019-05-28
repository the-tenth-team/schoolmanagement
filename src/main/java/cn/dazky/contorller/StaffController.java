package cn.dazky.contorller;

import cn.dazky.pojo.StaffInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr.chen
 * @2019-05-26 10:01
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
    @RequestMapping()
    public String login(StaffInfo staffInfo){
        //后台登录
        return "TheFrontDeskManagement/studentManagemeut/index";
    }
}
