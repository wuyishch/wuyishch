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
				<h1>权重修改 <small>Change Weight</small></h1>
			</div>
			<form class="form-horizontal" action="/CloudDMSystem/showdata" method="post">
				<fieldset>
		<div class="control-group">
	  <table border="1" align="center"> 
     <caption>数据质量评分体系权重估算表</caption>
    <tr>
  <td   rowspan="3" align="center">系统名称</td>
    <td   rowspan="3" align="center">指标规则总数</td>
    <td   colspan="3" align="center">完整性</td>
     <td   colspan="3" align="center">准确性</td>
    <td  colspan="3" align="center">一致性</td>
    <td    colspan="3" align="center">及时性</td>
    </tr>
    <tr>

    </tr>
    <tr>
        <td align="center"> 指标规则数</td>
        <td align="center">  指标占比</td>
        <td align="center">  调整后权重</td>
          <td align="center"> 指标规则数</td>
        <td align="center">  指标占比</td>
        <td align="center">  调整后权重</td>
           <td align="center"> 指标规则数</td>
        <td align="center">  指标占比</td>
        <td align="center">  调整后权重</td>
           <td align="center"> 指标规则数</td>
        <td align="center">  指标占比</td>
        <td align="center">  调整后权重</td>
    </tr>
    <tr> 
      <td>${systemname1} </td>
      <td> ${rulenum1}</td>
      <td> ${cr1 }</td>
      <td> ${ce1}</td>
      <td> <input name="cq1" type="text"  size="10"></td>
      <td> ${zr1 }</td>
      <td> ${ze1}</td>
      <td> <input name="zq1" type="text"  size="10"></td>
     <td> ${yr1 }</td>
      <td> ${ye1}</td>
      <td> <input name="yq1" type="text"  size="10"></td>
      <td> ${jr1 }</td>
      <td> ${je1}</td>
      <td> <input name="jq1" type="text"  size="10"></td>     
    </tr>
    <tr> 
       <td> ${systemname2} </td>
      <td> ${rulenum2}</td>
      <td> ${cr2 }</td>
      <td> ${ce2}</td>
      <td> <input name="cq2" type="text"  size="10"></td>
       <td> ${zr2 }</td>
      <td> ${ze2}</td>
      <td> <input name="zq2" type="text"  size="10"></td>
      <td> ${yr2 }</td>
      <td> ${ye2}</td>
      <td> <input name="yq2" type="text"  size="10"></td>
        <td>  ${jr2 }</td>
      <td> ${je2}</td>
      <td> <input name="jq2" type="text"  size="10"></td>     
    </tr>
    <tr> 
       <td> ${systemname3} </td>
      <td> ${rulenum3}</td>
      <td> ${cr3 }</td>
      <td> ${ce3}</td>
      <td> <input name="cq3" type="text"  size="10"></td>
      <td> ${zr3 }</td>
      <td> ${ze3}</td>
      <td> <input name="zq3" type="text"  size="10"></td>
       <td> ${yr3 }</td>
      <td> ${ye3}</td>
      <td> <input name="yq3" type="text"  size="10"></td>
       <td> ${jr3 }</td>
      <td> ${je3}</td>
      <td> <input name="jq3" type="text"  size="10"></td>        
    </tr>
     <tr> 
        <td> ${systemname4} </td>
      <td> ${rulenum4}</td>
      <td> ${cr4 }</td>
      <td> ${ce4}</td>
      <td> <input name="cq4" type="text"  size="10"></td>
      <td> ${zr4 }</td>
      <td> ${ze4}</td>
      <td> <input name="zq4" type="text"  size="10"></td>
       <td> ${yr4 }</td>
      <td> ${ye4}</td>
      <td> <input name="yq4" type="text"  size="10"></td>
       <td> ${jr4 }</td>
      <td> ${je4}</td>
      <td> <input name="jq4" type="text"  size="10"></td>     
    </tr>
  </table>
  <br/>  <br/>  <br/>
   <table  border="1" align="center">
     <caption>数据质量评分体系合格率估算表</caption>
     <tr>
  <td    rowspan="3" align="center">系统名称</td>
    <td     colspan="3" align="center">完整性</td>
     <td   colspan="3" align="center">准确性</td>
    <td   colspan="3" align="center">一致性</td>
    <td     colspan="3" align="center">及时性</td>
    </tr>
    <tr>

    </tr>
    <tr>
        <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
        <td align="center">  合格率</td>
       <td  align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
        <td align="center">  合格率</td>
        <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
        <td align="center">  合格率</td>
        <td align="center"> 指标规则数</td>
        <td align="center">  问题指标数</td>
        <td align="center">  合格率</td>
    </tr>
    <tr> 
       <td>${systemname1}</td>
      <td> ${cr1 }</td>
      <td> ${crp1 }</td>
      <td> ${cep1 }</td>
      <td> ${zr1 }</td>
      <td> ${zrp1 }</td>
      <td> ${zep1 }</td>
      <td>  ${yr1 }</td>
      <td> ${yrp1 }</td>
      <td> ${yep1 }</td>
     <td> ${zr1 }</td>
      <td> ${zrp1 }</td>
      <td> ${zep1 }</td>
    </tr>
    <tr> 
      <td>${systemname2}</td>
      <td> ${cr2 }</td>
      <td> ${crp2 }</td>
      <td> ${cep2 }</td>
      <td> ${zr2 }</td>
      <td> ${zrp2 }</td>
      <td> ${zep2 }</td>
      <td>  ${yr2 }</td>
      <td> ${yrp2 }</td>
      <td> ${yep2 }</td>
     <td> ${zr2}</td>
      <td> ${zrp2 }</td>
      <td> ${zep2 }</td>
    </tr>
    <tr> 
    <td>${systemname3}</td>
      <td> ${cr3 }</td>
      <td> ${crp3 }</td>
      <td> ${cep3 }</td>
      <td> ${zr3 }</td>
      <td> ${zrp3 }</td>
      <td> ${zep3 }</td>
      <td>  ${yr3 }</td>
      <td> ${yrp3 }</td>
      <td> ${yep3 }</td>
     <td> ${zr3 }</td>
      <td> ${zrp3 }</td>
      <td> ${zep3 }</td> 
    </tr>
     <tr> 
      <td>${systemname4}</td>
      <td> ${cr4 }</td>
      <td> ${crp4 }</td>
      <td> ${cep4 }</td>
      <td> ${zr4 }</td>
      <td> ${zrp4 }</td>
      <td> ${zep4 }</td>
      <td>  ${yr4 }</td>
      <td> ${yrp4 }</td>
      <td> ${yep4 }</td>
     <td> ${zr4}</td>
      <td> ${zrp4 }</td>
      <td> ${zep4 }</td>
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
