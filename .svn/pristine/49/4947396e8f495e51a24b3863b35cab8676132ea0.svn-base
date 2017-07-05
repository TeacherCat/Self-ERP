<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>薪酬项目列表</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysset.js"></script>
</head>

<body>
<c:if test="${sessionScope.users.role.name=='薪酬专员' || sessionScope.users.role.name=='薪酬经理'}">

	<form action="projectList.do" method="post" id="myForm">
	
		<div class="layui-form-item" style="margin-top:20px;">
			<a class="layui-btn layui-btn-radius" style="margin-top:-5px;margin-left:20px;" href="projectAdd.do?res=1">新&nbsp;增&nbsp;项&nbsp;目</a>
		</div>
		
		<div class="layui-field-box layui-form">
			<table class="layui-table admin-table">
				<thead>
					<tr>
						<th width="25%">项目编号</th>
						<th width="25%">项目名称</th>
						<th width="25%">项目描述</th>
						<th width="25%">操作</th>
					</tr>
				</thead>
				<c:forEach var="pro" items="${page.pageList }">
					<tr>
						<td>${pro.id }</td>
						<td>${pro.name }</td>
						<td>
							<c:if test="${fn:length(pro.desc)>10}">
								${fn:substring(pro.desc, 0, 9)}...
							</c:if>
							<c:if test="${fn:length(pro.desc)<=10}">
								${pro.desc}
							</c:if>
						</td>
						<td><a href="projectUpd.do?id=${pro.id }&res=1" class="layui-btn layui-btn-normal layui-btn-mini">修改</a>
							<a href="projectDetail.do?id=${pro.id }" class="layui-btn layui-btn-mini">详情</a>
							<a href="projectDel.do?id=${pro.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-danger layui-btn-mini" onclick="return confirm('确定要删除吗？');">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
			<p style="width:100px;margin:0px auto;margin-top:30px;color:red;">${msg}</p>
		</div>
		
		<%@ include file="../../../jsp/public/page.jsp" %>
	</form>
	
</c:if>

<c:if test="${sessionScope.users.role.name!='薪酬专员' && sessionScope.users.role.name!='薪酬经理' }">
	<div style="font-size:22px;width:250px;margin:300px auto;color:red;">抱歉，您没有访问权限！</div>
</c:if>
</body>
</html>
