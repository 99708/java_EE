<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login </title>
<script type="text/javascript" src="js/jquery1.9.min.js"></script>
</head>
<body>
	<form action="userServlet.servlet" method="post">
		<p> 用户名：<input id="unameId" type="text" name="uname" value=""/><br /></p>
		<p> 密　码：<input id="pwdId" type="password" name="pwd" value=""/><br /></p>
		<p> <input id="btn" type="submit" value="登录"/></p>
	</form>
</body>
</html>