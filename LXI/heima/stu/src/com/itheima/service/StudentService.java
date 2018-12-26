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
    List<Student> findAll(int rowCount) throws SQLException;

    void insert(Student student) throws SQLException;

    void delete(String sid)throws SQLException;

    List<Student> find(String sid)throws SQLException;

    void update(Student student)throws SQLException;

    List<Student> findAll(String sname, String gender)throws SQLException;
}
