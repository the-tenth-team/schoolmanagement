package cn.dazky.service.Impl;

import cn.dazky.dao.AttendanceInfoMapper;
import cn.dazky.pojo.AttendanceInfo;
import cn.dazky.service.AttendanceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AttendanceInfoServiceImpl implements AttendanceInfoService {
    @Resource
    AttendanceInfoMapper attendanceInfoMapper;
    /*查询所有学生考勤信息*/
    @Override
    public List<AttendanceInfo> findAttendanceInfoAll() {
        return attendanceInfoMapper.selectByExample(null);
    }
}
