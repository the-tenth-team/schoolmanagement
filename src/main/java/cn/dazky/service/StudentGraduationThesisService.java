package cn.dazky.service;

import cn.dazky.pojo.StudentGraduationThesis;

import java.util.List;

/*
 * 毕业论文和科研训练
 * @author Zhike Chen
 * @date 2019/6/3
 **/
public interface StudentGraduationThesisService {
    /*查询所有毕业论文和科研训练*/
    List<StudentGraduationThesis> getStudentGraduationThesis();
}
