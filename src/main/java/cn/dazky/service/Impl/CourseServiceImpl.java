package cn.dazky.service.Impl;

import cn.dazky.dao.DisciplineInfoMapper;
import cn.dazky.dao.SyllabusInfoMapper;
import cn.dazky.pojo.DisciplineInfo;
import cn.dazky.pojo.SyllabusInfo;
import cn.dazky.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程信息业务实现类
 *
 * @author Mr.Zhong
 * @create2019-05-28 9:33
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    DisciplineInfoMapper disciplineInfoMapper;

    @Resource
    SyllabusInfoMapper syllabusInfoMapper;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    /**
     * 查询所有课程信息
     *
     * @return
     */
    public List<DisciplineInfo> selectByExample() {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        List Course = (List) redisTemplate.opsForValue().get("allCourse");
//        if (Course != null)
//            return Course;
//        List<DisciplineInfo> list = disciplineInfoMapper.selectByExample(null);
//        redisTemplate.opsForValue().set("allCourse", list);
//        return list;
        return disciplineInfoMapper.selectByExample(null);
    }

    /**
     *查询所有课程表信息
     *
     * @return
     */
    public List<SyllabusInfo> syllabusInfoList(){
        return syllabusInfoMapper.selectByExample(null);
    }


}
