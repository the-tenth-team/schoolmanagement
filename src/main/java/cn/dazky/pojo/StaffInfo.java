package cn.dazky.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师信息管理Bean
 */
public class StaffInfo implements Serializable{

    private static final long serialVersionUID = -1703157541292440129L;
    //教师ID
    private Integer staffId;
    //管理员等级
    private Integer roleId;
    //教师名称
    private String staffName;
    //性别
    private String staffSex;
    //年龄
    private Integer staffAge;
    //籍贯
    private String staffNativePlace;
    //身份证信息
    private String staffIdcard;
    //出生日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date staffBrithday;
    //办公电话
    private String staffOfficePhone;
    //移动电话
    private String staffMobilePhone;
    //Eamil邮箱
    private String staffEamil;
    //地址
    private String staffAddr;
    //QQ号码
    private String staffQq;
    //入职时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date staffEntryTime;
    //学历
    private String staffEductionLevel;
    //标注
    private String staffRemark;
    //类型
    private String staffState;
    //用户名
    private String userNumber;
    //密码
    private String userPassowrd;

    private RoleInfo roleInfo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(String staffNativePlace) {
        this.staffNativePlace = staffNativePlace == null ? null : staffNativePlace.trim();
    }

    public String getStaffIdcard() {
        return staffIdcard;
    }

    public void setStaffIdcard(String staffIdcard) {
        this.staffIdcard = staffIdcard == null ? null : staffIdcard.trim();
    }

    public Date getStaffBrithday() {
        return staffBrithday;
    }

    public void setStaffBrithday(Date staffBrithday) {
        this.staffBrithday = staffBrithday;
    }

    public String getStaffOfficePhone() {
        return staffOfficePhone;
    }

    public void setStaffOfficePhone(String staffOfficePhone) {
        this.staffOfficePhone = staffOfficePhone == null ? null : staffOfficePhone.trim();
    }

    public String getStaffMobilePhone() {
        return staffMobilePhone;
    }

    public void setStaffMobilePhone(String staffMobilePhone) {
        this.staffMobilePhone = staffMobilePhone == null ? null : staffMobilePhone.trim();
    }

    public String getStaffEamil() {
        return staffEamil;
    }

    public void setStaffEamil(String staffEamil) {
        this.staffEamil = staffEamil == null ? null : staffEamil.trim();
    }

    public String getStaffAddr() {
        return staffAddr;
    }

    public void setStaffAddr(String staffAddr) {
        this.staffAddr = staffAddr == null ? null : staffAddr.trim();
    }

    public String getStaffQq() {
        return staffQq;
    }

    public void setStaffQq(String staffQq) {
        this.staffQq = staffQq == null ? null : staffQq.trim();
    }

    public Date getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(Date staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffEductionLevel() {
        return staffEductionLevel;
    }

    public void setStaffEductionLevel(String staffEductionLevel) {
        this.staffEductionLevel = staffEductionLevel == null ? null : staffEductionLevel.trim();
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark == null ? null : staffRemark.trim();
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getUserPassowrd() {
        return userPassowrd;
    }

    public void setUserPassowrd(String userPassowrd) {
        this.userPassowrd = userPassowrd == null ? null : userPassowrd.trim();
    }

    @Override
    public String toString() {
        return "StaffInfo{" +
                "staffId=" + staffId +
                ", roleId=" + roleId +
                ", staffName='" + staffName + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffAge=" + staffAge +
                ", staffNativePlace='" + staffNativePlace + '\'' +
                ", staffIdcard='" + staffIdcard + '\'' +
                ", staffBrithday=" + staffBrithday +
                ", staffOfficePhone='" + staffOfficePhone + '\'' +
                ", staffMobilePhone='" + staffMobilePhone + '\'' +
                ", staffEamil='" + staffEamil + '\'' +
                ", staffAddr='" + staffAddr + '\'' +
                ", staffQq='" + staffQq + '\'' +
                ", staffEntryTime=" + staffEntryTime +
                ", staffEductionLevel='" + staffEductionLevel + '\'' +
                ", staffRemark='" + staffRemark + '\'' +
                ", staffState='" + staffState + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userPassowrd='" + userPassowrd + '\'' +
                ", roleInfo=" + roleInfo +
                '}';
    }
}