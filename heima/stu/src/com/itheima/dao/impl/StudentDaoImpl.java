package com.itheima.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.util.JDBCUtil02;

public class StudentDaoImpl implements StudentDao {
    /**
     * 查询所有学生
     * @exception SQLException
     */
    @Override
    public List<Student> findAll() throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from stu";
        return runner.query(sql, new BeanListHandler<Student>(Student.class));
    }

    /**
     * 添加学生
     * @param
     */
    @Override
    public void insert(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "insert into stu values(null,?,?,?,?,?,?)";
        runner.update(sql, student.getSname(), student.getGender(), student.getPhone(), student.getBirthday(), student.getHobby(), student.getInfo());

    }

    /**
     * 删除学生
     * @param
     */
    @Override
    public void delete(String sid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "delete from stu where sid=?";
        runner.update(sql, sid);
    }

}
