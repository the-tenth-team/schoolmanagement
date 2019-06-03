package cn.dazky.pojo;

import java.io.Serializable;

/**
 * 课程信息表
 */
public class DisciplineInfo implements Serializable {
    //课程信息表ID
    private Integer disciplineId;
    //课程编号
    private String disciplineNo;
    //课程名称
    private String disciplineName;
    //学时
    private Double disciplineTuition;
    //学分
    private Integer disciplineBring;
    //课程类型
    private String disciplineType;
    //课程描述
    private String disciplineDesc;
    //课程状态
    private String disciplineIsuesd;

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineNo() {
        return disciplineNo;
    }

    public void setDisciplineNo(String disciplineNo) {
        this.disciplineNo = disciplineNo == null ? null : disciplineNo.trim();
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName == null ? null : disciplineName.trim();
    }

    public Double getDisciplineTuition() {
        return disciplineTuition;
    }

    public void setDisciplineTuition(Double disciplineTuition) {
        this.disciplineTuition = disciplineTuition;
    }

    public Integer getDisciplineBring() {
        return disciplineBring;
    }

    public void setDisciplineBring(Integer disciplineBring) {
        this.disciplineBring = disciplineBring;
    }

    public String getDisciplineType() {
        return disciplineType;
    }

    public void setDisciplineType(String disciplineType) {
        this.disciplineType = disciplineType == null ? null : disciplineType.trim();
    }

    public String getDisciplineDesc() {
        return disciplineDesc;
    }

    public void setDisciplineDesc(String disciplineDesc) {
        this.disciplineDesc = disciplineDesc == null ? null : disciplineDesc.trim();
    }

    public String getDisciplineIsuesd() {
        return disciplineIsuesd;
    }

    public void setDisciplineIsuesd(String disciplineIsuesd) {
        this.disciplineIsuesd = disciplineIsuesd == null ? null : disciplineIsuesd.trim();
    }
}