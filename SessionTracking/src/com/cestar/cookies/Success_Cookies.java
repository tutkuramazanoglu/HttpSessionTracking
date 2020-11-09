package com.cestar.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success_Cookies
 */
@WebServlet("/Success_Cookies")
public class Success_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success_Cookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=null;
		String password=null;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Cookie[] cookies=request.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("user") ) {
				name=c.getValue();
			}
		}
		Cookie[] cookies1=request.getCookies();
		for(Cookie c:cookies1) {
			if(c.getName().equals("psw") ) {
				password=c.getValue();
			}
		}
		out.print("<h3>Hello ] "+password+" you are on succesfully log in!!</h3>");

		out.print("<h3>Hello dear "+name+" you are on succesfully log in!!</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
