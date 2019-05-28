package cn.dazky.service.Impl;

import cn.dazky.dao.NoticeInfoMapper;
import cn.dazky.dao.StudentInfoMapper;
import cn.dazky.pojo.NoticeInfo;
import cn.dazky.pojo.StudentInfo;
import cn.dazky.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.chen
 * @2019-05-23 9:41
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {
    @Resource
    StudentInfoMapper studentInfoMapper;
    @Resource
    NoticeInfoMapper noticeInfoMapper;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    @Override
    public List<StudentInfo> getAllStudent(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        List students= (List) redisTemplate.opsForValue().get("allStudents");
        System.out.println("缓存数据"+students);
        if(students!=null)
            return students;
        System.out.println("mapper"+studentInfoMapper);
        List<StudentInfo> list=studentInfoMapper.selectByExample(null);
        redisTemplate.opsForValue().set("allStudents",list);
        return list;
    }
    public List<NoticeInfo> getAllNotice(){
        return noticeInfoMapper.selectByExample(null);
    }
}