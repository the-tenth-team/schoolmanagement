package cn.dazky.service.Impl;

import cn.dazky.dao.StudentPaymentMapper;
import cn.dazky.pojo.StudentPayment;
import cn.dazky.service.StudentPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * 学生缴费信息
 *
 * @author Zhike Chen
 * @date 2019/6/3
 **/
@Service
public class StudentPaymentServiceImpl implements StudentPaymentService {
    @Resource
    StudentPaymentMapper studentPaymentMapper;
    /*所有学生缴费信息*/
    @Override
    public List<StudentPayment> findStudentPaymentAll() {
        return studentPaymentMapper.selectByExample(null);
    }
}
