<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>职位详情</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
</head>

<body>
	<div style="width:500px;margin:20px auto;">
		
		<div class="layui-form-item">
			<label class="layui-form-label">职位编号：</label>
			<label style="line-height:38px;">${post.id }</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">职位名称：</label>
			<label style="line-height:38px;">${post.name }</label>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">所属部门：</label>
			<label style="line-height:38px;">${post.dept.name }</label>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">职位描述：</label>
			<div class="layui-input-block">
				<label style="line-height:38px;">${post.desc }</label>
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">备&nbsp;&nbsp;注：</label>
			<div class="layui-input-block" style="line-height:38px;">
				${post.remarks }
			</div>
		</div>
		
		<a href="postList.do" class="layui-btn layui-btn-radius" style="margin:20px 180px;">返&nbsp;&nbsp;回</a>
		
	</div>
</body>
</html>
