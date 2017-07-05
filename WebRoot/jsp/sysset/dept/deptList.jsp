<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>部门列表</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysset.js"></script>
</head>

<body>
<c:if test="${sessionScope.users.role.name=='人事经理'}">

	<form action="deptList.do" method="post" id="myForm">
		<div class="layui-form-item" style="margin-top:20px;">
			<div class="layui-inline">
				<label class="layui-form-label">部门名称：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" maxlength="16" name="name" value="${dept.name}">
				</div>
			</div>
			<input type="submit" class="layui-btn layui-btn-radius" style="margin-top:-5px;" value="查&nbsp;询" />
			<a class="layui-btn layui-btn-radius" style="margin-top:-5px;" href="deptAdd.do?res=1">新&nbsp;增&nbsp;部&nbsp;门</a>
		</div>
		
	
		<div class="layui-field-box layui-form">
			<table class="layui-table admin-table">
				<thead>
					<tr>
						<th width="25%">部门名称</th>
						<th width="25%">部门描述</th>
						<th width="25%">部门电话</th>
						<th width="25%">操作</th>
					</tr>
				</thead>
				<c:if test="${page.pageList.size()==0}">
					<tr>
						<td colspan="4" style="text-align:center;color:red;line-height:50px;">暂未查到相关数据！</td>
					</tr>
				</c:if>
				<c:forEach var="dept" items="${page.pageList }">
					<tr>
						<td>${dept.name}</td>
						<td>
							<c:if test="${fn:length(dept.desc)>10}">
								${fn:substring(dept.desc, 0, 9)}...
							</c:if>
							<c:if test="${fn:length(dept.desc)<=10}">
								${dept.desc}
							</c:if>
						</td>
						<td>${dept.phone }</td>
						<td><a href="deptUpd.do?id=${dept.id }&res=1" class="layui-btn layui-btn-normal layui-btn-mini">修改</a>
							<a href="deptDetail.do?id=${dept.id }" class="layui-btn layui-btn-mini">详情</a>
							<a href="deptDel.do?id=${dept.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-danger layui-btn-mini" onclick="return confirm('确定要删除吗？');">删除</a>
							<%-- <button class="layui-btn layui-btn-danger layui-btn-mini" onclick="jqueryDel('deptDel.do',${dept.id})">删除</button> --%>
						</td>
					</tr>
				</c:forEach>
			</table>
			
			<p style="width:200px;margin:0px auto;margin-top:30px;color:red;" id="msg">${msg }</p>
		</div>
	
		<%@ include file="../../../jsp/public/page.jsp" %>
	</form>

</c:if>

<c:if test="${sessionScope.users.role.name != '人事经理'}">
	<div style="font-size:22px;width:250px;margin:300px auto;color:red;">抱歉，您没有访问权限！</div>
</c:if>
</body>
</html>
