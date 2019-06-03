package cn.dazky.service;

import cn.dazky.pojo.StaffInfo;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/5/28 19:03
 */
public interface StaffService {

    /**
     * 后台管理员登陆
     * @param user_number
     * @return
     */
    public StaffInfo login(String user_number);

    /**
     * 获取教师的人数
     * @return
     */
    Integer getStaffCount();

    /**
     * 更新员工
     * @param staffInfo
     */
    void update(StaffInfo staffInfo);

    /**
     * 根据员工id获取员工的信息
     * @param staffId  员工id
     * @return
     */
    StaffInfo getStaffById(Integer staffId);
}
