<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>修改职位</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysset.js"></script>
</head>

<body>
	<div style="width:500px;margin:20px auto;">
		<form action="postUpd.do" method="post" id="postForm">
			
			<input type="hidden" name="id" value="${post.id}">
		
			<div class="layui-form-item">
				<label class="layui-form-label">职位名称：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" name="name" maxlength="16" value="${post.name }">
				</div>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">所属部门：</label>
				<select class="select" name="dept.id" id="dept">
					<option value="0">请选择部门</option>
					<c:forEach var="dept" items="${deptList}">
						<option value="${dept.id }" <c:if test="${post.dept.id==dept.id }">selected="selected"</c:if>>${dept.name}</option>
					</c:forEach>
				</select>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">职位描述：</label>
				<div class="layui-input-block">
					<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="desc">${post.desc }</textarea>
				</div>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">备&nbsp;&nbsp;注：</label>
				<div class="layui-input-block">
					<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="remarks">${post.remarks }</textarea>
				</div>
			</div>
			
			<p style="width:100px;margin:0px auto;margin-top:30px;color:red;">${msg}</p>
			<input type="submit" value="修&nbsp;&nbsp;改" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
			<a href="postList.do" class="layui-btn layui-btn-radius" style="margin-top:20px">返&nbsp;&nbsp;回</a>
			
		</form>
	</div>
</body>
</html>
