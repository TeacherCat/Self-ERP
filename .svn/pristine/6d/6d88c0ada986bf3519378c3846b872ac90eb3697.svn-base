<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>用户详情</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	<div style="width:500px;margin:20px auto;">
		
		<div class="layui-form-item">
			<label class="layui-form-label">用户名称：</label>
			<label style="line-height:38px;">${users.name }</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">真实姓名：</label>
			<label style="line-height:38px;">${users.realName }</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">登陆密码：</label>
			<label style="line-height:38px;">******</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">用户角色：</label>
			<label style="line-height:38px;">${users.role.name }</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">联系电话：</label>
			<label style="line-height:38px;">${users.telephone }</label>
		</div>
		
		<a href="usersList.do" class="layui-btn layui-btn-radius" style="margin:20px 80px;">返&nbsp;&nbsp;回</a>
		
	</div>
</body>
</html>
