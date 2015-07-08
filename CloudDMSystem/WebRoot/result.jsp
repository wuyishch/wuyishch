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
              <li ><a href="userinf.jsp">个人信息</a></li>
              <li><a href="updateuser.jsp">更新信息</a></li>
              <li><a href="changepsw.jsp">修改密码</a></li>
              <li class="nav-header"><i class="icon-signal"></i>Data Management</li>
              <li><a href="inputdata.jsp">输入数据</a></li>
              <li><a href="showdata.jsp">修改权重</a></li>
              <li class="active"><a href="result.jsp">显示结果</a></li>
              <li class="nav-header"><i class="icon-user"></i> Help</li>
              <li><a href="help.jsp">帮助</a></li>
			  <li><a href="/CloudDMSystem/LogoutServlet">注销</a></li> 
            </ul>
          </div>
        </div>
   <div class="span9">
		  <div class="row-fluid">
			<div class="page-header">
				<h1>分析结果 <small>Analise Result</small></h1>
			</div>
			<form class="form-horizontal" action="/CloudDMSystem/download" method="post">
				<fieldset>
		<div class="control-group">
	<table  border="1" align="center">
     <caption>数据质量评分结果表</caption>
    <tr>
  <td  width="10%"  rowspan="3" align="center">系统名称</td>
    <td  width="10%"  rowspan="3" align="center">总评分</td>
    <td  width="10%" colspan="12"  align="center">数据质量评分体系</td>
    
    </tr>
    <tr>
   <td   width="20%"  colspan="3" align="center">完整性</td>
     <td  width="20%"   colspan="3" align="center">准确性</td>
    <td   width="20%"  colspan="3" align="center">一致性</td>
    <td   width="20%"  colspan="3" align="center">及时性</td>
    </tr>
    <tr>
        <td align="center"> 合格率</td>
        <td align="center">  权重</td>
        <td align="center">  得分</td>
        <td  align="center"> 合格率</td>
        <td align="center">  权重</td>
        <td align="center">  得分</td>
         <td align="center"> 合格率</td>
        <td align="center">  权重</td>
        <td align="center">  得分</td>
         <td align="center"> 合格率</td>
        <td align="center">  权重</td>
        <td align="center">  得分</td>
    </tr>
    <tr> 
      <td> ${systemname1 }</td>
      <td> ${zf1 }</td>     
      <td>${cep1 }</td>
      <td>${cq1 }</td>
      <td>${cdf1 }</td>
       <td> ${zep1 }</td>
      <td>${zq1 }</td>
      <td>${zdf1 }</td>
     <td>${yep1 }</td>
      <td>${yq1 }</td>
      <td>${ydf1 }</td>
      <td> ${jep1 }</td>
      <td>${jq1 }</td>
      <td>${jdf1 }</td>
    
    </tr>
    <tr> 
       <td>${systemname2 } </td>
      <td> ${zf2 }</td>     
      <td>${cep2 }</td>
      <td>${cq2 }</td>
      <td>${cdf2 }</td>
       <td> ${zep2}</td>
      <td>${zq2 }</td>
      <td>${zdf2 }</td>
     <td>${yep2 }</td>
      <td>${yq2 }</td>
      <td>${ydf2 }</td>
      <td> ${jep2 }</td>
      <td>${jq2 }</td>
      <td>${jdf2 }</td>  
    </tr>
     <tr> 
     <td>${systemname3 } </td>
      <td> ${zf3 }</td>     
      <td>${cep3 }</td>
      <td>${cq3 }</td>
      <td>${cdf3 }</td>
       <td> ${zep3 }</td>
      <td>${zq3 }</td>
      <td>${zdf3 }</td>
     <td>${yep3 }</td>
      <td>${yq3 }</td>
      <td>${ydf3 }</td>
      <td> ${jep3 }</td>
      <td>${jq3 }</td>
      <td>${jdf3 }</td>
    </tr>
     <tr> 
      <td>${systemname4 } </td>
      <td> ${zf4 }</td>     
      <td>${cep4 }</td>
      <td>${cq4 }</td>
      <td>${cdf4 }</td>
       <td> ${zep4 }</td>
       <td>${zq4 }</td>
      <td>${zdf4 }</td>
     <td>${yep4 }</td>
      <td>${yq4 }</td>
      <td>${ydf4 }</td>
      <td> ${jep4 }</td>
      <td>${jq4 }</td>
      <td>${jdf4 }</td>
    </tr>
  </table>
   </div>
			
					<div class="form-actions" >
				<input type="submit" class="btn btn-success btn-large" value="下载分析结果" /> <a class="btn" href="index.jsp">返回</a>
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
	<script>
	$(document).ready(function() {
		$('.dropdown-menu li a').hover(
		function() {
			$(this).children('i').addClass('icon-white');
		},
		function() {
			$(this).children('i').removeClass('icon-white');
		});
	});
	</script>
  </body>
</html>
