package com.abc.servlet;

import com.abc.beans.Student;
import com.abc.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class RegisterServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response) throws
            javax.servlet.ServletException, IOException {
        //1.获取请求参数name和age
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age = Integer.valueOf(ageStr);

        //2.封装成student对象
        Student student = new Student(name,age);

        //3.读取配置文件获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext
                ("applicationContest.xml");

        //4.从容器中读取Service对象
        IStudentService studentService = (IStudentService)ac.getBean
                ("studentService");

        //5.调用service中的saveStudent()方法将student对象写入DB
        studentService.saveStudent(student);

        //6.页面跳转
        response.sendRedirect(request.getContextPath()+"/welcome.jsp");
    }

}
