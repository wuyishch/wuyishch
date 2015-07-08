<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统登录</title>
<link href="css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<link href="css/demo.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>

<script>

 function changeimage(img){
    img.src=img.src+"?"+new Date().getTime();
    }
function clear(){
login.username.value=null;
}
function isValid()
  {	
  	//下面的if判断语句将检查是否输入帐号资料
  	if(login.username.value == "")
  	{	
  		window.alert("您必须完成帐号的输入!"); 
  		//显示错误信息
 		document.login.elements(0).focus();
  		//将光标移至帐号输入栏		
  		return  false;
  	}
  	
  	//下面的if判断语句将检查是否输入帐号密码
  	if(login.password.value == "")
  	{
  		window.alert("您必须完成密码的输入!");
 		//显示错误信息
  		document.login.elements(1).focus();
  		//将光标移至密码输入栏
  		return  false;  //离开函数
  	}
  	if(login.yzm.value == "")
  	{
  		window.alert("您必须完成验证码的输入!");
 		//显示错误信息
  		document.login.elements(2).focus();
  		//将光标移至密码输入栏
  		return  false;  //离开函数
  	}
  
  	login.submit(); //送出表单中的资料
 }


</script>
</head>

<body>


<div class="header">
  <h1 class="headerLogo"><a title="数据质量分析系统" target="_blank" href="http://www.zjut.edu.cn/"><img alt="logo" src="images/logo.gif"></a></h1>
	<div class="headerNav">
		<a target="_blank" href="http://www.zjut.edu.cn/">DM官网</a>
		<a target="_blank" href="http://www.zjut.edu.cn/">关于DM</a>
		<a target="_blank" href="http://www.zjut.edu.cn/">开发团队</a>
		<a target="_blank" href="http://www.zjut.edu.cn/">意见反馈</a>
		<a target="_blank" href="http://www.zjut.edu.cn/">帮助</a>	
	</div>
</div>

<div class="banner">

<div class="login-aside">
  <div id="o-box-up"></div>
  <div id="o-box-down"  style="table-layout:fixed;">
   <div class="error-box"></div>
   
   <form name="login" class="registerform"action="/CloudDMSystem/LoginServlet" method="post" onsubmit="return isValid()">
   <div class="fm-item">
	   <label for="logonId" class="form-label">DM系统登陆：</label>
	   <input type="text" value="${username }" maxlength="100" id="username" class="i-text" name="username" onclick="this.value=''" >    
       <div class="ui-form-explain"></div>
  </div>
  
  <div class="fm-item">
	   <label for="logonId" class="form-label">登陆密码：</label>
	   <input type="password" value="${password}" maxlength="100" id="password" class="i-text" name="password" >    
       <div class="ui-form-explain"></div>
  </div>
  
<div class="fm-item pos-r">
	   <label for="logonId" class="form-label">验证码：</label>
	   <input type="text" value="输入验证码" maxlength="100" id="yzm" class="i-text yzm"  name="yzm"  onFocus="this.value=''">    
	    <div class="ui-form-explain"> <img src="/CloudDMSystem/CheckCode"   class="yzm-img" onclick="changeimage(this)" alt="换一张"  style="cursor:hand"></div>
  </div>
  <div class="fm-item">
	   <label for="logonId" class="form-label"></label>
	   <input type="submit" value="" tabindex="4" id="send-btn" class="btn-login"> 
       <div class="ui-form-explain"></div>
  </div>
  
  </form>
  
  </div>

</div>

	<div class="bd">
		<ul>
			<li style="background:url(themes/theme-pic1.jpg) #CCE1F3 center 0 no-repeat;"><a target="_blank" href="http://www.zjut.edu.cn/"></a></li>
			<li style="background:url(themes/theme-pic2.jpg) #BCE0FF center 0 no-repeat;"><a target="_blank" href="http://www.zjut.edu.cn/"></a></li>
		</ul>
	</div>

	<div class="hd"><ul></ul></div>
</div>
<script type="text/javascript">jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"fold",  autoPlay:true, autoPage:true, trigger:"click" });</script>


<div class="banner-shadow"></div>

<div class="footer">
   <p>Copyright &copy; 2015.Cloud DM System All rights reserved.<a target="_blank" href="http://www.zjut.edu.cn/">wuyishch@gmail.com</a></p>
</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
