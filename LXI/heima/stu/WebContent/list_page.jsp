<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		function doDelete(sid) {
			var flag = confirm("是否确定删除");
			if (flag) {
				window.location.href = "DeleteServlet?sid=" + sid;
			}
		}

		function doEdit(sid) {
			window.location.href = "EditServlet?sid=" + sid;
		}
	</script>
</head>

<body>
	<table border="1" width="1000">
		<tr>
			<td colspan="8">
				<form action="QueryServlet" method="post">
					按姓名查询 <input type="text" name="sname" /> 按性别查询 <select
						name="gender">
						<option value="">请选择</option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select> <input type="submit" value="查询" /> <a href="add.jsp">添加</a>
				</form>

			</td>
		</tr>
		<tr align="center">
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>电话</td>
			<td>生日</td>
			<td>爱好</td>
			<td>简介</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pageBean.list}" var="stu">
			<tr>
				<td>${stu.sid}</td>
				<td>${stu.sname}</td>
				<td>${stu.gender}</td>
				<td>${stu.phone}</td>
				<td>${stu.birthday}</td>
				<td>${stu.hobby}</td>
				<td>${stu.info}</td>
				<td><a href="#" onclick="doEdit(${stu.sid})">更新</a> <a href="#"
					onclick="doDelete(${stu.sid})">删除</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="8">第${pageBean.currentPage}/${pageBean.totalPage}页
				每页显示${pageBean.pageSize}条 总记录数 ${pageBean.totalSize} 
				<c:if test="${pageBean.currentPage !=1 }">
					<a href="StudentListPageServlet?currentPage=1">首页</a> | <a href="StudentListPageServlet?currentPage=${pageBean.currentPage-1}">上一页</a>
				</c:if>
				<c:forEach begin="1" end="${pageBean.totalPage}" var = "i">
					<c:if test="${pageBean.currentPage ==i }">
						${i}
					</c:if>
					<c:if test="${pageBean.currentPage !=i }">
						<a href="StudentListPageServlet?currentPage=${i}">${i}</a>
					</c:if>
				</c:forEach>
				<c:if test="${pageBean.currentPage != pageBean.totalPage}">
					<a href="StudentListPageServlet?currentPage=${pageBean.currentPage+1}">下一页</a> | <a href="StudentListPageServlet?currentPage=${pageBean.totalPage}">尾页</a>
				</c:if>
				
				
			</td>
		</tr>
	</table>
</body>

</html>