<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>DMSystem</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Admin panel developed with the Bootstrap from Twitter.">
    <meta name="author" content="travis">

    <link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/site.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>
  <body>
    <%
    String username=(String) request.getSession().getAttribute("username");
	if((username==null)||"".equals(username))   response.sendRedirect("login.jsp");                           
%>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">欢迎您，${user.username}</a>
          <div class="btn-group pull-right">
			<a class="btn" href="userinf.jsp"><i class="icon-user"></i> ${user.username}</a>
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
			  <li><a href="userinf.jsp">我的资料</a></li>
              <li class="divider"></li>
              <li><a href="/CloudDMSystem/LogoutServlet">退出</a></li>
            </ul>
          </div>
          <div class="nav-collapse">
            <ul class="nav">
			<li><a href="index.jsp">主页</a></li>
              <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">用户信息 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="userinf.jsp">个人信息</a></li>
					<li class="divider"></li>
					<li><a href="updateuser.jsp">更新信息 </a></li>
					<li class="divider"></li>
					<li><a href="changepsw.jsp">修改密码 </a></li>
				</ul>
			  </li>
              <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">服务 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="inputdata.jsp"">输入数据</a></li>
					<li class="divider"></li>
					<li><a href="showdata.jsp">修改权重</a></li>
					<li class="divider"></li>
					<li><a href="result.jsp">分析结果</a></li>
				</ul>
			  </li>
			  <li><a href="help.jsp">帮助</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>

  
        <div class="span9">
		  <div class="row-fluid">
			<div class="page-header">
				<h1>数据输入 <small>Input Data</small></h1>
			</div>
			<form class="form-horizontal" action="/CloudDMSystem/inputdata" method="post">
				<fieldset>
		<div class="control-group">
						<table border="1" align="center">
     <caption>数据质量评分体系权重估算表（完整性，准确性）</caption>
    <tr>
  <td   rowspan="3" align="center">系统名称</td>
    <td   rowspan="3" align="center">指标规则总数</td>
    <td   colspan="2" align="center">完整性</td>
     <td    colspan="2" align="center">准确性</td>
    </tr>
    <tr>

    </tr>
    <tr>
        <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
        <td  align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
    </tr>
    <tr> 
      <td><input name="systemname1" type="text"  width="5%"> </td>
      <td> <input name="rulenum1" type="text"  size="5"></td>
      <td> <input name="cr1" type="text"  size="5"></td>
      <td> <input name="crp1" type="text"  size="5"></td>
      <td> <input name="zr1" type="text"  size="5"></td>
      <td> <input name="zrp1" type="text"  size="5"></td>
    </tr>
    <tr> 
      <td><input name="systemname2" type="text" size="5" > </td>
      <td> <input name="rulenum2" type="text"  size="5"></td>
      <td> <input name="cr2" type="text"  size="5"></td>
      <td> <input name="crp2" type="text"  size="5"></td>
      <td> <input name="zr2" type="text"  size="5"></td>
      <td> <input name="zrp2" type="text"  size="5"></td>
    </tr>
    <tr> 
      <td><input name="systemname3" type="text"  size="5"> </td>
      <td> <input name="rulenum3" type="text"  size="5"></td>
      <td> <input name="cr3" type="text"  size="5"></td>
      <td> <input name="crp3" type="text"  size="5"></td>
      <td> <input name="zr3" type="text"  size="5"></td>
      <td> <input name="zrp3" type="text"  size="5"></td>
    </tr>
     <tr> 
      <td><input name="systemname4" type="text"  size="5"> </td>
      <td> <input name="rulenum4" type="text"  size="5"></td>
      <td> <input name="cr4" type="text"  size="5"></td>
      <td> <input name="crp4" type="text"  size="5"></td>
      <td> <input name="zr4" type="text"  size="5"></td>
      <td> <input name="zrp4" type="text"  size="5"></td>
    </tr>
  </table>
     <br/>    <br/>
   <table border="1" align="center">
     <caption>数据质量评分体系权重估算表（及时性，一致性）</caption>
    <tr>
  <td   rowspan="3" align="center">系统名称</td>
    <td  rowspan="3" align="center">指标规则总数</td>
    <td     colspan="2" align="center">一致性</td>
    <td    colspan="2" align="center">及时性</td>
    </tr>
    <tr>

    </tr>
    <tr>
             <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
             <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
    </tr>
    <tr> 
      <td><input name="systemname1" type="text"  > </td>
      <td> <input name="rulenum1" type="text"  size="16"></td>
      <td> <input name="yr1" type="text"  size="16"></td>
      <td> <input name="yrp1" type="text"  size="16"></td>
      <td> <input name="jr1" type="text"  size="16"></td>
      <td> <input name="jrp1" type="text"  size="16"></td> 
    </tr>
    <tr> 
      <td><input name="systemname2" type="text"  > </td>
      <td> <input name="rulenum2" type="text"  size="16"></td>
      <td> <input name="yr2" type="text"  size="16"></td>
      <td> <input name="yrp2" type="text"  size="16"></td>
      <td> <input name="jr2" type="text"  size="16"></td>
      <td> <input name="jrp2" type="text"  size="16"></td>  
    </tr>
    <tr> 
      <td><input name="systemname3" type="text"  > </td>
      <td> <input name="rulenum3" type="text"  size="16"></td>
      <td> <input name="yr3" type="text"  size="16"></td>
      <td> <input name="yrp3" type="text"  size="16"></td>
      <td> <input name="jr3" type="text"  size="16"></td>
      <td> <input name="jrp3" type="text"  size="16"></td>  
    </tr>
     <tr> 
      <td><input name="systemname4" type="text"  > </td>
      <td> <input name="rulenum4" type="text"  size="16"></td>
      <td> <input name="yr4" type="text"  size="16"></td>
      <td> <input name="yrp4" type="text"  size="16"></td>
      <td> <input name="jr4" type="text"  size="16"></td>
      <td> <input name="jrp4" type="text"  size="16"></td>
    </tr>
  </table>
   </div>
			
					<div class="form-actions" align="center">
						<input type="submit" class="btn btn-success btn-large" value="提交" /> <a class="btn" href="index.jsp">返回</a>
					</div>					
				</fieldset>
			</form>
		  </div>
        </div>
      </div>

      <hr>

      <footer class="well">
       &copy; 2015 Cloud Data Management <a href="/login.jsp" target="_blank" title="shch®CDM"></a> - Contact information <a href="mailto:wuyishch@gmail.com">wuyishch@gmail.com</a>
      </footer>

    </div>

    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
  </body>
</html>
