package cn.dazky.contorller;

import cn.dazky.pojo.CommunicateInfo;
import cn.dazky.service.CommunicateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 跳转至班主任评价页面
     * @return
     */
    @RequestMapping("/ToCommunicateInfoList")
    public String ToCommunicateInfoList() {
        return "BackgroundManagement/student/CommunicateInfoList";
    }

    /**
     * 班主任评价分页显示
     * @return
     */
    @RequestMapping("/CommunicateInfoList")
    @ResponseBody
    public Map<String,Object> findCommunicateInfoAll(){
        Map<String,Object> map=new HashMap<String,Object>();
        List<CommunicateInfo> communicateInfoAll = communicateInfoService.findCommunicateInfoAll();
/*        System.out.println(communicateInfoAll.get(0).getStudentInfo().getStudentName());
        System.out.println(communicateInfoAll.get(0).getStaffInfo().getStaffName());*/
        int countx=communicateInfoAll.size();
        map.put("code",0);
        map.put("msg","");
        map.put("count",countx);
        map.put("data",communicateInfoAll);
        //System.out.println(map.toString());
        return map;
    }
}
