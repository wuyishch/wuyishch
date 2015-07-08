package shch.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shch.domain.User;
import shch.service.BusinessService;
import shch.service.impl.BusinessServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 request.setCharacterEncoding("UTF-8"); 
		 response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String yzm=request.getParameter("yzm");
		String yzm_s=(String) request.getSession().getAttribute("imagecheckcode");
		BusinessService service = new BusinessServiceImpl();
		User user = service.loginUser(username, password);
		if((user==null)){
			PrintWriter out=response.getWriter();     //初始化out对象
			out.print("<script language='javascript'>alert('用户名或密码错误!');window.location.href='/CloudDMSystem/login.jsp';</script>");                    //弹框提示，点击确定后返回登录界面
			//request.getRequestDispatcher("/login.jsp").forward(request, response);
			//response.sendRedirect("/CloudDMSystem/login.html");
			return;
		}
		if(!(yzm_s.equals(yzm))){
			request.getSession().setAttribute("username", username);
			request.getSession().setAttribute("password", password);
			PrintWriter out=response.getWriter();     //初始化out对象
			out.print("<script language='javascript'>alert('验证码输入错误!');window.location.href='/CloudDMSystem/loginto.jsp';</script>");                    //弹框提示，点击确定后返回登录界面
			//request.getRequestDispatcher("/login.jsp").forward(request, response);
			//response.sendRedirect("/CloudDMSystem/login.html");
			return;
		}
		
		request.getSession().setAttribute("user", user);
		request.getSession().setAttribute("username", username);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	    //response.sendRedirect("/CloudDMSystem/index.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}


}
