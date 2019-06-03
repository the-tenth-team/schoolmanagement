package cn.dazky.service;

import cn.dazky.pojo.StudentPracticeSkills;

import java.util.List;

/**
 * 学生社会实践及技能培训
 * @author Zhike Chen
 * @date 2019/6/3
 **/
public interface StudentPracticeSkillsService {
    /*查询所有学生社会实践及技能培训*/
    List<StudentPracticeSkills> getStudentPracticeSkillsAll();
}
