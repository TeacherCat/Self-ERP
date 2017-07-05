<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>添加培训计划</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/plugins/layui/css/layui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/plugins/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript">
		$(function(){
			//日期
		    $("#begin,#end").click(function(){
		    	var s = "";
				var d = new Date();
				s+=d.getFullYear()+"-";
				s+=d.getMonth()+1+"-";
				s+=d.getDate();
		        WdatePicker({
		            highLineWeekDay:true, //周末高亮
		            readOnly:true,      //只读，只可用控件input中 修改内容
		            dateFmt:'yyyy-MM-dd HH:mm:00',
		            minDate:s+" 00:00:00",
		            maxDate:"2050-12-31 23:59:59"
		        });
		    });
		    
		    //点击提交
		    $("#sub").click(function(){
		    	$("input[name='state']").val("待审核");
		    	$("#myForm").submit();
		    });
		    
		    $("#myForm").submit(function(){
		    	var flg = true;
		    	if($("input[name='name']").val()==""){
		    		$("input[name='name']").attr("placeholder","培训名称不能为空");
		    		flg = false;
		    	}
		    	if($("input[name='lecturer']").val()==""){
		    		$("input[name='lecturer']").attr("placeholder","培训讲师不能为空");
		    		flg = false;
		    	}
		    	if($("input[name='startTime']").val()==""){
		    		$("input[name='startTime']").attr("placeholder","开始时间不能为空");
		    		flg = false;
		    	}
		    	if($("input[name='endTime']").val()==""){
		    		$("input[name='endTime']").attr("placeholder","结束时间不能为空");
		    		flg = false;
		    	}
		    	return flg;
		    });
		});

		//执行上传文件操作的函数		
		function ajaxFileUpload() {
			$.ajaxFileUpload({
				url : "${pageContext.request.contextPath}/fileUpload.do?name=train&pathName="+$("input[name='data']").val(),
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
<form id="myForm" action="<%=request.getContextPath()%>/addTrain.do" method="post">
	<div style="width:500px;margin:10px auto;">
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训名称：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" maxlength="16" name="name" >
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训讲师：</label>
			<div class="layui-input-inline">
				<input type="text" class="layui-input" maxlength="10" name="lecturer" >
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">开始时间：</label>
			<div class="layui-input-inline">
				<input type="text" id="begin" class="layui-input" name="startTime" >
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">结束时间：</label>
			<div class="layui-input-inline">
				<input type="text" id="end" class="layui-input" name="endTime" >
			</div>
			<span class="msg">&nbsp;*&nbsp;</span>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训目的：</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="goal"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">培训描述：</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="desc"></textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label">参训人员：</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea" maxlength="50" name="personnel"></textarea>
			</div>
		</div>
		
		<div class="layui-inline">
			<label class="layui-form-label">培训资料：</label>
			<div class="layui-input-inline">
				<input type="file" class="layui-input" style="width:250px;border:0px;" id="data" name="myfiles" onchange="ajaxFileUpload()" >
				<input type="hidden" name="data" value="">
			</div>
			<div class="layui-input-inline">
				<label class="layui-form-label"></label>
				<span class="layui-input-inline" style="color:red;line-height:38px;" id="result"></span>
			</div>
		</div><br/><br/><hr/>
		<input type="hidden" name="registrar" value="${sessionScope.users.realName}" />
		<input type="hidden" name="state" value="起草" />
		
		<input type="submit" value="保&nbsp;&nbsp;存" class="layui-btn layui-btn-radius" style="margin-top:20px;margin-left:100px;" />
		<input type="button" value="提&nbsp;&nbsp;交" class="layui-btn layui-btn-radius" style="margin-top:20px;" id="sub" />
		<a href="<%=request.getContextPath()%>/trainList.do" class="layui-btn layui-btn-radius" style="margin-top:20px">返&nbsp;&nbsp;回</a>
		
	</div>
</form>
</body>
</html>
