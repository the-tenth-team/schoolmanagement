package cn.dazky.contorller;

import cn.dazky.pojo.DisciplineInfo;
import cn.dazky.pojo.SyllabusInfo;
import cn.dazky.service.Impl.CourseServiceImpl;
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
 * 课程信息Course
 *
 * @author Mr.Zhong
 * @create2019-05-28 9:30
 */
@Controller
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;



    /**
     * 跳转到课程管理页面
     *
     * @return
     */
    @RequestMapping("/staff/ToDisciplineInfoList")
    public String ToDisciplineInfoList() {
        return "BackgroundManagement/management/AdminCourse";
    }

    /**
     * 查询所有课程信息
     *
     * @return
     */
    @RequestMapping("/DisciplineInfoList")
    @ResponseBody
    public Map<String, Object> DisciplineInfoList(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<DisciplineInfo> disciplineInfoList = courseService.selectByExample();
        PageInfo<DisciplineInfo> pageInfo = new PageInfo<>(disciplineInfoList);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集
        return map;
    }

    /**
     * 跳转到课程表管理页面
     *
     * @return
     */
    @RequestMapping("/staff/ToSyllabusInfoList")
    public String ToSyllabusInfoList() {
        return "BackgroundManagement/management/Course";
    }

    /**
     * 查询所有课程表
     *
     * @param request
     * @return
     */
    @RequestMapping("/SyllabusInfoList")
    @ResponseBody
    public Map<String, Object> SyllabusInfoList(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<SyllabusInfo> syllabusInfo = courseService.syllabusInfoList();
        PageInfo<SyllabusInfo> pageInfo = new PageInfo<>(syllabusInfo);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集
        return map;
    }




}
