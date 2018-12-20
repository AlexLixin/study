<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加学生页面</title>
	</head>

	<body>
		<h1>添加学生页面</h1>
		<table border="1" width="700">
			<form action="AddServlet" method="post">
				<tr align="center" style="text-align: left;">
					<td>姓名</td>
					<td><input type="text" align="left" name="sname"></td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td>性别</td>
					<td><input type="radio" name="gender" value="男"> 男 <input type="radio" name="gender" value="女"> 女</td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td>电话</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td>生日</td>
					<td><input type="text" name="birthday"></td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td>爱好</td>
					<td><input type="checkbox" name="hobby" value="游泳">游泳 <input type="checkbox" name="hobby" value="篮球">篮球 <input type="checkbox" name="hobby" value="足球">足球 <input type="checkbox" name="hobby" value="看书">看书 <input type="checkbox" name="hobby" value="写字">写字</td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td>简介</td>
					<td><textarea name="info" rows="3" cols="20"></textarea></td>
				</tr>
				<tr align="center" style="text-align: left;">
					<td colspan="2">
						<input type="submit" value="添加" />
					</td>
				</tr>
			</form>
		</table>
	</body>

</html>