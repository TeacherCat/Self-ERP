<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>主页</title>
	<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" />
</head>

<body>
	<div id="main">
		<p>
			<img src="<%=request.getContextPath()%>/img/noavatar_middle.gif" /><br />
			<span>姓 名：${sessionScope.users.realName}</span><br />
			<span>登陆名：${sessionScope.users.name}</span><br />
			<span>角色：${sessionScope.users.role.name}</span><br />
			<span>联系电话：${sessionScope.users.telephone}</span><br />
		</p>
	</div>
</body>
</html>
