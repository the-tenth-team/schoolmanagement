package cn.dazky.pojo;

import java.util.Date;

/**
 *班级信息管理Bean
 */
public class ClassInfo {
    //班级ID
    private Integer classId;
    //班级课表编号
    private Integer syllabusId;
    //教室编号
    private Integer classroomId;
    //员工编号
    private Integer staffId;
    //班级名
    private String className;
    //班级人数
    private Integer classNumber;
    //开班日期
    private Date classStartTime;
    //结束日期
    private Date classEndTime;
    //班主任
    private String classIsuesd;
    //班级状态
    private String classState;
    //班级描述
    private String classDesc;
    //专业
    private String classMajor;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Date getClassStartTime() {
        return classStartTime;
    }

    public void setClassStartTime(Date classStartTime) {
        this.classStartTime = classStartTime;
    }

    public Date getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Date classEndTime) {
        this.classEndTime = classEndTime;
    }

    public String getClassIsuesd() {
        return classIsuesd;
    }

    public void setClassIsuesd(String classIsuesd) {
        this.classIsuesd = classIsuesd == null ? null : classIsuesd.trim();
    }

    public String getClassState() {
        return classState;
    }

    public void setClassState(String classState) {
        this.classState = classState == null ? null : classState.trim();
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc == null ? null : classDesc.trim();
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor == null ? null : classMajor.trim();
    }
}