<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
	<title>档案列表</title>
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

<form id="myForm" action="archivesList.do" method="post">
	<div class="layui-form-item" style="margin-top:20px;">
		<div class="layui-inline">
			<label class="layui-form-label">档案编号：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" maxlength="10" name="id" value="${archives.id}" />
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">姓&#12288;&#12288;名：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" maxlength="16" name="name" value="${archives.name}" />
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">性&#12288;&#12288;别：</label>
			<select class="select" name="sex">
				<option value="0">不限</option>
				<option value="男" <c:if test="${archives.sex=='男'}">selected="selected"</c:if>>男</option>
				<option value="女" <c:if test="${archives.sex=='女'}">selected="selected"</c:if>>女</option>
			</select>
		</div>
	</div>
	
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label">籍&#12288;&#12288;贯：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" maxlength="16" name="place" value="${archives.place}" />
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">学&#12288;&#12288;历：</label>
			<div class="layui-input-inline">
				<select class="select" name="education">
					<option value="0">不限</option>
					<option value="初中及以下" <c:if test="${archives.education=='初中及以下'}">selected="selected"</c:if>>初中及以下</option>
					<option value="中专" <c:if test="${archives.education=='中专'}">selected="selected"</c:if>>中专</option>
					<option value="高中" <c:if test="${archives.education=='高中'}">selected="selected"</c:if>>高中</option>
					<option value="大专" <c:if test="${archives.education=='大专'}">selected="selected"</c:if>>大专</option>
					<option value="本科" <c:if test="${archives.education=='本科'}">selected="selected"</c:if>>本科</option>
					<option value="硕士" <c:if test="${archives.education=='硕士'}">selected="selected"</c:if>>硕士</option>
					<option value="博士及以上" <c:if test="${archives.education=='博士及以上'}">selected="selected"</c:if>>博士及以上</option>
				</select>
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">&nbsp;&nbsp;档案状态：</label>
			<div class="layui-input-inline">
				<select class="select" name="state">
					<option value="0">不限</option>
					<option value="起草" <c:if test="${archives.state=='起草'}">selected="selected"</c:if>>起草</option>
					<option value="待审核" <c:if test="${archives.state=='待审核'}">selected="selected"</c:if>>待审核</option>
					<option value="审核通过" <c:if test="${archives.state=='审核通过'}">selected="selected"</c:if>>审核通过</option>
					<option value="驳回" <c:if test="${archives.state=='驳回'}">selected="selected"</c:if>>驳回</option>
					<option value="拒绝" <c:if test="${archives.state=='拒绝'}">selected="selected"</c:if>>拒绝</option>
					<option value="已删除" <c:if test="${archives.state=='已删除'}">selected="selected"</c:if>>已删除</option>
				</select>
			</div>
		</div>
		<input type="submit" class="layui-btn layui-btn-radius" style="margin-top:-5px;" value="查&nbsp;询" />
		<a class="layui-btn layui-btn-radius" style="margin-top:-5px;" href="addArchives.do?num=1">档&nbsp;案&nbsp;登&nbsp;记</a>
	</div>
	
	<div class="layui-field-box layui-form">
		<table class="layui-table admin-table">
			<thead>
				<tr>
					<th width="5%">编号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">学历</th>
					<th width="10%">籍贯</th>
					<th width="10%">所属部门</th>
					<th width="10%">所属职位</th>
					<th width="15%">建档时间</th>
					<th width="10%">档案状态</th>
					<th width="30%">操作</th>
				</tr>
			</thead>
			<c:if test="${page.pageList.size()==0}">
				<tr>
					<td colspan="10" style="text-align:center;color:red;line-height:50px;">暂未查到相关数据！</td>
				</tr>
			</c:if>
			<c:forEach var="archives" items="${page.pageList}">
				<tr>
					<td>${archives.id}</td>
					<td>${archives.name}</td>
					<td>${archives.sex}</td>
					<td>${archives.education}</td>
					<td>${archives.place}</td>
					<td>${archives.dept.name}</td>
					<td>${archives.post.name}</td>
					<td>${fn:substring(archives.time,0,10)}</td>
					<td>${archives.state}</td>
					<td>
						<a href="detailArchives.do?archivesID=${archives.id}" class="layui-btn layui-btn-mini">详情</a>
						
						<c:if test="${(archives.state=='起草' || archives.state=='打回') && sessionScope.users.role.name=='人事专员' }">
							<a href="updArchives.do?archivesID=${archives.id}" class="layui-btn layui-btn-normal layui-btn-mini">修改</a>
						</c:if>
						
						<c:if test="${archives.state=='审核通过' && sessionScope.users.role.name=='人事专员' }">
							<a href="changeArchives.do?archivesID=${archives.id}" class="layui-btn layui-btn-mini">申请变更</a>
						</c:if>
						
						<c:if test="${archives.state=='待审核' && sessionScope.users.role.name=='人事经理' }">
							<a href="auditArchives.do?archivesID=${archives.id}" class="layui-btn layui-btn-mini">审核</a>
						</c:if>
						
						<c:if test="${archives.state!='已删除' && sessionScope.users.role.name=='人事经理' }">
							<a href="delLogArchives.do?archivesID=${archives.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-danger layui-btn-mini" onclick="return confirm('此删除为逻辑删除，可恢复，删除吗？');">删除</a>
						</c:if>
						
						<c:if test="${archives.state=='已删除' && sessionScope.users.role.name=='人事经理' }">
							<a href="recArchives.do?archivesID=${archives.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-normal layui-btn-mini" onclick="return confirm('确定要恢复当前已删除的档案信息吗？');">恢复</a>
						</c:if>
						
						<c:if test="${archives.state=='已删除' && sessionScope.users.role.name=='人事经理' }">
							<a href="delPhyArchives.do?archivesID=${archives.id}&currPageNo=${page.currPageNo}" class="layui-btn layui-btn-danger layui-btn-mini" onclick="return confirm('此删除为物理删除，不可恢复！！！删除吗？');">永久删除</a>
						</c:if>
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
