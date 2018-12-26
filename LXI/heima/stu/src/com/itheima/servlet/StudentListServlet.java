package com.itheima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.dao.StudentDao;
import com.itheima.dao.impl.StudentDaoImpl;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentListServlet
 * 查询所有学生信息，呈现到list.jsp上
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //1.查询出来所有的学生
            StudentService service = new StudentServiceImpl();
            //搜索时分页,每页rowCount个
            int rowCount = 5;
            List<Student> list = service.findAll(rowCount);
            request.setAttribute("rowCount", rowCount);
            request.setAttribute("list", list);
            
            //2.先把数据存储到作用域中
            request.getRequestDispatcher("list.jsp").forward(request, response);
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
