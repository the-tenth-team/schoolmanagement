package cn.dazky.service.Impl;

import cn.dazky.dao.StudentWriteGradeMapper;
import cn.dazky.pojo.StudentWriteGrade;
import cn.dazky.service.StudentWriteGradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentWriteGradeServiceImpl
 * @Description 学生成绩
 * @Auther Zhike Chen
 * @Date 2019/5/30 10:48
 * @Version 1.0
 */
@Service
public class StudentWriteGradeServiceImpl implements StudentWriteGradeService {
    @Resource
    StudentWriteGradeMapper studentWriteGradeMapper;

    /**
     * 查询所有成绩
     *
     * @return
     */
    @Override
    public List<StudentWriteGrade> getStudentWriteGradeListAll() {
        return studentWriteGradeMapper.selectByExample(null);
    }
}
