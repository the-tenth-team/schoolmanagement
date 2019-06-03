package cn.dazky.service.Impl;

import cn.dazky.dao.ClassroomInfoMapper;
import cn.dazky.pojo.ClassroomInfo;
import cn.dazky.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Zhong
 * @create2019-06-01 13:47
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Resource
    ClassroomInfoMapper classroomInfoMapper;

    /**
     * 查询所有教室信息
     * @return
     */
    public List<ClassroomInfo> selectByExample(){
        return classroomInfoMapper.selectByExample(null);
    }

}
