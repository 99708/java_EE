<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<body>
	<h3 align="center">转账系统</h3>
	<hr />
	<div  style=" heigth: 240px; width: 600px; 
		border: 1px solid #000; margin: auto; border-radius: 10px;
		margin-top: 10px;">
		<form id="formId" action="transferAccount" method="post">
			<p>
				转账账户：　 <input id="aid" name="aid" type="text" value="" /> 
				<span id="aidSpan" style="margin-left: 10px"></span> <br />
			</p>
			<p>
				密　　 码： 　<input id="apwd" name="apwd" type="text" value="" />
				<span id="apwdSpan" style="margin-left: 10px"></span><br />
			</p>
			<p>
				金 　　额： 　<input id="money" name="money" type="text" value="" />
				<span id="moneySpan" style="margin-left: 10px"></span><br />
			</p>
			<p>
				收款账号： 　<input id="inId" name="inId" type="text" value="" />
				<span id="inIdSpan" style="margin-left: 10px"></span><br />
			</p>
			<p>
				收款人姓名：　<input id="aname" name="aname" type="text" value="" />
				<span id="anameSpan" style="margin-left: 10px"></span><br />
			</p>
			<p>
				<input id="btn"  type="submit" value="转账" style="margin-left: 150px"/>
			</p>
		</form>
	</div>
	<script type="text/javascript">
		$(function(){
			$("#formId").submit(function(){
				$("#aid,#apwd,#aname,#inId,#money").trigger("blur");
				if($(".error").length > 0){
					alert("请检查你的输入");
					return false;
				}else{
					return true;
				}
			});
			$("#aid").blur(function (){
				var url = "getAccountById";
				var data = "aid="+$("#aid").val();
				getData(url, data, function(data){
					if(data){
						$("#aidSpan").html("<img alt='' src='images/right.jpg'/>").
						addClass("success").removeClass("error");
					}else{
						$("#aidSpan").html("<img alt='' src='images/error.jpg'/>").
						addClass("error").removeClass("success");
					}
					
				});
			});
			$("#apwd").blur(function (){
				var url = "getAccountByIdPwd";
				var data = "aid="+$("#aid").val()+"&apwd="+$("#apwd").val();
				getData(url, data, function(data){
					if(data){
						$("#apwdSpan").html("<img alt='' src='images/right.jpg'/>").
						addClass("success").removeClass("error");
					}else{
						$("#apwdSpan").html("<img alt='' src='images/error.jpg'/>").
						addClass("error").removeClass("success");
					}
					
				});
			});
			$("#money").blur(function (){
				var url = "getAccountByIdPwdMoney";
				var data = "aid="+$("#aid").val()+"&apwd="+$("#apwd").val()+"&money="+$("#money").val();
				getData(url, data, function(data){
					if(data){
						$("#moneySpan").html("<img alt='' src='images/right.jpg'/>").
						addClass("success").removeClass("error");
					}else{
						$("#moneySpan").html("<img alt='' src='images/error.jpg'/>").
						addClass("error").removeClass("success");
					}
					
				});
			});
			$("#inId").blur(function (){
				var url = "getAccountById";
				var data = "aid="+$("#inId").val();
				getData(url, data, function(data){
					if(data){
						$("#inIdSpan").html("<img alt='' src='images/right.jpg'/>").
						addClass("success").removeClass("error");
					}else{
						$("#inIdSpan").html("<img alt='' src='images/error.jpg'/>").
						addClass("error").removeClass("success");
					}
					
				});
			});
			$("#aname").blur(function (){
				var url = "getAccountByIdName";
				var data = "inId="+$("#inId").val()+"&aname="+$("#aname").val();
				getData(url, data, function(data){
					if(data){
						$("#anameSpan").html("<img alt='' src='images/right.jpg'/>").
						addClass("success").removeClass("error");
					}else{
						$("#anameSpan").html("<img alt='' src='images/error.jpg'/>").
						addClass("error").removeClass("success");
					}
					
				});
			});
			function getData(url, data, callback){
				$.ajax({
					url:url,
					data:data,
					dataType:"json",
					type:"post",
					success:function(rsData){
						callback(rsData);
					}
				});
			}
		})
	</script>
</body>
</html>