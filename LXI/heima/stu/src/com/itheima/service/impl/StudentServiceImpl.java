package com.itheima.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.StudentDao;
import com.itheima.dao.impl.StudentDaoImpl;
import com.itheima.domain.PageBean;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;

/**
 * 这是学生业务实现
 * 
 * @author LXI
 *
 */
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> findAll(int rowCount) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		return dao.findAll(rowCount);
	}

	@Override
	public void insert(Student student) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		dao.insert(student);
	}

	@Override
	public void delete(String sid) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		dao.delete(sid);
	}

	@Override
	public List<Student> find(String sid) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		return dao.find(sid);
	}

	@Override
	public void update(Student student) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		dao.update(student);
	}

	@Override
	public List<Student> findAll(String sname, String gender) throws SQLException {
		StudentDao dao = new StudentDaoImpl();
		return dao.findAll(sname, gender);
	}

	@Override
	public PageBean findStudentByPage(int currentPage) throws SQLException {

		// 封装分页的该页数据
		PageBean<Student> pageBean = new PageBean<>();
		int pageSize = StudentDao.PAGE_SIZE;
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageSize(pageSize);
		StudentDao dao = new StudentDaoImpl();
		List<Student> list = dao.findStudentByPage(currentPage);
		pageBean.setList(list);

		// 总的记录数，总的页数。
		int totalSize = dao.findCount();
		pageBean.setTotalSize(totalSize);// 设置总的记录数
		// 200，10==20 201，10 = 21 201%10 == 0？201/10：201%10 +1
		pageBean.setTotalPage(totalSize % pageSize == 0 ? totalSize / pageSize : (totalSize / pageSize) + 1);
		return pageBean;
	}

}
