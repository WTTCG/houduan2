package com.fc.controller;



import com.fc.entity.Student;
import com.fc.service.StudentService;
import com.fc.vo.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.example.service.impl.StudentServiceImpl;
@WebServlet("/page")
public class PageServlet extends HttpServlet {
    StudentService studentService=new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("pageNo");
        int pageNo=1;
        if (parameter!=null){
            pageNo=Integer.parseInt(parameter);
        }
        int pageSize=5;
        //通过依赖的传递获取了pageInfo
        PageInfo<Student> pageInfo=studentService.getPageInfo(pageNo,pageSize);
        //设置域对象
        req.setAttribute("pageInfo",pageInfo);
        //发送到前端
        req.getRequestDispatcher("page.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
