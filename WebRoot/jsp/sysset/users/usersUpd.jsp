<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>修改用户</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysset.js"></script>
</head>

<body>
	<div style="width:500px;margin:20px auto;">
		<form action="usersUpd.do" method="post" id="usersForm">
			
			<div class="layui-form-item">
				<label class="layui-form-label">用户名称：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" name="name" value="${users.name }" readonly="readonly">
				</div>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">真实姓名：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" name="realName" value="${users.realName }" maxlength="12">
				</div>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">用户角色：</label>
				<select class="select" name="role.id" id="role">
					<option value="0">请选择用户角色</option>
					<c:forEach var="role" items="${roleList }">
						<c:if test="${role.name!='人力资源负责人'}">
							<option value="${role.id }"<c:if test="${users.role.id==role.id }">selected="selected"</c:if>>${role.name }</option>
						</c:if>	
					</c:forEach>
				</select>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">联系电话：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" name="telephone" value="${users.telephone }">
				</div>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<p style="width:100px;margin:0px auto;margin-top:30px;color:red;">${msg}</p>
			<input type="submit" value="修&nbsp;&nbsp;改" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
			<a href="usersList.do" class="layui-btn layui-btn-radius" style="margin-top:20px">返&nbsp;&nbsp;回</a>
			
		</form>
	</div>
</body>
</html>
