package cn.dazky.service.Impl;

import cn.dazky.dao.NoticeInfoMapper;
import cn.dazky.pojo.NoticeInfo;
import cn.dazky.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Mr.chen
 * @2019-05-26 20:07
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    NoticeInfoMapper noticeInfoMapper;
    public NoticeInfo getNoticeById(Integer id){
        return noticeInfoMapper.noticeForIndex(id);
    }

}
