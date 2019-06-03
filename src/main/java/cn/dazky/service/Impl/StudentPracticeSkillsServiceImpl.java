package cn.dazky.service.Impl;

import cn.dazky.dao.StudentPracticeSkillsMapper;
import cn.dazky.pojo.StudentPracticeSkills;
import cn.dazky.service.StudentPracticeSkillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * 学生社会实践及技能培训
 * @author Zhike Chen
 * @date 2019/6/3
 **/
@Service
public class StudentPracticeSkillsServiceImpl implements StudentPracticeSkillsService {
    @Resource
    StudentPracticeSkillsMapper studentPracticeSkillsMapper;
    /*查询所有学生社会实践及技能培训*/
    @Override
    public List<StudentPracticeSkills> getStudentPracticeSkillsAll() {
        return studentPracticeSkillsMapper.selectByExample(null);
    }
}
