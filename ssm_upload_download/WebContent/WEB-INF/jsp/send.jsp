<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="" enctype="multipart/form-data" method="post">
			收件人：<input type="text" name="uname" id="unameId" value=""/>
			主　题：<input type="text" name="topical" id="topicalId" value=""/>
			正　文：<input type="text" name="text" id="textId" value=""/>
			附　件：<input type="file"  id="fileId" value=""/>
			<input type="submit" value="发送"/>
		</form>
	</div>
</body>
</html>