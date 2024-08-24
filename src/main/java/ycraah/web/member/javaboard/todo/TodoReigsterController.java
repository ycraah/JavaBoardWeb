package ycraah.web.member.javaboard.todo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/todo/register")
public class TodoReigsterController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("입력 화면을 볼 수 있도록 구성");

    RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/register.jsp");
    dispatcher.forward(req, resp);
  }
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("입력을 처리하고 목록 페이지로 이동");

    resp.sendRedirect("/todo/list");
  }
}
