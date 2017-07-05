<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>薪酬标准详情</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	<div style="width:600px;margin:20px auto;">
		
		<div class="layui-form-item">
			<label class="layui-form-label">标准名称：</label>
			<div class="layui-input-inline">
				<label style="line-height:38px;">${stan.name }</label>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">标准总额：</label>
			<div class="layui-input-inline">
				<label style="line-height:38px;"><fmt:formatNumber type="number" value="${stan.amount }" pattern="0.00" maxFractionDigits="2"/></label>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">标准状态：</label>
			<div class="layui-input-inline">
				<label style="line-height:38px;">${stan.state }</label>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">登记时间：</label>
			<div class="layui-input-inline">
				<label style="line-height:38px;">${fn:substring(stan.time, 0, 19)}</label>
			</div>
		</div>
		<hr/>
		
		<div class="layui-field-box layui-form" style="width:600px;">
			<table class="layui-table admin-table">
				<thead>
					<tr>
						<th width="40">项目编号</th>
						<th width="40">项目名称</th>
						<th width="20">项目金额(元)</th>
					</tr>
				</thead>
				<c:forEach var="staDet" items="${staDet }">
					<tr>
						<td>${staDet.project.id }</td>
						<td>${staDet.project.name }</td>
						<td><fmt:formatNumber type="number" value="${staDet.money }" pattern="0.00" maxFractionDigits="2"/></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<c:if test="${stan.state!='起草' && stan.state!='审核中' }">
			<hr/>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">审核人：</label>
				<div class="layui-input-block">
					<label style="line-height:38px;">${staAud.person }</label>
				</div>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">审核时间：</label>
				<div class="layui-input-block">
					<label style="line-height:38px;"><fmt:formatDate value="${staAud.time}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></label>
				</div>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">审核意见：</label>
				<div class="layui-input-block">
					<label style="line-height:38px;">${staAud.opinion }</label>
				</div>
			</div>
		</c:if>
		
		<a href="standardList.do" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:150px;">返&nbsp;&nbsp;回</a>
		
	</div>
</body>
</html>
