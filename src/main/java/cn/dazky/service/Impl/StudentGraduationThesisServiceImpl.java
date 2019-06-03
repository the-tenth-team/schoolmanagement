package cn.dazky.service.Impl;

import cn.dazky.dao.StudentGraduationThesisMapper;
import cn.dazky.pojo.StudentGraduationThesis;
import cn.dazky.service.StudentGraduationThesisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 毕业论文和科研训练
 *
 * @author Zhike Chen
 * @date 2019/6/3
 **/
@Service
public class StudentGraduationThesisServiceImpl implements StudentGraduationThesisService {
    @Resource
    StudentGraduationThesisMapper studentGraduationThesisMapper;

    /*查询所有毕业论文和科研训练*/
    @Override
    public List<StudentGraduationThesis> getStudentGraduationThesis() {
        return studentGraduationThesisMapper.selectByExample(null);
    }
}
