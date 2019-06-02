package cn.dazky.service;

import cn.dazky.pojo.AttendanceInfo;

import java.util.List;

/**
 * 考勤管理
 * @author Zhike Chen
 * @date 2019/6/2
 **/
public interface AttendanceInfoService {
    /*查询所有学生考勤信息*/
     List<AttendanceInfo> findAttendanceInfoAll();
}
