package cn.dazky.pojo;

import java.util.Date;

public class StudentWriteGrade {
    private Integer writeGradeId;

    private Integer studentId;

    private Integer staffId;

    private Integer classId;

    private Integer disciplineId;

    private String writeGrade;

    private Date writeGradeTime;

    private String writeGradeNote;

    private String writeGradeXuenian;

    private String writeGradeXueqi;

    private String writeGradeType;

    private ClassInfo classInfo;
    private StudentInfo studentInfo;
    private DisciplineInfo disciplineInfo;
    private StaffInfo staffInfo;

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public DisciplineInfo getDisciplineInfo() {
        return disciplineInfo;
    }

    public void setDisciplineInfo(DisciplineInfo disciplineInfo) {
        this.disciplineInfo = disciplineInfo;
    }

    public StaffInfo getStaffInfo() {
        return staffInfo;
    }

    public void setStaffInfo(StaffInfo staffInfo) {
        this.staffInfo = staffInfo;
    }

    public Integer getWriteGradeId() {
        return writeGradeId;
    }

    public void setWriteGradeId(Integer writeGradeId) {
        this.writeGradeId = writeGradeId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getWriteGrade() {
        return writeGrade;
    }

    public void setWriteGrade(String writeGrade) {
        this.writeGrade = writeGrade == null ? null : writeGrade.trim();
    }

    public Date getWriteGradeTime() {
        return writeGradeTime;
    }

    public void setWriteGradeTime(Date writeGradeTime) {
        this.writeGradeTime = writeGradeTime;
    }

    public String getWriteGradeNote() {
        return writeGradeNote;
    }

    public void setWriteGradeNote(String writeGradeNote) {
        this.writeGradeNote = writeGradeNote == null ? null : writeGradeNote.trim();
    }

    public String getWriteGradeXuenian() {
        return writeGradeXuenian;
    }

    public void setWriteGradeXuenian(String writeGradeXuenian) {
        this.writeGradeXuenian = writeGradeXuenian == null ? null : writeGradeXuenian.trim();
    }

    public String getWriteGradeXueqi() {
        return writeGradeXueqi;
    }

    public void setWriteGradeXueqi(String writeGradeXueqi) {
        this.writeGradeXueqi = writeGradeXueqi == null ? null : writeGradeXueqi.trim();
    }

    public String getWriteGradeType() {
        return writeGradeType;
    }

    public void setWriteGradeType(String writeGradeType) {
        this.writeGradeType = writeGradeType == null ? null : writeGradeType.trim();
    }
}