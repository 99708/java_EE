<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">转账系统</h3>
	<hr />
	<div align="center" style=" heigth: 240px; width: 360px; 
		border: 1px solid #000; margin: auto; border-radius: 10px;
		margin-top: 10px;">
		<form action="moneyServlet.servlet" method="post">
			<p>转账账户：　<input id="" name="id" type="text" value=""/><br /></p>
			<p>密　　码：　<input id="" name="pwd" type="text" value=""/><br /></p>
			<p>金　　额：　<input id="" name="money" type="text" value=""/><br /></p>
			<p>收款账号：　<input id="" name="inId" type="text" value=""/><br /></p>
			<p>收款人姓名：<input id="" name="name" type="text" value=""/><br /></p>
			<p><input type="submit" value="转账"/></p>
		</form>
	</div>
	<div align="center">
          <p><span>要求:</span></p>
          <p><span>转账时,账户和密码不匹配跳转到错误信息页面</span></p>
          <p><span>转账时,余额不足时</span><span>跳转到错误信息页面</span></p>
          <p><span>转账时,收款人帐号和姓名不匹配</span><span>跳转到错误信息页面</span></p>
          <p><span>如果转账成功:</span></p>
          <p><span>修改账户余额以外还需要把操作记录到日志表中,同时还需要记录到log日志文件中.</span></p>
          <p><span>日志文件中只需要记录哪个账户给哪个账户在什么时间转了多少钱</span></p>
          <p><span>跳转到转账记录页面</span></p>
     </div>
	
</body>
</html>