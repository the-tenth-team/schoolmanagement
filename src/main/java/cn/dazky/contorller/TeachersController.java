package cn.dazky.contorller;

import cn.dazky.pojo.StaffInfo;
import cn.dazky.service.TeachersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 教师信息管理Controller
 *
 * @author Mr.Zhong
 * @create2019-06-04 9:12
 */
@Controller
public class TeachersController {

    @Autowired
    TeachersService teachersService;

    @RequestMapping("/staff/ToStaffInfoList")
    public String ToStaffInfoList() {
        return "BackgroundManagement/management/Teachers";
    }

    @RequestMapping("/StaffInfoList")
    @ResponseBody
    public Map<String, Object> DisciplineInfoList(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StaffInfo> staffInfoListfo = teachersService.StaffInfoList();
        PageInfo<StaffInfo> pageInfo = new PageInfo<>(staffInfoListfo);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集
        return map;
    }

}
