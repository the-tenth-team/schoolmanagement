package cn.dazky.service;

import cn.dazky.pojo.StudentLearnExperience;

import java.util.List;

/**
 * 学生学习经历
 *
 * @author Zhike Chen
 * @date 2019/6/2
 **/
public interface StudentLearnExperienceService {
    /*所有学生学习经历*/
    List<StudentLearnExperience> findStudentLearnExperienceAll();
}
