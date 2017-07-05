<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>简历列表</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		$(function(){
		    //分页
		    $("#page button").click(function(){
		    	var name = $(this).attr("name");
		    	var currPageNo = parseInt($("#currPageNo").val());
		    	if(name == "shou"){
		    		currPageNo = 1;
		    	}
		    	if(name == "shang"){
		    		currPageNo += -1; 
		    	}
		    	if(name == "xia"){
		    		currPageNo += 1;
		    	}
		    	if(name == "wei"){
		    		currPageNo = $("#totalPageCount").val();
		    	}
		    	if(name == "ok"){
		    		var reg = /^[0-9]*[1-9][0-9]*$/;
		    		if(!reg.test($("#num").val())){return;}
		    		currPageNo = $("#num").val();
		    	}
		    	$("#currPageNo").val(currPageNo);
		    	$("#myForm").submit();
		    });
		    
		    $("#myForm").submit(function(){
		    	var flg = true;
		    	if($("input[name='id']").val()!="" && !/^[1-9]\d*$/.test($("input[name='id']").val())){
					$("input[name='id']").val("");
					$("input[name='id']").attr("placeholder","输入非法");
					flg = false;
				}
				return flg;
		    });
		});
    </script>
</head>

<body>
<c:if test="${sessionScope.users.role.name=='人事专员' || sessionScope.users.role.name=='人事经理'}">

