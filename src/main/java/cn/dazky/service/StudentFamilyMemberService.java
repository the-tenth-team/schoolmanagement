package cn.dazky.service;

import cn.dazky.pojo.StudentFamilyMember;

import java.util.List;

/**
 * 学生家庭成员
 * @author Zhike Chen
 * @date 2019/6/3
 **/
public interface StudentFamilyMemberService {
    /*查询所有学生家庭成员*/
    List<StudentFamilyMember> getStudentFamilyMemberAll();
}
