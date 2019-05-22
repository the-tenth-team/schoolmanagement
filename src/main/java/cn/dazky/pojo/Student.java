package cn.dazky.pojo;

/**
 * @author Mr.chen
 * @2019-05-22 19:20
 */
public class Student {
    String name;
    String  stuNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                '}';
    }

    public Student(String name, String stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
}
