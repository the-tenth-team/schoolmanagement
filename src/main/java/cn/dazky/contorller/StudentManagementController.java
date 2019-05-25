package cn.dazky.contorller;

import cn.dazky.pojo.CommunicateInfo;
import cn.dazky.service.CommunicateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName StudentManagementController
 * @Description TODO
 * @Auther Google
 * @Date 2019/5/24 18:15
 * @Version 1.0
 */
@Controller
public class StudentManagementController {

    @Autowired
    CommunicateInfoService communicateInfoService;
    /**
     * 班主任评价
     * @param model
     * @return
     */
    @RequestMapping("/communicateinfo_list")
    public String findCommunicateInfoAll(Model model) {
        List<CommunicateInfo> communicateInfoAll = communicateInfoService.findCommunicateInfoAll();
        model.addAttribute("CommunicateInfoList",communicateInfoAll);
        return "BackgroundManagement/student/communicateinfo/communicateinfo_list";
    }
}
