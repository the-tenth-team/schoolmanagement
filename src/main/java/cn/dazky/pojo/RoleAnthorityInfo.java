package cn.dazky.pojo;

public class RoleAnthorityInfo {
    private Integer roleAnthorityId;

    private Integer roleId;

    private Integer anthortyId;

    private AnthortyInfo anthortyInfo;

    public AnthortyInfo getAnthortyInfo() {
        return anthortyInfo;
    }

    public void setAnthortyInfo(AnthortyInfo anthortyInfo) {
        this.anthortyInfo = anthortyInfo;
    }

    public Integer getRoleAnthorityId() {
        return roleAnthorityId;
    }

    public void setRoleAnthorityId(Integer roleAnthorityId) {
        this.roleAnthorityId = roleAnthorityId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAnthortyId() {
        return anthortyId;
    }

    public void setAnthortyId(Integer anthortyId) {
        this.anthortyId = anthortyId;
    }

    @Override
    public String toString() {
        return "RoleAnthorityInfo{" +
                "roleAnthorityId=" + roleAnthorityId +
                ", roleId=" + roleId +
                ", anthortyId=" + anthortyId +
                ", anthortyInfo=" + anthortyInfo +
                '}';
    }
}