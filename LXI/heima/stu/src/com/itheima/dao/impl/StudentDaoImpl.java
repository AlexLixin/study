package com.itheima.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.util.JDBCUtil02;
import static com.itheima.util.StringUtils.isEmpty;

public class StudentDaoImpl implements StudentDao {
    /**
     * 查询所有学生
     * @exception SQLException
     */
    @Override
    public List<Student> findAll(int rowCount) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from stu"+" limit "+ rowCount; //$NON-NLS-1$
        return runner.query(sql, new BeanListHandler<Student>(Student.class));
    }

    /**
     * 添加学生
     * @param
     */
    @Override
    public void insert(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "insert into stu values(null,?,?,?,?,?,?)"; //$NON-NLS-1$
        runner.update(sql, student.getSname(), student.getGender(), student.getPhone(), student.getBirthday(), student.getHobby(), student.getInfo());

    }

    /**
     * 删除学生
     * @param
     */
    @Override
    public void delete(String sid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "delete from stu where sid=?"; //$NON-NLS-1$
        runner.update(sql, sid);
    }

    /**
     * 查找学生
     * @param sid
     * @return
     *
     */
    @Override
    public List<Student> find(String sid) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "SELECT * FROM stus.stu where sid=?"; //$NON-NLS-1$
        return runner.query(sql, new BeanListHandler<Student>(Student.class), sid);
    }

    /**
     * 更新学生信息
     * @param sid
     * @return
     *
     */
    @Override
    public void update(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "UPDATE stu SET sname = ?,gender = ?,phone = ?,birthday = ?,hobby = ?,info = ? WHERE sid=?; "; //$NON-NLS-1$
        runner.update(sql, student.getSname(), student.getGender(), student.getPhone(), student.getBirthday(), student.getHobby(), student.getInfo(), student.getSid());
    }

    /**
     * 查询符合条件的学生的信息
     * @param sname gender
     * @return
     *
     */
    @Override
    public List<Student> findAll(String sname, String gender) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
        String sql = "select * from stu where 1=1 "; //$NON-NLS-1$
        List<String> list = new ArrayList<>();
        /*        if (!isEmpty(sname) && !isEmpty(gender)) {
            sql = "Select * from stu where sname like ? AND gender = ?"; //$NON-NLS-1$
            return runner.query(sql, new BeanListHandler<Student>(Student.class), sname, gender);
        }

        if (isEmpty(sname) && isEmpty(gender)) {
            sql = "Select * from stu"; //$NON-NLS-1$
            return runner.query(sql, new BeanListHandler<Student>(Student.class));
        }

        if (isEmpty(sname) || isEmpty(gender)) {
            sql = "Select * from stu where sname like ? OR gender = ?"; //$NON-NLS-1$
            return runner.query(sql, new BeanListHandler<Student>(Student.class), "%" + sname + "%", gender); //$NON-NLS-1$ //$NON-NLS-2$
        }*/

        if (!isEmpty(sname)) {
            sql += " and sname like ?"; //$NON-NLS-1$
            list.add("%" + sname + "%"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if (!isEmpty(gender)) {
            sql += " and gender = ?"; //$NON-NLS-1$
            list.add(gender);
        }

        return runner.query(sql, new BeanListHandler<Student>(Student.class), list.toArray());

    }

}
