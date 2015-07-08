package shch.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class inputdata extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String systemname1=request.getParameter("systemname1");
		System.out.println("fghtgrgg");
		System.out.println(systemname1);
		HttpSession session=request.getSession();
		String systemname2=request.getParameter("systemname2");
		String systemname3=request.getParameter("systemname3");
		String systemname4=request.getParameter("systemname4");
		if(("".equals(systemname1))&&("".equals(systemname2))&&("".equals(systemname3))&&("".equals(systemname4))){
			out.print("<script language='javascript'>alert('请填写相关数据信息!');window.location.href='/CloudDMSystem/inputdata.jsp';</script>"); 
			return;
		}
		if((systemname1!=null)&&(!systemname1.equals(""))){
			float rulenum1=Float.parseFloat(request.getParameter("rulenum1"));
			float cr1=Float.parseFloat(request.getParameter("cr1"));
			float crp1=Float.parseFloat(request.getParameter("crp1"));
		float zr1=Float.parseFloat(request.getParameter("zr1"));
		float zrp1=Float.parseFloat(request.getParameter("zrp1"));
		float yr1=Float.parseFloat(request.getParameter("yr1"));
		float yrp1=Float.parseFloat(request.getParameter("yrp1"));
		float jr1=Float.parseFloat(request.getParameter("jr1"));
		float jrp1=Float.parseFloat(request.getParameter("jrp1"));
		float ce1=cr1/rulenum1;
		float ze1=zr1/rulenum1;
		float ye1=yr1/rulenum1;
		float je1=jr1/rulenum1;
		float cep1=1-crp1/cr1;
		float zep1=1-zrp1/zr1;
		float yep1=1-yrp1/yr1;
		float jep1=1-jrp1/jr1;
		session.setAttribute("systemname1", systemname1);
		session.setAttribute("rulenum1", rulenum1);
		session.setAttribute("cr1", cr1);
		session.setAttribute("crp1", crp1);
		session.setAttribute("zr1", zr1);
		session.setAttribute("zrp1", zrp1);
		session.setAttribute("yr1", yr1);
		session.setAttribute("yrp1", yrp1);
		session.setAttribute("jr1", jr1);
		session.setAttribute("jrp1",jrp1);
		session.setAttribute("ce1", ce1);
		session.setAttribute("ze1", ze1);
		session.setAttribute("ye1", ye1);
		session.setAttribute("je1", je1);
		session.setAttribute("cep1", cep1);
		session.setAttribute("zep1", zep1);
		session.setAttribute("yep1", yep1);
		session.setAttribute("jep1", jep1);
		}
		if((systemname2!=null)&&(!systemname2.equals(""))){
			float rulenum2=Float.parseFloat(request.getParameter("rulenum2"));
			float cr2=Float.parseFloat(request.getParameter("cr2"));
			float crp2=Float.parseFloat(request.getParameter("crp2"));
		float zr2=Float.parseFloat(request.getParameter("zr2"));
		float zrp2=Float.parseFloat(request.getParameter("zrp2"));
		float yr2=Float.parseFloat(request.getParameter("yr2"));
		float yrp2=Float.parseFloat(request.getParameter("yrp2"));
		float jr2=Float.parseFloat(request.getParameter("jr2"));
		float jrp2=Float.parseFloat(request.getParameter("jrp2"));
		float ce2=cr2/rulenum2;
		float ze2=zr2/rulenum2;
		float ye2=yr2/rulenum2;
		float je2=jr2/rulenum2;
		float cep2=1-crp2/cr2;
		float zep2=1-zrp2/zr2;
		float yep2=1-yrp2/yr2;
		float jep2=1-jrp2/jr2;
		session.setAttribute("systemname2", systemname2);
		session.setAttribute("rulenum2", rulenum2);
		session.setAttribute("cr2", cr2);
		session.setAttribute("crp2", crp2);
		session.setAttribute("zr2", zr2);
		session.setAttribute("zrp2", zrp2);
		session.setAttribute("yr2", yr2);
		session.setAttribute("yrp2", yrp2);
		session.setAttribute("jr2", jr2);
		session.setAttribute("jrp2",jrp2);
		session.setAttribute("ce2", ce2);
		session.setAttribute("ze2", ze2);
		session.setAttribute("ye2", ye2);
		session.setAttribute("je2", je2);
		session.setAttribute("cep2", cep2);
		session.setAttribute("zep2", zep2);
		session.setAttribute("yep2", yep2);
		session.setAttribute("jep2", jep2);
		}
		
		if((systemname3!=null)&&(!systemname3.equals(""))){
			float rulenum3=Float.parseFloat(request.getParameter("rulenum3"));
			float cr3=Float.parseFloat(request.getParameter("cr3"));
			float crp3=Float.parseFloat(request.getParameter("crp3"));
		float zr3=Float.parseFloat(request.getParameter("zr3"));
		float zrp3=Float.parseFloat(request.getParameter("zrp3"));
		float yr3=Float.parseFloat(request.getParameter("yr3"));
		float yrp3=Float.parseFloat(request.getParameter("yrp3"));
		float jr3=Float.parseFloat(request.getParameter("jr3"));
		float jrp3=Float.parseFloat(request.getParameter("jrp3"));
		float ce3=cr3/rulenum3;
		float ze3=zr3/rulenum3;
		float ye3=yr3/rulenum3;
		float je3=jr3/rulenum3;
		float cep3=1-crp3/cr3;
		float zep3=1-zrp3/zr3;
		float yep3=1-yrp3/yr3;
		float jep3=1-jrp3/jr3;
		session.setAttribute("systemname3", systemname3);
		session.setAttribute("rulenum3", rulenum3);
		session.setAttribute("cr3", cr3);
		session.setAttribute("crp3", crp3);
		session.setAttribute("zr3", zr3);
		session.setAttribute("zrp3", zrp3);
		session.setAttribute("yr3", yr3);
		session.setAttribute("yrp3", yrp3);
		session.setAttribute("jr3", jr3);
		session.setAttribute("jrp3",jrp3);
		session.setAttribute("ce3", ce3);
		session.setAttribute("ze3", ze3);
		session.setAttribute("ye3", ye3);
		session.setAttribute("je3", je3);
		session.setAttribute("cep3", cep3);
		session.setAttribute("zep3", zep3);
		session.setAttribute("yep3", yep3);
		session.setAttribute("jep3", jep3);
		}
		if((systemname4!=null)&&(!systemname4.equals(""))){
			float rulenum4=Float.parseFloat(request.getParameter("rulenum4"));
			float cr4=Float.parseFloat(request.getParameter("cr4"));
			float crp4=Float.parseFloat(request.getParameter("crp4"));
		float zr4=Float.parseFloat(request.getParameter("zr4"));
		float zrp4=Float.parseFloat(request.getParameter("zrp4"));
		float yr4=Float.parseFloat(request.getParameter("yr4"));
		float yrp4=Float.parseFloat(request.getParameter("yrp4"));
		float jr4=Float.parseFloat(request.getParameter("jr4"));
		float jrp4=Float.parseFloat(request.getParameter("jrp4"));
		float ce4=cr4/rulenum4;
		float ze4=zr4/rulenum4;
		float ye4=yr4/rulenum4;
		float je4=jr4/rulenum4;
		float cep4=1-crp4/cr4;
		float zep4=1-zrp4/zr4;
		float yep4=1-yrp4/yr4;
		float jep4=1-jrp4/jr4;
		session.setAttribute("systemname4", systemname4);
		session.setAttribute("rulenum4", rulenum4);
		session.setAttribute("cr4", cr4);
		session.setAttribute("crp4", crp4);
		session.setAttribute("zr4", zr4);
		session.setAttribute("zrp4", zrp4);
		session.setAttribute("yr4", yr4);
		session.setAttribute("yrp4", yrp4);
		session.setAttribute("jr4", jr4);
		session.setAttribute("jrp4",jrp4);
		session.setAttribute("ce4", ce4);
		session.setAttribute("ze4", ze4);
		session.setAttribute("ye4", ye4);
		session.setAttribute("je4", je4);
		session.setAttribute("cep4", cep4);
		session.setAttribute("zep4", zep4);
		session.setAttribute("yep4", yep4);
		session.setAttribute("jep4", jep4);
		}
		out.print("<script language='javascript'>alert('数据成功录入!');window.location.href='/CloudDMSystem/index.jsp';</script>"); 
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
