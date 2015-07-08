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
			  <li ><a href="help.jsp">帮助</a></li>
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
              <li><a href="result.jsp">显示结果</a></li>
              <li class="nav-header"><i class="icon-user"></i> Help</li>
              <li class="active"><a href="help.jsp">帮助</a></li>
			  <li><a href="/CloudDMSystem/LogoutServlet">注销</a></li> 
            </ul>
          </div>
        </div>
       
         <div class="span9">
		  <div class="row-fluid">
			<div class="page-header">
				<h1>帮助文档 <small>Help Document</small></h1>
			</div>
				<fieldset>
		<div class="control-group">
	  <table border="1" align="center"> 
     <caption>《数据质量评分体系权重估算表》填写说明</caption>
    <tr>
     <td  align="center">填写项</td>
    <td    align="center">说明</td>
    </tr>
    <tr>
        <td align="center"> 指标规则数</td>
        <td align="center">  根据企业《数据质量检核规则指标列表》，将不同度量维度下的指标按照与不同系统的关联度，进行指标数量统计</td>
    </tr>
   <tr>
        <td align="center"> 指标规则总数</td>
        <td align="center"> 各系统相关的指标规则总数，指标规则总数=SUM(各度量维度下指标数)</td>
    </tr>
    <tr>
        <td align="center"> 指标占比</td>
        <td align="center">  各度量维度下指标数占与各系统相关指标总数的百分比，指标占比=度量维度下相关指标数/各系统相关指标总数</td>
    </tr>
    <tr>
        <td align="center"> 调整权重</td>
        <td align="center">  按照各指标占比情况，确定各度量维度在总评分中的权重。总权重为100。由于指标占比保留到小数点后两位，各百分比相加可能不等于100，因此，需要对各权重进行调整。同时，除指标占比因素外，各度量维度的重要性还存在与指标数量不相关因素，可以由数据质量管理委员会专家根据情况进行权重配置调整。</td>
    </tr>
    <tr>
        <td align="center"> 其他说明</td>
        <td align="center">  对于不存在的数据项，填入N-A</td>
    </tr>
     <tr>
        <td align="center"> 权重设置建议</td>
        <td align="center">  可以根据不同时期的考核重点，对指标权重进行相应调整对于各检核指标，可以根据指标的重要程度设置不同的权重，进行权重调整。</td>
    </tr>
  </table>
    <br/>  <br/>  <br/>
   <table border="1" align="center"> 
     <caption>《数据质量评分体系合格率估算表》填写说明</caption>
    <tr>
     <td  align="center">填写项</td>
    <td    align="center">说明</td>
    </tr>
    <tr>
        <td align="center"> 指标规则数</td>
        <td align="center">  根据企业《数据质量检核规则指标列表》，将不同度量维度下的指标按照与不同系统的关联度，进行指标数量统计</td>
    </tr>
   <tr>
        <td align="center"> 问题指标数</td>
        <td align="center"> 根据企业《数据质量检核问题报告》，将发现问题的指标进行归类统计</td>
    </tr>
    <tr>
        <td align="center"> 合格率</td>
        <td align="center">  即指标合规情况，合格率=(指标规则数-问题指标数)/指标规则数</td>
    </tr>
    <tr>
        <td align="center"> 其他说明</td>
        <td align="center">  对于不存在的数据项，填入N-A</td>
    </tr>
  </table>
    <br/>  <br/>  <br/>
  <table border="1" align="center"> 
     <caption>《数据质量评分结果表》说明</caption>
    <tr>
     <td  align="center">填写项</td>
    <td    align="center">说明</td>
    </tr>
    <tr>
        <td align="center"> 小项得分</td>
        <td align="center">  各不同度量维度下，小项得分=合格率*权重。</td>
    </tr>
   <tr>
        <td align="center"> 总评分</td>
        <td align="center"> 按不同度量维度进行加权平均后，各体统的评分。总评分=SUM(各度量维度下小项得分)。总权重为100，因此满分为100。</td>
    </tr>
    <tr>
        <td align="center"> 其他说明</td>
        <td align="center">  对于不存在的数据项，填入N-A</td>
    </tr>
  </table>
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
  </body>
</html>
