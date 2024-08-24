package ycraah.web.member.javaboard.todo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("/todo/list 실행");
    RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/todo/list.jsp");
    dispatcher.forward(req, resp);
  }
}
