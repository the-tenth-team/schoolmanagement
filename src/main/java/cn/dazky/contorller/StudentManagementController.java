package cn.dazky.contorller;

import cn.dazky.pojo.CommunicateInfo;
import cn.dazky.pojo.StudentInfo;
import cn.dazky.pojo.StudentWriteGrade;
import cn.dazky.service.CommunicateInfoService;
import cn.dazky.service.StudentInfoService;
import cn.dazky.service.StudentWriteGradeService;
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
 * @author Zhike Chen
 * @description: 学生管理
 * @date 2019/5/30 10:41
 */
@Controller
public class StudentManagementController {

    @Autowired
    CommunicateInfoService communicateInfoService;
    @Autowired
    StudentInfoService studentInfoService;
    @Autowired
    StudentWriteGradeService studentWriteGradeService;
    /**
     * 跳转至班主任评价页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToCommunicateInfoList")
    public String ToCommunicateInfoList() {
        return "BackgroundManagement/student/CommunicateInfoList";
    }

    /**
     * 班主任评价分页显示
     *
     * @return
     */
    @RequestMapping("/CommunicateInfoList")
    @ResponseBody
    public Map<String, Object> findCommunicateInfoAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<CommunicateInfo> list = communicateInfoService.findCommunicateInfoAll();
        PageInfo<CommunicateInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至期末成绩页面**************************************************************************************************************************
     * @return
     */
    @RequestMapping("/ToStudentWriteGradeList")
    public String ToStudentWriteGradeList(){
        return "BackgroundManagement/student/StudentWriteGradeList";
    }

    /**
     * 期末成绩分页显示
     * @param request
     * @return
     */
    @RequestMapping("/StudentWriteGradeList")
    @ResponseBody
    public Map<String, Object> findStudentWriteGradeListAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentWriteGrade> list = studentWriteGradeService.findStudentWriteGradeListAll();
        PageInfo<StudentWriteGrade> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }


    /**
     * 跳转至学生信息页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/ToStudentInfoList")
    public String ToStudentInfoList() {
        return "BackgroundManagement/student/StudentInfoList";
    }

    /**
     * 学生信息分页显示
     *
     * @return
     */
    @RequestMapping("/StudentInfoList")
    @ResponseBody
    public Map<String, Object> findStudentInfoAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentInfo> list = studentInfoService.findStudentInfoAll();
        PageInfo<StudentInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }
}
