package com.mjlf.test;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test
 * @Author mjlft
 * @Date 2020/3/15 18:17
 * @Version 1.0
 * @Description TODO
 */
@WebServlet("/webtest")
public class Test extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到/webtest请求");
        resp.getWriter().write("哈哈哈");
    }
}
