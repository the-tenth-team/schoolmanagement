package cn.dazky.service.Impl;

import cn.dazky.dao.StudentFamilyMemberMapper;
import cn.dazky.pojo.StudentFamilyMember;
import cn.dazky.service.StudentFamilyMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * 学生家庭成员
 * @author Zhike Chen
 * @date 2019/6/3
 **/
@Service
public class StudentFamilyMemberServiceImpl implements StudentFamilyMemberService {
    @Resource
    StudentFamilyMemberMapper studentFamilyMemberMapper;
    /*查询所有学生家庭成员*/
    @Override
    public List<StudentFamilyMember> getStudentFamilyMemberAll() {
        return studentFamilyMemberMapper.selectByExample(null);
    }
}
