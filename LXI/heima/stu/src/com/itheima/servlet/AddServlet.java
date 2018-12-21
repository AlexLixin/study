package com.itheima.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class AddServlet
 * 用于处理学生的添加请求
 * @author LXI
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); //$NON-NLS-1$

        try {
            //1.获取客户端提交上来的数据
            String sname = request.getParameter("sname"); //$NON-NLS-1$
            String gender = request.getParameter("gender"); //$NON-NLS-1$
            String phone = request.getParameter("phone"); //$NON-NLS-1$
            String birthday = request.getParameter("birthday"); //$NON-NLS-1$
            String h = Arrays.toString(request.getParameterValues("hobby")); //$NON-NLS-1$
            String hobby = h.substring(1,h.length()-1);
            String info = request.getParameter("info"); //$NON-NLS-1$

            //2.添加到数据库
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday); //$NON-NLS-1$
            Student student = new Student(sname, gender, phone, hobby, info, date);
            StudentService service = new StudentServiceImpl();
            service.insert(student);
            
            //3.跳转到列表页
            request.getRequestDispatcher("/StudentListServlet").forward(request, response); //$NON-NLS-1$
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
