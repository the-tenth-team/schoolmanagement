package cn.dazky.service;

import cn.dazky.pojo.StudentWriteGrade;

import java.util.List;

/**
 * @ClassName StudentWriteGradeService
 * @Description 学生成绩
 * @Auther Zhike Chen
 * @Date 2019/5/30 10:46
 * @Version 1.0
 */
public interface StudentWriteGradeService {
    /**
     * 查询所有成绩
     *
     * @return
     */
    List<StudentWriteGrade> getStudentWriteGradeListAll();
}