<form id="myForm" action="resumesList.do" method="post">
	<div class="layui-form-item" style="margin-top:20px;">
		<div class="layui-inline">
			<label class="layui-form-label">编&#12288;&#12288;号：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" name="id" value="${resumes.id}" />
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">姓&#12288;&#12288;名：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" name="name" value="${resumes.name}">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">性&#12288;&#12288;别：</label>
			<div class="layui-input-inline">
				<select class="select" name="sex">
					<option value="0">不限</option>
					<option value="男" <c:if test="${resumes.sex=='男'}">selected="selected"</c:if>>男</option>
					<option value="女" <c:if test="${resumes.sex=='女'}">selected="selected"</c:if>>女</option>
				</select>
			</div>
		</div>
	</div>

	<div class="layui-form-item" style="margin-top:20px;">
		<div class="layui-inline">
			<label class="layui-form-label">年&#12288;&#12288;龄：</label>
			<div class="layui-input-inline">
				<select class="select" name="age">
					<option value="0">不限</option>
					<option value="1" <c:if test="${resumes.age==1}">selected="selected"</c:if>>26岁以下</option>
					<option value="2" <c:if test="${resumes.age==2}">selected="selected"</c:if>>26岁-30岁</option>
					<option value="3" <c:if test="${resumes.age==3}">selected="selected"</c:if>>31岁-40岁</option>
					<option value="4" <c:if test="${resumes.age==4}">selected="selected"</c:if>>40岁以上</option>
				</select>
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">学&#12288;&#12288;历：</label>
			<div class="layui-input-inline">
				<select class="select" name="education">
					<option value="0">不限</option>
					<option value="初中及以下" <c:if test="${resumes.education=='初中及以下'}">selected="selected"</c:if>>初中及以下</option>
					<option value="中专" <c:if test="${resumes.education=='中专'}">selected="selected"</c:if>>中专</option>
					<option value="高中" <c:if test="${resumes.education=='高中'}">selected="selected"</c:if>>高中</option>
					<option value="大专" <c:if test="${resumes.education=='大专'}">selected="selected"</c:if>>大专</option>
					<option value="本科" <c:if test="${resumes.education=='本科'}">selected="selected"</c:if>>本科</option>
					<option value="硕士" <c:if test="${resumes.education=='硕士'}">selected="selected"</c:if>>硕士</option>
					<option value="博士及以上" <c:if test="${resumes.education=='博士及以上'}">selected="selected"</c:if>>博士及以上</option>
				</select>
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">状&#12288;&#12288;态：</label>
			<div class="layui-input-inline">
				<select class="select" name="state">
					<option value="0">不限</option>
					<option value="起草" <c:if test="${resumes.state=='起草'}">selected="selected"</c:if>>起草</option>
					<option value="待面试" <c:if test="${resumes.state=='待面试'}">selected="selected"</c:if>>待面试</option>
					<option value="面试通过" <c:if test="${resumes.state=='面试通过'}">selected="selected"</c:if>>面试通过</option>
					<option value="面试不通过" <c:if test="${resumes.state=='面试不通过'}">selected="selected"</c:if>>面试不通过</option>
					<option value="录用" <c:if test="${resumes.state=='录用'}">selected="selected"</c:if>>录用</option>
				</select>
			</div>
		</div>
		
		<input type="submit" class="layui-btn layui-btn-radius" style="margin-top:-5px;" value="查&nbsp;询" />
		<a class="layui-btn layui-btn-radius" style="margin-top:-5px;" href="addResumes.do?num=1">简&nbsp;历&nbsp;登&nbsp;记</a>
	</div>
	
	<div class="layui-field-box layui-form">
		<table class="layui-table admin-table">
			<thead>
				<tr>
					<th width="8%">编号</th>
					<th width="10%">姓名</th>
					<th width="8%">性别</th>
					<th width="10%">年龄</th>
					<th width="10%">学历</th>
					<th width="15%">应聘职位</th>
					<th width="15%">登记时间</th>
					<th width="10%">简历状态</th>
					<th wudtg="30%">操作</th>
				</tr>
			</thead>
			<c:if test="${page.pageList.size()==0}">
				<tr>
					<td colspan="9" style="text-align:center;color:red;line-height:50px;">暂未查到相关数据！</td>
				</tr>
			</c:if>
			<c:forEach var="resumes" items="${page.pageList}">
				<tr>
					<td>${resumes.id}</td>
					<td>${resumes.name}</td>
					<td>${resumes.sex}</td>
					<td>${resumes.age}</td>
					<td>${resumes.education}</td>
					<td>${resumes.releases.post.name}</td>
					<td>${fn:substring(resumes.time,0,10)}</td>
					<td>${resumes.state}</td>
					<td>
						<c:if test="${resumes.state=='起草'}">
							<a href="updResumes.do?resumesID=${resumes.id}" class="layui-btn layui-btn-normal layui-btn-mini">修改</a>
						</c:if>
						<a href="detailResumes.do?resumesID=${resumes.id}" class="layui-btn layui-btn-mini">详情</a>
						<a href="delResumes.do?resumesID=${resumes.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-danger layui-btn-mini" onclick="return confirm('确定要删除吗？');">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<p style="width:100px;margin:0px auto;margin-top:30px;color:red;">${msg}</p>
	</div>

	<div id="page" class="btable-paged" data-type="paged" style="margin:20px auto;width:660px;">
		<input type="hidden" id="currPageNo" value="${page.currPageNo}" name="currPageNo">
		<input type="hidden" id="totalPageCount" value="${page.pageTotalCount}">
		<div class="layui-box layui-laypage layui-laypage-default">
			<span class="layui-laypage-total">
			<button type="button" name="shou">首页</button>
			<button type="button" name="shang">上一页</button>
			<span>${page.currPageNo} / ${page.pageTotalCount}</span>
			<button type="button" name="xia">下一页</button>
			<button type="button" name="wei">尾页</button>
			&#12288;到第<input type="number" id="num">页
			<button type="button" name="ok">确定</button>
			</span>
		</div>
		共&nbsp;${page.totalCount}&nbsp;条记录
	</div>
</form>
</c:if>

<c:if test="${sessionScope.users.role.name!='人事专员' && sessionScope.users.role.name!='人事经理' }">
	<div style="font-size:22px;width:250px;margin:300px auto;color:red;">抱歉，您没有访问权限！</div>
</c:if>
</body>
</html>
