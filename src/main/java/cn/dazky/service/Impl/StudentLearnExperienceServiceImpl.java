package cn.dazky.service.Impl;

import cn.dazky.dao.StudentLearnExperienceMapper;
import cn.dazky.pojo.StudentLearnExperience;
import cn.dazky.service.StudentLearnExperienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生学习经历
 *
 * @author Zhike Chen
 * @date 2019/6/2
 **/
@Service
public class StudentLearnExperienceServiceImpl implements StudentLearnExperienceService {
    @Resource
    StudentLearnExperienceMapper studentLearnExperienceMapper;

    /*所有学生学习经历*/
    @Override
    public List<StudentLearnExperience> getStudentLearnExperienceAll() {
        return studentLearnExperienceMapper.selectByExample(null);
    }
}
