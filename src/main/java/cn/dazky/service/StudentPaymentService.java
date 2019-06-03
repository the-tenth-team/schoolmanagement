package cn.dazky.service;

import cn.dazky.pojo.StudentPayment;

import java.util.List;

/**
 * 学生缴费信息
 *
 * @author Zhike Chen
 * @date 2019/6/3
 **/
public interface StudentPaymentService {
    /*所有学生缴费信息*/
    List<StudentPayment> findStudentPaymentAll();
}
