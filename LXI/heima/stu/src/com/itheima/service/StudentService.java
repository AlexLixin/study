package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.domain.Student;

/**
 * 这是学生的业务处理规则
 * @author LXI
 *
 */
public interface StudentService {
    List<Student> findAll() throws SQLException;

    void insert(Student student) throws SQLException;

    void delete(String sid)throws SQLException;
}
