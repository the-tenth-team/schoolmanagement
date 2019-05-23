package cn.dazky.service.Impl;

import cn.dazky.dao.StudentInfoMapper;
import cn.dazky.pojo.StudentInfo;
import cn.dazky.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-23 9:41
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Override
    public List<StudentInfo> getAllStudent(){
        return studentInfoMapper.selectByExample(null);
    }
}
