<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
</head>
<body>
	<input type="button" id="btn" value="发送邮件"/><br /><br />
	<table id="tab" border="1px" cellpadding="10px" cellspacing="0px">
		<tr>
			<td>标题</td>
			<td>时间</td>
			<td>发送人</td>
		</tr>
	</table>
	<script type="text/javascript">
		$(function(){
			$("#btn").click(function(){
				window.location.href="";
			});
			//页面加载完之后发起ajax请求
			$.ajax({
				url:"getEmail",
				data:"",
				dataType:"json",
				type:"post",
				success:function(rsData){
					console.log(rsData != null);
					if(rsData != null){
						
					}else{
						window.write("没有任何消息");
					}
				}
			});
		})
	</script>
</body>
</html>