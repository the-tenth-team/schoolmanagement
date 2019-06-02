package cn.dazky.service.Impl;

import cn.dazky.dao.StaffInfoMapper;
import cn.dazky.pojo.StaffInfo;
import cn.dazky.pojo.StaffInfoExample;
import cn.dazky.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/5/28 19:04
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffInfoMapper staffInfoMapper;


    @Override
    public StaffInfo login(String user_number) {
        StaffInfoExample staffInfoExample = new StaffInfoExample();
        StaffInfoExample.Criteria criteria = staffInfoExample.createCriteria();
        criteria.andUserNumberEqualTo(user_number);
        List<StaffInfo> staffInfos = staffInfoMapper.selectByExample(staffInfoExample);
        if(staffInfos.size()<=0){
            return null;
        }
        return staffInfos.get(0);
    }
}
