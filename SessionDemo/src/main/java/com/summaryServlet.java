package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import DTO.User;

public class summaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public summaryServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User u=new User();
		
		HttpSession session = request.getSession(false);
		
		if (session !=null) {
			
			u= (User) session.getAttribute("user");
			
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAdress(request.getParameter("adress"));
			
			PrintWriter writer = response.getWriter();
			
			writer.println("<h2> Hello "+u.getEmail()+"</h2>");
			writer.println("<h3> Details "+u+"</h3>");
			writer.println("<h4> session Id "+session.getId()+"</h4>");
			writer.println("<h5> session created at "+session.getCreationTime()+"</h5>");
			session.invalidate();
		
		}
		
		
		
	}

}
