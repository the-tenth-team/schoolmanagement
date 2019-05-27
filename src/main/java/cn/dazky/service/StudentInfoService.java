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
     * @return
     */
    public List<StudentInfo> getAllStudent();

    /**
     * 获取所有公告信息
     * @return
     */
    public List<NoticeInfo> getAllNotice();
}
