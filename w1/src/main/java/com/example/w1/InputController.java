package com.example.w1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InputController", urlPatterns = "/input")
public class InputController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InputController....");
        // RequestDispatcher -> 서블릿에서 전달된 요청을 다른 쪽으로 전달
        RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        disp.forward(request,response);
    }
}
