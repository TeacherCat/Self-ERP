<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>职位详情</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	<div class="layui-form-item" style="margin-top:20px;margin-right:20px;">
		
		<div class="layui-inline">
			<label class="layui-form-label">所属部门：</label>
			<select class="select" disabled="disabled">
				<option>${releases.dept.name}</option>
			</select>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">所属职位：</label>
			<select class="select" disabled="disabled">
				<option>${releases.post.name}</option>
			</select>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">招聘类型：</label>
			<select class="select" disabled="disabled">
				<option>${releases.type}</option>
			</select>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div><br/><br/>
		
		<div class="layui-inline">
			<label class="layui-form-label">招聘人数：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${releases.count}">
			</div>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">学历要求：</label>
			<select class="select" disabled="disabled">
				<option>${releases.education}</option>
			</select>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">工作年限：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${releases.limit}">
			</div>
			<span class="msg">&nbsp;&nbsp;&nbsp;</span>
		</div><br/><br/>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">职位描述：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${releases.desc}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">招聘要求：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${releases.requier}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">截止时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${fn:substring(releases.endTime,0,19)}" >
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">登&nbsp;&nbsp;记&nbsp;&nbsp;人：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${releases.registrar}">
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">登记时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${fn:substring(releases.time,0,19)}">
			</div>
		</div>
		
		<a href="<%=request.getContextPath()%>/releasesList.do" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;">返&nbsp;&nbsp;回</a>
		
	</div>
</body>
</html>
