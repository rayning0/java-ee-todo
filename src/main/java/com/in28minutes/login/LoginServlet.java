package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.login.LoginService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginService service = new LoginService();
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	    
//		PrintWriter out = response.getWriter();
//		out.println("<b>Dummy stuff</b><br>");
//		out.println("Raymond");
//	    request.setAttribute("name", request.getParameter("name"));
//	    request.setAttribute("password", request.getParameter("password"));
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        boolean isUserValid = service.validateUser(name, password);
        
        if(isUserValid) {
            request.getSession().setAttribute("name", name);
            response.sendRedirect("/todo.do");
//            request.setAttribute("name", name);
//            request.setAttribute("todos", todoService.retrieveTodos());
//            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Credentials!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
	}
}
