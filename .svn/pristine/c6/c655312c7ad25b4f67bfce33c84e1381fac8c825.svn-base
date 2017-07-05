<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>面试结果登记</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	
	<div style="width:500px;margin:10px auto;">
		<div class="layui-form-item">
			<label class="layui-form-label">简历编号：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${resumes.id}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">姓&#12288;&#12288;名：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${resumes.name}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">性&#12288;&#12288;别：</label>
			<select class="select" disabled="disabled">
				<option>${resumes.sex}</option>
			</select>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">年&#12288;&#12288;龄：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${resumes.age}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">学&#12288;&#12288;历：</label>
			<select class="select" disabled="disabled">
				<option>${resumes.education}</option>
			</select>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">电&#12288;&#12288;话：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${resumes.telephone}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">应聘职位：</label>
			<select class="select" disabled="disabled">
				<option>${resumes.releases.post.name}</option>
			</select>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">简历附件：</label>
			<div class="layui-input-block">
				<input class="layui-input" value="${fn:substring(resumes.data,13,50)}" disabled="disabled" />
			</div>
			<div class="layui-input-block">
				<a class="layui-input" style="border:0px;color:blue;" href="fileDownload.do?pathName=${resumes.data}">点我下载！！</a>
			</div>
		</div><hr/>
		
		<form action="addResult.do" method="post">
		<div class="layui-form-item">
			<label class="layui-form-label">面试结果：</label>
			<select class="select" name="result">
				<option>面试通过</option>
				<option>面试不通过</option>
			</select>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">面试评价：</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea" name="opinion" maxlength="50"></textarea>
			</div>
		</div>
		
		<input type="hidden" name="id" value="${resumes.id}" />
		<input type="hidden" name="person" value="${sessionScope.users.realName}" />
		
		<input type="submit" value="提&nbsp;交&nbsp;结&nbsp;果&nbsp;登&nbsp;记" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
		<a href="resultList.do" class="layui-btn layui-btn-radius" style="margin-top:20px;">返&nbsp;&nbsp;回</a>
		
		</form>
	</div>
</body>
</html>
