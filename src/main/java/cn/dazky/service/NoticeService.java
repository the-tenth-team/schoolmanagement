package cn.dazky.service;

import cn.dazky.pojo.NoticeInfo;

/**
 * @author Mr.chen
 * @2019-05-26 20:06
 */
public interface NoticeService {
    /**
     * 根据新闻主键获取一个新闻对象
     * @param id
     * @return
     */
    public NoticeInfo getNoticeById(Integer id);
}
