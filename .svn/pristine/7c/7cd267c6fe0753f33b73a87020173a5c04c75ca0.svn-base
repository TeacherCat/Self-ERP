<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>添加试题</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/sysset.js"></script>
	<script type="text/javascript">
		//执行上传文件操作的函数		
		function ajaxFileUpload() {
			$.ajaxFileUpload({
				url : "${pageContext.request.contextPath}/fileUpload.do?name=topic&pathName="+$("input[name='data']").val(),
				secureuri : false, //是否启用安全提交,默认为false   
				fileElementId : 'data', //文件选择框的id属性  
				dataType : 'text',
				success : function(data) {
					if(data.substring(0,1) == 1){
						$("input[name='data']").val(data.substring(1));
						$("#data").val(data.substring(1));
						$("#result").text("上传成功！");
					}else{
						$("#result").text(data.substring(1));
					}
				},
				error : function(data) {
					$("#result").text("文件上传失败！");
				}
			});
		}
	</script>
</head>

<body>
	<div style="width:500px;margin:10px auto;">
		<form action="topicAdd.do" method="post" id="topForm">
			
			<div class="layui-form-item">
				<label class="layui-form-label">试题名称：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" maxlength="16" name="name">
				</div>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">试题类型：</label>
				<select class="select" name="type" id="type">
					<option value="0">请选择类型</option>
					<option>java</option>
					<option>C#</option>
					<option>PHP</option>
					<option>UI</option>
					<option>前端</option>
					<option>测试</option>
					<option>其它</option>
				</select>
				<span class="msg">&nbsp;*&nbsp;（除技术外请选其它）</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">试题级别：</label>
				<select class="select" name="level" id="level">
					<option value="0">请选择级别</option>
					<option>A</option>
					<option>B</option>
					<option>C</option>
				</select>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">所属部门：</label>
				<select class="select" name="dept.id" id="dept">
					<option value="0">请选择部门</option>
					<c:forEach var="dept" items="${deptList }">
						<option value="${dept.id }">${dept.name }</option>
					</c:forEach>
				</select>
				<span class="msg">&nbsp;*&nbsp;</span>
			</div>
			
			<div class="layui-form-item">
				<label class="layui-form-label">出题人：</label>
				<div class="layui-input-inline">
					<input type="text" class="layui-input" maxlength="16" name="person">
				</div>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">试题内容：</label>
				<div class="layui-input-block">
					<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="content"></textarea>
				</div>
			</div>
			
			<div class="layui-form-item layui-form-text">
				<label class="layui-form-label">备&nbsp;&nbsp;注：</label>
				<div class="layui-input-block">
					<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="remarks"></textarea>
				</div>
			</div>
			
			<div class="layui-inline">
				<label class="layui-form-label">试题附件：</label>
				<div class="layui-input-inline">
					<input type="file" class="layui-input" style="width:250px;border:0px;" id="data" name="myfiles" onchange="ajaxFileUpload()" >
					<input type="hidden" name="data" value="">
				</div>
				<div class="layui-input-inline">
					<label class="layui-form-label"></label>
					<span class="layui-input-inline" style="color:red;line-height:38px;" id="result"></span>
				</div>
			</div>
			
			<p style="width:100px;margin:0px auto;margin-top:30px;color:red;">${msg}</p>
			<input type="submit" value="添&nbsp;&nbsp;加" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
			<a href="topicList.do" class="layui-btn layui-btn-radius" style="margin-top:20px">返&nbsp;&nbsp;回</a>
			
		</form>
	</div>
</body>
</html>
