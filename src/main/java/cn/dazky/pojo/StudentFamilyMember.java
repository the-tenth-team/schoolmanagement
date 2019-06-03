package cn.dazky.pojo;

import java.util.Date;

public class StudentFamilyMember {
    private Integer studentFamilyId;

    private Integer studentId;

    private Integer staffId;

    private String familyName;

    private String familyApp;

    private Integer familyAge;

    private String familyZcmm;

    private String workplace;

    private Date regTime;

    private String familyNote;
    private StudentInfo studentInfo;
    private StaffInfo staffInfo;

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public StaffInfo getStaffInfo() {
        return staffInfo;
    }

    public void setStaffInfo(StaffInfo staffInfo) {
        this.staffInfo = staffInfo;
    }

    public Integer getStudentFamilyId() {
        return studentFamilyId;
    }

    public void setStudentFamilyId(Integer studentFamilyId) {
        this.studentFamilyId = studentFamilyId;
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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getFamilyApp() {
        return familyApp;
    }

    public void setFamilyApp(String familyApp) {
        this.familyApp = familyApp == null ? null : familyApp.trim();
    }

    public Integer getFamilyAge() {
        return familyAge;
    }

    public void setFamilyAge(Integer familyAge) {
        this.familyAge = familyAge;
    }

    public String getFamilyZcmm() {
        return familyZcmm;
    }

    public void setFamilyZcmm(String familyZcmm) {
        this.familyZcmm = familyZcmm == null ? null : familyZcmm.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getFamilyNote() {
        return familyNote;
    }

    public void setFamilyNote(String familyNote) {
        this.familyNote = familyNote == null ? null : familyNote.trim();
    }

    @Override
    public String toString() {
        return "StudentFamilyMember{" +
                "studentFamilyId=" + studentFamilyId +
                ", studentId=" + studentId +
                ", staffId=" + staffId +
                ", familyName='" + familyName + '\'' +
                ", familyApp='" + familyApp + '\'' +
                ", familyAge=" + familyAge +
                ", familyZcmm='" + familyZcmm + '\'' +
                ", workplace='" + workplace + '\'' +
                ", regTime=" + regTime +
                ", familyNote='" + familyNote + '\'' +
                ", studentInfo=" + studentInfo +
                ", staffInfo=" + staffInfo +
                '}';
    }
}