<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>添加培训计划</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	<div style="width:500px;margin:10px auto;">
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训编号：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${train.id}">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训名称：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${train.name}">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训讲师：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${train.lecturer}">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">开始时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${fn:substring(train.startTime,0,19)}">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">结束时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" disabled="disabled" value="${fn:substring(train.endTime,0,19)}">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训目的：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${train.goal}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训简介：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${train.desc}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">参训人员：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${train.personnel}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训资料：</label>
			<div class="layui-input-block">
				<input class="layui-input" disabled="disabled" value="${fn:substring(train.data,13,50)}" />
			</div>
			<div class="layui-input-block">
				<a class="layui-input" style="border:0px;color:blue;" href="fileDownload.do?pathName=${train.data}">点我下载！！</a>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">登&nbsp;&nbsp;记&nbsp;&nbsp;人：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${train.registrar}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">登记时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${fn:substring(train.time,0,19)}" disabled="disabled">
			</div>
		</div>
		
		
		<c:if test="${trainAudit!=null}">
		<hr/>
		<div class="layui-form-item">
			<label class="layui-form-label">审核结果：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${trainAudit.result}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">审核意见：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${trainAudit.opinion}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">审&nbsp;&nbsp;核&nbsp;&nbsp;人：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${trainAudit.person}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">审核时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${fn:substring(trainAudit.time,0,19)}" disabled="disabled">
			</div>
		</div>
		</c:if>
		
		<c:if test="${trainBack!=null}">
		<hr/>
		<div class="layui-form-item">
			<label class="layui-form-label">反馈结果：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${trainBack.result}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">反馈意见：</label>
			<div class="layui-input-block">
				<textarea class="layui-textarea" disabled="disabled">${trainBack.opinion}</textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">反&nbsp;&nbsp;馈&nbsp;&nbsp;人：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${trainBack.person}" disabled="disabled">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">反馈时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" value="${fn:substring(trainBack.time,0,19)}" disabled="disabled">
			</div>
		</div>
		</c:if>
		
		<a href="trainList.do" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:150px;">返&nbsp;&nbsp;回</a>
		
	</div>
</body>
</html>
