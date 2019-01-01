package com.itheima.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.PageBean;
import com.itheima.service.StudentService;
import com.itheima.service.impl.StudentServiceImpl;

/**
 * 这是用于分页显示学生列表的servlet
 * 
 * @author LXI
 */
@WebServlet("/StudentListPageServlet")
public class StudentListPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentListPageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// 1.获取需要显示的页码数
			int currentPage = Integer.parseInt(request.getParameter("currentPage"));

			// 2.根据指定的页数，去获取该页的数据回来
			StudentService service = new StudentServiceImpl();
			PageBean pageBean = service.findStudentByPage(currentPage);
			request.setAttribute("pageBean", pageBean);

			// 3.跳转界面
			request.getRequestDispatcher("list_page.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
