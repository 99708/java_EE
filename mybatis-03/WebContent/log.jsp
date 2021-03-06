<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/mybatis-03/js/jquery-1.9.1.min.js"></script>
</head>
<body>
	<div align="center">
		<h3>日志表</h3>
		<hr />
		<table border="1px" cellpadding="5px" cellspacing="0px" style="margin-top: 20px">
			<thead>
				<tr>
					<th>转账帐号</th>
					<th>收款帐号</th>
					<th>转账金额</th>
				</tr>	
			</thead>
			<tbody id="tb">
			</tbody>
		</table>
		<div style="margin-top: 20px">
			<span id="up"><a href="javascript:void(0)">上一页</a></span>&nbsp;&nbsp;&nbsp;&nbsp;
			<span id="next"><a href="javascript:void(0)">下一页</a></span>
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			var pageNum;
			var pageSize;
			var pages;
			
			//默认显示第一页
			getData(1, 2);
			//上一页
			$("#up").click(function(){
				if(pageNum > 1){
					getData(pageNum - 1, pageSize);
				}else{
					alert("已经是第一页了");
				}
			});
			//下一页
			$("#next").click(function(){
				if(pageNum < pages){
					getData(pageNum + 1, pageSize);
				}else{
					alert("已经是第最后一页了");
				}
			});
			
			function getData(pn, ps){
				$.ajax({
					url:"logServlet.servlet",
					data:"pageNum="+pn+"&pageSize="+ps,
					dataType:"json",
					type:"post",
					success:function(rsData){
						console.log(rsData);
						pageNum = rsData.pageNum;
						pageSize = rsData.pageSize;
						pages = rsData.pages;
						//获取他body标签
						//遍历结果
						$("#tb").empty();
						for(var i in rsData.ll){
							var logList = rsData.ll[i];
							$("#tb").append(
								"<tr>"+
									"<td>"+logList.outid+"</td>"+
									"<td>"+logList.inid+"</td>"+
									"<td>"+logList.money+"</td>"+
								"</tr>"
							);
						}
					}
				});
			}
			
		});
	</script>
</body>
</html>