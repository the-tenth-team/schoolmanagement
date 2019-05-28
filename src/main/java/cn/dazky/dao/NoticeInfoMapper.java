package cn.dazky.dao;

import cn.dazky.pojo.NoticeInfo;
import cn.dazky.pojo.NoticeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeInfoMapper {
    NoticeInfo noticeForIndex(Integer noticeId);

    int countByExample(NoticeInfoExample example);

    int deleteByExample(NoticeInfoExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(NoticeInfo record);

    int insertSelective(NoticeInfo record);


    List<NoticeInfo> selectByExampleWithBLOBs(NoticeInfoExample example);

    List<NoticeInfo> selectByExample(NoticeInfoExample example);

    NoticeInfo selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") NoticeInfo record, @Param("example") NoticeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") NoticeInfo record, @Param("example") NoticeInfoExample example);

    int updateByExample(@Param("record") NoticeInfo record, @Param("example") NoticeInfoExample example);

    int updateByPrimaryKeySelective(NoticeInfo record);

    int updateByPrimaryKeyWithBLOBs(NoticeInfo record);

    int updateByPrimaryKey(NoticeInfo record);
}