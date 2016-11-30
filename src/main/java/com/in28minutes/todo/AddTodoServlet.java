package com.in28minutes.todo;

import java.io.IOException;
//import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TodoService todoService = new TodoService();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int id = name.hashCode();
        if (id < 0) {
            id *= -1;
        }
        //hashCode is better ID, because it's same for same "name." Doesn't let you add duplicate Todos.
        request.setAttribute("todos", todoService.addTodo(id, name));
        response.sendRedirect("/list-todo.do");
    }
}
