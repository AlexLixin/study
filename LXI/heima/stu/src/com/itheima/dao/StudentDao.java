package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import com.itheima.domain.*;

public interface StudentDao {
    /**
     * 查询所有学生
     * @return List<Student>
     */
    List<Student> findAll() throws SQLException;

    /**
     * 添加学生
     * @param student 需要添加到数据库的学生
     * @throws SQLException
     */
    void insert(Student student) throws SQLException;

    /**
     * 删除学生
     * @param sid 需要删除的学生的id
     * @throws SQLException
     */
    void delete(String sid) throws SQLException;
}
