package shch.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class showdata extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  request.setCharacterEncoding("UTF-8");
		  response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		  HttpSession session=request.getSession();
			String systemname1=(String) session.getAttribute("systemname1");
			String systemname2=(String) session.getAttribute("systemname2");
			String systemname3=(String) session.getAttribute("systemname3");
			String systemname4=(String) session.getAttribute("systemname4");
			if((systemname1!=null)&&(!systemname1.equals(""))){
				String scq1=request.getParameter("cq1");
				String szq1=request.getParameter("zq1");
				String syq1=request.getParameter("yq1");
				String sjq1=request.getParameter("jq1");
				if(scq1.equals("")||szq1.equals("")||syq1.equals("")||sjq1.equals("")){
					out.print("<script language='javascript'>alert('请填写权重!');window.location.href='/CloudDMSystem/outputdata.jsp';</script>"); 
				return;
				}
				float cq1=Float.parseFloat(scq1);
				float zq1=Float.parseFloat(request.getParameter("zq1"));
				float yq1=Float.parseFloat(request.getParameter("yq1"));
				float jq1=Float.parseFloat(request.getParameter("jq1"));
				session.setAttribute("cq1", cq1);
				session.setAttribute("zq1", zq1);
				session.setAttribute("yq1", yq1);
				session.setAttribute("jq1", jq1);
				float cep1=(Float) session.getAttribute("cep1");
				float zep1=(Float) session.getAttribute("zep1");
				float yep1=(Float) session.getAttribute("yep1");
				float jep1=(Float) session.getAttribute("jep1");
				float cdf1=cep1*cq1;
				float zdf1=zep1*zq1;
				float ydf1=yep1*yq1;
				float jdf1=jep1*jq1;
				float zf1=cdf1+zdf1+ydf1+jdf1;
				session.setAttribute("cdf1", cdf1);
				session.setAttribute("zdf1", zdf1);
				session.setAttribute("ydf1", ydf1);
				session.setAttribute("jdf1", jdf1);
				session.setAttribute("zf1", zf1);
			}
			if((systemname2!=null)&&(!systemname2.equals(""))){
				String scq2=request.getParameter("cq2");
				String szq2=request.getParameter("zq2");
				String syq2=request.getParameter("yq2");
				String sjq2=request.getParameter("jq2");
				if(scq2.equals("")||szq2.equals("")||syq2.equals("")||sjq2.equals("")){
					out.print("<script language='javascript'>alert('请填写权重!');window.location.href='/CloudDMSystem/outputdata.jsp';</script>"); 
				return;
				}
				float cq2=Float.parseFloat(request.getParameter("cq2"));
				float zq2=Float.parseFloat(request.getParameter("zq2"));
				float yq2=Float.parseFloat(request.getParameter("yq2"));
				float jq2=Float.parseFloat(request.getParameter("jq2"));
				session.setAttribute("cq2", cq2);
				session.setAttribute("zq2", zq2);
				session.setAttribute("yq2", yq2);
				session.setAttribute("jq2", jq2);
				float cep2=(Float) session.getAttribute("cep2");
				float zep2=(Float) session.getAttribute("zep2");
				float yep2=(Float) session.getAttribute("yep2");
				float jep2=(Float) session.getAttribute("jep2");
				float cdf2=cep2*cq2;
				float zdf2=zep2*zq2;
				float ydf2=yep2*yq2;
				float jdf2=jep2*jq2;
				float zf2=cdf2+zdf2+ydf2+jdf2;
				session.setAttribute("cdf2", cdf2);
				session.setAttribute("zdf2", zdf2);
				session.setAttribute("ydf2", ydf2);
				session.setAttribute("jdf2", jdf2);
				session.setAttribute("zf2", zf2);
			}
			if((systemname3!=null)&&(!systemname3.equals(""))){
				String scq3=request.getParameter("cq3");
				String szq3=request.getParameter("zq3");
				String syq3=request.getParameter("yq3");
				String sjq3=request.getParameter("jq3");
				if(scq3.equals("")||szq3.equals("")||syq3.equals("")||sjq3.equals("")){
					out.print("<script language='javascript'>alert('请填写权重!');window.location.href='/CloudDMSystem/outputdata.jsp';</script>"); 
				return;
				}
				float cq3=Float.parseFloat(request.getParameter("cq3"));
				float zq3=Float.parseFloat(request.getParameter("zq3"));
				float yq3=Float.parseFloat(request.getParameter("yq3"));
				float jq3=Float.parseFloat(request.getParameter("jq3"));
				session.setAttribute("cq3", cq3);
				session.setAttribute("zq3", zq3);
				session.setAttribute("yq3", yq3);
				session.setAttribute("jq3", jq3);
				float cep3=(Float) session.getAttribute("cep3");
				float zep3=(Float) session.getAttribute("zep3");
				float yep3=(Float) session.getAttribute("yep3");
				float jep3=(Float) session.getAttribute("jep3");
				float cdf3=cep3*cq3;
				float zdf3=zep3*zq3;
				float ydf3=yep3*yq3;
				float jdf3=jep3*jq3;
				float zf3=cdf3+zdf3+ydf3+jdf3;
				session.setAttribute("cdf3", cdf3);
				session.setAttribute("zdf3", zdf3);
				session.setAttribute("ydf3", ydf3);
				session.setAttribute("jdf3", jdf3);
				session.setAttribute("zf3", zf3);
			}
			if((systemname4!=null)&&(!systemname4.equals(""))){
				String scq4=request.getParameter("cq4");
				String szq4=request.getParameter("zq4");
				String syq4=request.getParameter("yq4");
				String sjq4=request.getParameter("jq4");
				if(scq4.equals("")||szq4.equals("")||syq4.equals("")||sjq4.equals("")){
					out.print("<script language='javascript'>alert('请填写权重!');window.location.href='/CloudDMSystem/outputdata.jsp';</script>"); 
				return;
				}
				float cq4=Float.parseFloat(request.getParameter("cq4"));
				float zq4=Float.parseFloat(request.getParameter("zq4"));
				float yq4=Float.parseFloat(request.getParameter("yq4"));
				float jq4=Float.parseFloat(request.getParameter("jq4"));
				session.setAttribute("cq4", cq4);
				session.setAttribute("zq4", zq4);
				session.setAttribute("yq4", yq4);
				session.setAttribute("jq4", jq4);
				float cep4=(Float) session.getAttribute("cep4");
				float zep4=(Float) session.getAttribute("zep4");
				float yep4=(Float) session.getAttribute("yep4");
				float jep4=(Float) session.getAttribute("jep4");
				float cdf4=cep4*cq4;
				float zdf4=zep4*zq4;
				float ydf4=yep4*yq4;
				float jdf4=jep4*jq4;
				float zf4=cdf4+zdf4+ydf4+jdf4;
				session.setAttribute("cdf4", cdf4);
				session.setAttribute("zdf4", zdf4);
				session.setAttribute("ydf4", ydf4);
				session.setAttribute("jdf4", jdf4);
				session.setAttribute("zf4", zf4);
			}
			out.print("<script language='javascript'>alert('权重修改成功!');window.location.href='/CloudDMSystem/index.jsp';</script>"); 
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
