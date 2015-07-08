package shch.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shch.domain.User;
import shch.exception.UserExistException;
import shch.service.BusinessService;
import shch.service.impl.BusinessServiceImpl;

public class changepsw extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String oldpassword=request.getParameter("oldpassword");
		String newpassword=request.getParameter("newpassword");
		String newpassword1=request.getParameter("newpassword1");
		User user=(User) request.getSession().getAttribute("user");
		String password_s=user.getPassword();
		if(password_s.equals(oldpassword)&&(newpassword!=null)&&(newpassword.equals(newpassword1))){
			user.setPassword(newpassword);
			BusinessService service = new BusinessServiceImpl();
			try {
				service.updateUser(user);
			} catch (UserExistException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
			out.print("<script language='javascript'>alert('修改密码成功!');window.location.href='/CloudDMSystem/changepsw.jsp';</script>"); 
			return;
		}
		out.print("<script language='javascript'>alert('两次输入的密码不一样!');window.location.href='/CloudDMSystem/changepsw.jsp';</script>"); 
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
