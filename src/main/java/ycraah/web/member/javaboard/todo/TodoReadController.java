package ycraah.web.member.javaboard.todo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ycraah.web.member.javaboard.todo.dto.TodoDTO;
import ycraah.web.member.javaboard.todo.service.TodoService;

import java.io.IOException;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("/todo/read");

    Long id = Long.parseLong(req.getParameter("id"));
    TodoDTO dto = TodoService.INSTANCE.get(id);
    req.setAttribute("dto", dto);
    req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
  }
}
