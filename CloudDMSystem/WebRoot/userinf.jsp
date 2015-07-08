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

    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span3">
          <div class="well sidebar-nav">
            <ul class="nav nav-list">
              <li class="nav-header"><i class="icon-wrench"></i>User Information</li>
              <li class="active"><a href="userinf.jsp">个人信息</a></li>
              <li><a href="updateuser.jsp">更新信息</a></li>
               <li><a href="changepsw.jsp">修改密码</a></li>
              <li class="nav-header"><i class="icon-signal"></i>Data Management</li>
              <li><a href="inputdata.jsp">输入数据</a></li>
              <li><a href="showdata.jsp">修改权重</a></li>
              <li><a href="result.jsp">显示结果</a></li>
              <li class="nav-header"><i class="icon-user"></i> Help</li>
              <li><a href="help.jsp">帮助</a></li>
			  <li><a href="/CloudDMSystem/LogoutServlet">注销</a></li> 
            </ul>
          </div>
        </div>
        <div class="span9">
		  <div class="row-fluid">
			<div class="page-header">
				<h1>基本信息 <small>Basic Information</small></h1>
			</div>
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="name">姓名：${user.username }</label>
						<div class="controls">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="email">E-mail：${user.email }</label>
						<div class="controls">
						
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="pnohe">联系方式：${user.phone }</label>
						<div class="controls">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="city">地址：${user.city }</label>
						<div class="controls">

						</div>
					</div>	
					<div class="control-group">
						<label class="control-label" for="role">用户权限：User</label>
					</div>	
					<div class="form-actions">
					</div>					
				</fieldset>
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
