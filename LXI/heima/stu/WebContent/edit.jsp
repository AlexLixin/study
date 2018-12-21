<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑学生页面</title>
</head>

<body>
	<h1>编辑学生页面</h1>
	<table border="1" width="700">
		<form action="UpdateServlet" method="post">
		<input type="hidden" align="left" name="sid"
					value="${sid}">
			<tr align="center" style="text-align: left;">
				<td>姓名</td>
				<td><input type="text" align="left" name="sname"
					value="${sname}"></td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td>性别</td>
				<td><input type="radio" name="gender" value="男"
					<c:if test="${gender =='男'}">checked</c:if>> 男 <input
					type="radio" name="gender" value="女"
					<c:if test="${gender =='女'}">checked</c:if>> 女</td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td>电话</td>
				<td><input type="text" name="phone" value="${phone}"></td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td>生日</td>
				<td><input type="text" name="birthday" value="${birthday}"></td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td>爱好</td>
				<td><input type="checkbox" name="hobby" value="游泳"
					<c:if test="${hobby.contains('游泳')}">checked</c:if>>游泳 <input
					type="checkbox" name="hobby" value="篮球"
					<c:if test="${hobby.contains('篮球')}">checked</c:if>>篮球 <input
					type="checkbox" name="hobby" value="足球"
					<c:if test="${hobby.contains('足球')}">checked</c:if>>足球 <input
					type="checkbox" name="hobby" value="看书"
					<c:if test="${hobby.contains('看书')}">checked</c:if>>看书 <input
					type="checkbox" name="hobby" value="写字"
					<c:if test="${hobby.contains('写字')}">checked</c:if>>写字</td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td>简介</td>
				<td><textarea name="info" rows="3" cols="20">${info}</textarea></td>
			</tr>
			<tr align="center" style="text-align: left;">
				<td colspan="2"><input type="submit" value="更新" /></td>
			</tr>
		</form>
	</table>
</body>

</html>