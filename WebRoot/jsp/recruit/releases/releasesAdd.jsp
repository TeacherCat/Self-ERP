<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>发布职位</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript">
		$(function(){
			//日期
		    $("#time").click(function(){
		        var s = "";
				var d = new Date();
				s+=d.getFullYear()+"-";
				s+=d.getMonth()+1+"-";
				s+=d.getDate();
		        WdatePicker({
		            highLineWeekDay:true, //周末高亮
		            readOnly:true,      //只读，只可用控件input中 修改内容
		            dateFmt:'yyyy-MM-dd 00:00:00',
		            minDate:s+" 00:00:00",
		            maxDate:"2050-12-31 23:59:59"
		        });
		    });
		
		    //部门-职位-级联菜单
			$("#dept").click(function(){
				$.post(
					"leaveMenu.do",
					"deptID="+$("#dept").val(),
					function(data){
						var postList = "<option value='0'>请选择</option>";
						for(var post in data){
							postList += "<option value="+ data[post].id +">"+ data[post].name +"</option>";
						}
						$("#post").html(postList);
					},
					"json"
				);
			});
			
			$("#myForm").submit(function(){
				var flg = true;
				if($("#dept").val()=="0"){
					flg = false;
				}
				if($("#post").val()=="0"){
					flg = false;
				}
				if($("input[name='count']").val()==""){
					$("input[name='count']").attr("placeholder","请输入人数");
					flg = false;
				}
				if($("input[name='count']").val()!="" && !/^[1-9]\d*$/.test($("input[name='count']").val())){
					$("input[name='count']").val("");
					$("input[name='count']").attr("placeholder","输入非法");
					flg = false;
				}
				if($("input[name='limit']").val()==""){
					$("input[name='limit']").attr("placeholder","请输入工作年限");
					flg = false;
				}
				if($("input[name='limit']").val()!="" && !/(^[1-9][0-9]*$)|(^[0-9].[5]$)|(^[0-9].[0]$)/.test($("input[name='limit']").val())){
					$("input[name='limit']").val("");
					$("input[name='limit']").attr("placeholder","输入非法");
					flg = false;
				}
				if($("input[name='endTime']").val()==""){
					$("input[name='endTime']").attr("placeholder","请输入工作年限");
					flg = false;
				}
				return flg;
			});
		});
    </script>
</head>

<body>

<form id="myForm" action="addReleases.do" method="post">
	<div class="layui-form-item" style="margin-top:20px;margin-right:20px;">
		
		<div class="layui-inline">
			<label class="layui-form-label">所属部门：</label>
			<select class="select" id="dept" name="dept.id">
				<option value="0">请选择</option>
				<c:forEach var="dept" items="${deptList}">
					<option value="${dept.id}">${dept.name}</option>
				</c:forEach>
			</select>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">所属职位：</label>
			<select class="select" id="post" name="post.id">
				<option value="0">请选择</option>
			</select>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">招聘类型：</label>
			<select class="select" name="type">
				<option>社会招聘</option>
				<option>校园招聘</option>
			</select>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div><br/><br/>
		
		<div class="layui-inline">
			<label class="layui-form-label">招聘人数：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" name="count" maxlength="4">
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">学历要求：</label>
			<select class="select" name="education">
				<option>初中及以下</option>
				<option>中专</option>
				<option>高中</option>
				<option>大专</option>
				<option>本科</option>
				<option>硕士</option>
				<option>博士及以上</option>
			</select>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">工作年限：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" name="limit" maxlength="4">
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div><br/><br/>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">职位描述：</label>
			<div class="layui-input-block">
				<textarea style="width:600px;" placeholder="请输入内容" class="layui-textarea" name="desc" maxlength="50"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">招聘要求：</label>
			<div class="layui-input-block">
				<textarea style="width:600px;" placeholder="请输入内容" class="layui-textarea" name="requier" maxlength="50"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">截止时间：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" name="endTime" id="time">
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		
		<input type="hidden" name="registrar" value="${sessionScope.users.realName}" />
		
		<input type="submit" value="发&nbsp;&nbsp;布" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
		<a href="releasesList.do" class="layui-btn layui-btn-radius" style="margin-top:20px">返&nbsp;&nbsp;回</a>
		
	</div>
</form>
</body>
</html>
