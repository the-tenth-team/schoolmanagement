package cn.dazky.pojo;

import java.util.Date;

public class StudentGraduationThesis {
    private Integer studentPaperId;

    private Integer studentId;

    private Integer staffId;

    private String paperTitle;

    private String paperTeacher;

    private String paperStart;

    private Date paperTime;

    private String paperScore;

    private String paperComments;

    private Date regTime;

    private String paperNote;
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

    public Integer getStudentPaperId() {
        return studentPaperId;
    }

    public void setStudentPaperId(Integer studentPaperId) {
        this.studentPaperId = studentPaperId;
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

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle == null ? null : paperTitle.trim();
    }

    public String getPaperTeacher() {
        return paperTeacher;
    }

    public void setPaperTeacher(String paperTeacher) {
        this.paperTeacher = paperTeacher == null ? null : paperTeacher.trim();
    }

    public String getPaperStart() {
        return paperStart;
    }

    public void setPaperStart(String paperStart) {
        this.paperStart = paperStart == null ? null : paperStart.trim();
    }

    public Date getPaperTime() {
        return paperTime;
    }

    public void setPaperTime(Date paperTime) {
        this.paperTime = paperTime;
    }

    public String getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(String paperScore) {
        this.paperScore = paperScore == null ? null : paperScore.trim();
    }

    public String getPaperComments() {
        return paperComments;
    }

    public void setPaperComments(String paperComments) {
        this.paperComments = paperComments == null ? null : paperComments.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getPaperNote() {
        return paperNote;
    }

    public void setPaperNote(String paperNote) {
        this.paperNote = paperNote == null ? null : paperNote.trim();
    }

    @Override
    public String toString() {
        return "StudentGraduationThesis{" +
                "studentPaperId=" + studentPaperId +
                ", studentId=" + studentId +
                ", staffId=" + staffId +
                ", paperTitle='" + paperTitle + '\'' +
                ", paperTeacher='" + paperTeacher + '\'' +
                ", paperStart='" + paperStart + '\'' +
                ", paperTime=" + paperTime +
                ", paperScore='" + paperScore + '\'' +
                ", paperComments='" + paperComments + '\'' +
                ", regTime=" + regTime +
                ", paperNote='" + paperNote + '\'' +
                ", studentInfo=" + studentInfo +
                ", staffInfo=" + staffInfo +
                '}';
    }
}