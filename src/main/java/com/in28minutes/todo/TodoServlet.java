package com.in28minutes.todo;

import java.io.IOException;
//import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/todo.do")
public class TodoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TodoService todoService = new TodoService();
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
// Next 2 lines are unnecessary. Taken care of by line 41 in LoginServlet.java.
//        String name = (String) request.getSession().getAttribute("name");
//        request.setAttribute("name", name);
        request.setAttribute("todos", todoService.retrieveTodos());
	    request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Random rand = new Random();
        String name = request.getParameter("name");
        
        // rand.nextInt((max - min) + 1) + min --- makes random # from min to max
        // int id = rand.nextInt((100 - 4) + 1) + 4;
        
        //hashCode is better ID, because it's same for same "name." Doesn't let you add duplicate Todos.
        int id = name.hashCode(); 
        request.setAttribute("todos", todoService.addTodo(id, name));
        response.sendRedirect("/todo.do");
    }
}
