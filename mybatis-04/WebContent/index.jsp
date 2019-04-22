<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery1.9.min.js"></script>
</head>
<body>
	<div align="center" style="margin-top: 50px">
		姓名：<input type="text" id="unameId" value=""/>&nbsp;&nbsp;&nbsp;&nbsp;
		电话：<input type="text" id="uphoneId" value=""/>&nbsp;&nbsp;
		<input id="btn" type="button" value="查询"/>
	</div>
	<table border="1px" cellpadding="10px" cellspacing="0px" align="center" style="margin-top: 30px; width: 500px">
		<thead>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>手机号</th>
			</tr>
		</thead>
		<tbody id="tb">
		</tbody>
	</table>
	<script type="text/javascript">
		$(function(){
			
			getData("", "");
			
			//给查询按钮添加点击事件
			$("#btn").click(function(){
				var uname = $("#unameId").val();
				var uphone = $("#uphoneId").val();
				$("#tb").empty();
				getData(uname, uphone);
			});
			
			function getData(uname2, uphone2){
				$.ajax({
					url:"userServlet.servlet",
					data:"uname="+uname2+"&uphone="+uphone2,
					dataType:"json",
					type:"post",
					success:function(rsData){
						for(var i in rsData){
							var user = rsData[i];
							$("#tb").append(
									"<tr>"+
										"<td>"+user.uid+"</td>"+
										"<td>"+user.uname+"</td>"+
										"<td>"+user.uphone+"</td>"+
									"</tr>"
							);
						}
					}
				});
			}
			
		})
	</script>
</body>
</html>