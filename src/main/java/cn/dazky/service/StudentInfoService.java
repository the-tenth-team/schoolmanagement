package cn.dazky.service;

import cn.dazky.pojo.NoticeInfo;
import cn.dazky.pojo.StudentInfo;

import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-23 9:40
 */
public interface StudentInfoService {
    /**
     * 获取所有学生信息
     *
     * @return
     */
    public List<StudentInfo> getAllStudent();

    /**
     * 获取所有公告信息
     *
     * @return
     */
    public List<NoticeInfo> getAllNotice();

    /**
     * @description: 学生信息分页
     * @author Zhike Chen
     * @date 2019/5/29 21:43
     */
    List<StudentInfo> getStudentInfoAll();

    /**
     * 获取学生的总数
     *
     * @return
     */
    public Integer getStudentCount();
}
