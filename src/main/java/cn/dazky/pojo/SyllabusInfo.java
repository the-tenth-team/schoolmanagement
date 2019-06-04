package cn.dazky.pojo;

/**
 * 课表信息Bean
 */
public class SyllabusInfo {
    //课程ID
    private Integer syllabusId;
    //星期一
    private String syllabusYi;
    //星期二
    private String syllabusEr;
    //星期三
    private String syllabusSan;
    //星期四
    private String syllabusSi;
    //星期五
    private String syllabusWu;
    //星期六
    private String syllabusLiu;
    //星期日
    private String syllabusQi;
    //是否可用
    private String isUesd;
    //课程表名称
    private String syllabusName;

    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    public String getSyllabusYi() {
        return syllabusYi;
    }

    public void setSyllabusYi(String syllabusYi) {
        this.syllabusYi = syllabusYi == null ? null : syllabusYi.trim();
    }

    public String getSyllabusEr() {
        return syllabusEr;
    }

    public void setSyllabusEr(String syllabusEr) {
        this.syllabusEr = syllabusEr == null ? null : syllabusEr.trim();
    }

    public String getSyllabusSan() {
        return syllabusSan;
    }

    public void setSyllabusSan(String syllabusSan) {
        this.syllabusSan = syllabusSan == null ? null : syllabusSan.trim();
    }

    public String getSyllabusSi() {
        return syllabusSi;
    }

    public void setSyllabusSi(String syllabusSi) {
        this.syllabusSi = syllabusSi == null ? null : syllabusSi.trim();
    }

    public String getSyllabusWu() {
        return syllabusWu;
    }

    public void setSyllabusWu(String syllabusWu) {
        this.syllabusWu = syllabusWu == null ? null : syllabusWu.trim();
    }

    public String getSyllabusLiu() {
        return syllabusLiu;
    }

    public void setSyllabusLiu(String syllabusLiu) {
        this.syllabusLiu = syllabusLiu == null ? null : syllabusLiu.trim();
    }

    public String getSyllabusQi() {
        return syllabusQi;
    }

    public void setSyllabusQi(String syllabusQi) {
        this.syllabusQi = syllabusQi == null ? null : syllabusQi.trim();
    }

    public String getIsUesd() {
        return isUesd;
    }

    public void setIsUesd(String isUesd) {
        this.isUesd = isUesd == null ? null : isUesd.trim();
    }

    public String getSyllabusName() {
        return syllabusName;
    }

    public void setSyllabusName(String syllabusName) {
        this.syllabusName = syllabusName == null ? null : syllabusName.trim();
    }
}