package cn.dazky.contorller;

import cn.dazky.pojo.*;
import cn.dazky.service.*;
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
    CommunicateInfoService communicateInfoService;/*班主任评价*/
    @Autowired
    StudentWriteGradeService studentWriteGradeService;/*期末成绩*/
    @Autowired
    AttendanceInfoService attendanceInfoService;/*考勤信息*/
    @Autowired
    StudentPaymentService studentPaymentService;/*学生缴费信息*/
    @Autowired
    StudentLearnExperienceService studentLearnExperienceService;/*学生学习经历*/
    @Autowired
    StudentFamilyMemberService studentFamilyMemberService;/*学生家庭成员*/
    @Autowired
    StudentPracticeSkillsService studentPracticeSkillsService;/*社会实践及技能培训*/
    @Autowired
    StudentGraduationThesisService studentGraduationThesisService;/*毕业论文及科研训练*/
    @Autowired
    StudentInfoService studentInfoService;/*学生信息*/

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
        List<CommunicateInfo> list = communicateInfoService.getCommunicateInfoAll();
        PageInfo<CommunicateInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至期末成绩页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentWriteGradeList")
    public String ToStudentWriteGradeList() {
        return "BackgroundManagement/student/StudentWriteGradeList";
    }

    /**
     * 期末成绩分页显示
     *
     * @param request
     * @return
     */
    @RequestMapping("/StudentWriteGradeList")
    @ResponseBody
    public Map<String, Object> findStudentWriteGradeListAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentWriteGrade> list = studentWriteGradeService.getStudentWriteGradeListAll();
        PageInfo<StudentWriteGrade> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至考勤管理页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToAttendanceInfoList")
    public String ToAttendanceInfoList() {
        return "BackgroundManagement/student/AttendanceInfoList";
    }

    /**
     * 考勤信息分页显示
     *
     * @param request
     * @return
     */
    @RequestMapping("/AttendanceInfoList")
    @ResponseBody
    public Map<String, Object> findAttendanceInfoAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<AttendanceInfo> list = attendanceInfoService.getAttendanceInfoAll();
        PageInfo<AttendanceInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至学生缴费登记页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentPaymentList")
    public String ToStudentPaymentList() {
        return "BackgroundManagement/student/StudentPaymentList";
    }

    /**
     * 学生缴费登记分页显示
     *
     * @return
     */
    @RequestMapping("/StudentPaymentList")
    @ResponseBody
    public Map<String, Object> findStudentPaymentAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentInfo> list = studentInfoService.getStudentInfoAll();
        PageInfo<StudentInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至学生学习经历页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentLearnExperienceList")
    public String ToStudentLearnExperienceList() {
        return "BackgroundManagement/student/StudentLearnExperienceList";
    }

    /**
     * 学生学习经历页分页显示
     *
     * @return
     */
    @RequestMapping("/StudentLearnExperienceList")
    @ResponseBody
    public Map<String, Object> findStudentLearnExperienceAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentLearnExperience> list = studentLearnExperienceService.getStudentLearnExperienceAll();
        PageInfo<StudentLearnExperience> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至学生家庭成员页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentFamilyMemberList")
    public String ToStudentFamilyMemberList() {
        return "BackgroundManagement/student/StudentFamilyMemberList";
    }

    /**
     * 学生家庭成员分页显示
     *
     * @return
     */
    @RequestMapping("/StudentFamilyMemberList")
    @ResponseBody
    public Map<String, Object> findStudentFamilyMemberAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentFamilyMember> list = studentFamilyMemberService.getStudentFamilyMemberAll();
        PageInfo<StudentFamilyMember> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至社会实践及技能培训页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentPracticeSkillsList")
    public String ToStudentPracticeSkillsList() {
        return "BackgroundManagement/student/StudentPracticeSkillsList";
    }

    /**
     * 社会实践及技能培训分页显示
     *
     * @return
     */
    @RequestMapping("/StudentPracticeSkillsList")
    @ResponseBody
    public Map<String, Object> findStudentPracticeSkillsAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentPracticeSkills> list = studentPracticeSkillsService.getStudentPracticeSkillsAll();
        PageInfo<StudentPracticeSkills> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    /**
     * 跳转至毕业论文及科研训练页面**************************************************************************************************************************
     *
     * @return
     */
    @RequestMapping("/staff/ToStudentGraduationThesisList")
    public String StudentGraduationThesisList() {
        return "BackgroundManagement/student/StudentGraduationThesisList";
    }

    /**
     * 毕业论文及科研训分页显示
     *
     * @return
     */
    @RequestMapping("/StudentGraduationThesisList")
    @ResponseBody
    public Map<String, Object> findStudentGraduationThesisAll(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<StudentGraduationThesis> list = studentGraduationThesisService.getStudentGraduationThesis();
        PageInfo<StudentGraduationThesis> pageInfo = new PageInfo<>(list);

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
    @RequestMapping("/staff/ToStudentInfoList")
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
        List<StudentInfo> list = studentInfoService.getStudentInfoAll();
        PageInfo<StudentInfo> pageInfo = new PageInfo<>(list);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集

        return map;
    }
}
