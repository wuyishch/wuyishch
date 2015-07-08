package shch.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import shch.domain.User;
import shch.exception.UserExistException;
import shch.service.BusinessService;
import shch.service.impl.BusinessServiceImpl;
import shch.Utils.WebUtils;
import shch.formbean.RegisterFormBean;

public class RegisterServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RegisterFormBean formbean = WebUtils.request2Bean(request, RegisterFormBean.class);
		
		//�?У��
		if(formbean.validate()==false){
			request.setAttribute("formbean", formbean);
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request,response);
			return;
		}
		
		//�ѱ?�������䵽javabean��
		User user = new User();
		
		try {
			//ע���ַ����ڵ�ת����
			ConvertUtils.register(new DateLocaleConverter(), Date.class);
			BeanUtils.copyProperties(user, formbean);
			user.setId(WebUtils.makeId());
			BusinessService service = new BusinessServiceImpl();
			service.registerUser(user);
			
			request.setAttribute("message", "ע��ɹ�����");
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			
		}catch (UserExistException e) {
			formbean.getErrors().put("username", "ע���û��Ѵ��ڣ���");
			request.setAttribute("formbean", formbean);
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();  //�ں�̨��¼�쳣
			request.setAttribute("message", "�Բ���ע��ʧ�ܣ���");
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	

}
