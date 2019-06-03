package cn.dazky.contorller;

import cn.dazky.pojo.ClassroomInfo;
import cn.dazky.service.ClassService;
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
 * @author Mr.Zhong
 * @create2019-06-01 13:52
 */
@Controller
public class ClassController {

    @Autowired
    ClassService classService;

    /**
     * 跳转到教室管理页面
     * @return
     */
    @RequestMapping("/staff/ToClassroomInfoList")
    public String ToClassroomInfo() {
        return "BackgroundManagement/management/Class";
    }

    /**
     * 查询所有教室信息
     * @param request
     * @return
     */
    @RequestMapping("/ClassroomInfoList")
    @ResponseBody
    public Map<String, Object> DisciplineInfo(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<ClassroomInfo> ClassroomInfoList = classService.selectByExample();
        PageInfo<ClassroomInfo> pageInfo = new PageInfo<>(ClassroomInfoList);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集
        return map;
    }

}
