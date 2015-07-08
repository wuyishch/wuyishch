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

public class updateuser extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		 User user=(User) request.getSession().getAttribute("user");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		if(!("".equals(username))){
		user.setUsername(username);
		}
		if(!("".equals(email))){
		user.setEmail(email);
		}
		if(!("".equals(phone))){
		user.setPhone(phone);
		}
		if(!("".equals(city))){
		user.setCity(city);
		}
		if(("".equals(username))&&("".equals(email))&&("".equals(phone))&&("".equals(city))){
			out.print("<script language='javascript'>alert('请输入修改信息!');window.location.href='/CloudDMSystem/updateuser.jsp';</script>"); 
		}
		BusinessService service = new BusinessServiceImpl();
		try {
			service.updateUser(user);
			out.print("<script language='javascript'>alert('信息修改成功!');window.location.href='/CloudDMSystem/index.jsp';</script>"); 
			return;
		} catch (UserExistException e) {
			// TODO Auto-generated catch block
			
			throw new RuntimeException(e);
		}
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
