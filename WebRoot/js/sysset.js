//结束时间最小大于开始时间
function endTimeClick(){
	var strTime=$("#begin").val();
	if(strTime!=null && strTime!=""){
    	WdatePicker({
    		highLineWeekDay:true //周末高亮
    		,readOnly:true      //只读，只可用控件input中 修改内容
    		,dateFmt:'yyyy-MM-dd'
    		,minDate:strTime
        });
	}else{
		WdatePicker({
			highLineWeekDay:true //周末高亮
			,readOnly:true      //只读，只可用控件input中 修改内容
			,dateFmt:'yyyy-MM-dd'
	    });	
	}
};

//保留两位小数
function changeTwoDecimal_f(x){
   var f_x = parseFloat(x);
    if (isNaN(f_x)){  
        return '0.00';  
    }  
    var f_x = Math.round(f_x*100)/100;  
    var s_x = f_x.toString();  
    var pos_decimal = s_x.indexOf('.');  
    if (pos_decimal < 0){  
        pos_decimal = s_x.length;  
        s_x += '.';  
    }  
    while (s_x.length <= pos_decimal + 2){  
        s_x += '0';  
    }  
    return s_x;  
}

//计算薪酬项目标准总额
function totalPrice(){
	var money = 0;
	$("#stanForm").find("input[name='money']").each(function(i,d){
		//匹配项目金额的验证
		if(!/(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/.test($(d).val())){
			$(d).val("0.00");
		}else{
			$(d).val(changeTwoDecimal_f($(d).val()));
		}
		money += parseFloat($(d).val());
	});
	$("#stanForm").find("input[name='amount']").val(changeTwoDecimal_f(money));
	
	//循环得到输入的项目金额
	var allMoney = new Array();
	$(this).find("input[name='money']").each(function(i,d){
		allMoney.push($(d).val());
	});
	$(this).find("name='project'").val(allMoney);
};

//dom加载完后运行
$(function(){
	
	//职位非空判断和正则验证
	$("#postForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","职位名称不能为空");
    		flg = false;
    	}
    	if(document.getElementById("dept").value==0){
    		flg = false;
    	}
    	return flg;
    });
	
	
	
	//部门非空判断和正则验证
	$("#deptForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","部门名称不能为空");
    		flg = false;
    	}
    	if(($("input[name='phone']").val()!="") && !/^0\d{2,3}-\d{7,8}$/.test($("input[name='phone']").val())){
			$("input[name='phone']").val("");
			$("input[name='phone']").attr("placeholder","部门电话格式不正确");
			flg = false;
		};
    	return flg;
    });
	
	//薪酬项目非空判断和正则验证
	$("#proForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","项目名称不能为空");
    		flg = false;
    	}
    	return flg;
    });
	
	
	
	//公共属性非空判断和正则验证
	$("#propForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","属性名称不能为空");
    		flg = false;
    	}
    	return flg;
    });
	
	
	
	//试题非空判断和正则验证
	$("#topForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","试题名称不能为空");
    		flg = false;
    	}
    	if(document.getElementById("type").value==0){
    		flg = false;
    	}
    	if(document.getElementById("level").value==0){
    		flg = false;
    	}
    	if(document.getElementById("dept").value==0){
    		flg = false;
    	}
    	return flg;
    });
	
	//匹配出题人
	$("#topForm").find("input[name='person']").blur(function(){
		if(($(this).val()!="") && !/^([\u4E00-\u9FA5]+|[a-zA-Z]+)$/.test($(this).val())){
			$(this).val("");
			$(this).attr("placeholder","出题人格式不正确");
		};
	});
	
	
	
	//用户非空判断和正则验证
	$("#usersForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","用户名称不能为空");
    		flg = false;
    	}
    	if($("input[name='realName']").val()==""){
    		$("input[name='realName']").attr("placeholder","真实姓名不能为空");
    		flg = false;
    	}
    	if($("input[name='password']").val()==""){
    		$("input[name='password']").attr("placeholder","登陆密码不能为空");
    		flg = false;
    	}
    	if($("input[name='pwd']").val()==""){
    		$("input[name='pwd']").attr("placeholder","确认密码不能为空");
    		flg = false;
    	}
    	if($("input[name='telephone']").val()==""){
    		$("input[name='telephone']").attr("placeholder","联系电话不能为空");
    		flg = false;
    	}
    	if($("input[name='telephone']").val()!="" && !/^1[3,5,8]\d{9}$/.test($("input[name='telephone']").val())){
			$("input[name='telephone']").attr("placeholder","手机号格式不正确");
			flg = false;
		}
    	if($("#role").val()==0){
    		flg = false;
    	}
    	return flg;
    });
	
	$("#usersForm").find("input[name='name']").blur(function(){
		//判断用户名是否存在
		$.post(
			"checkUserName.do",
			"name="+$("#usersName").val(),
			function(data){
				if(data != "0"){
					$("#usersName").val("");
					$("#usersName").attr("placeholder","用户名已存在");
				}
			},
			"json"
		);
		//匹配用户名
		if(($(this).val()!="") && !/^[a-zA-Z0-9]{4,14}$/.test($(this).val())){
			$(this).val("");
			$(this).attr("placeholder","由4到14位数字或字母组成");
		};
	});
	
	//匹配真实姓名
	$("#usersForm").find("input[name='realName']").blur(function(){
		if(($(this).val()!="") && !/^([\u4E00-\u9FA5]+|[a-zA-Z]+)$/.test($(this).val())){
			$(this).val("");
			$(this).attr("placeholder","真实姓名格式不正确");
		}
	});
	
	//匹配密码
	$("#usersForm").find("input[name='password']").blur(function(){
		if(($(this).val()!="") && !/^[a-zA-Z0-9]{6,16}$/.test($(this).val())){
			$(this).val("");
			$(this).attr("placeholder","密码由6到16位数字或字母组成");
		}
	});
	
	//匹配密码和确认密码
	$("#usersForm").find("input[name='pwd']").blur(function(){
		if(($(this).val()!="") && $(this).val()!=$("input[name='password']").val()){
			$(this).val("");
			$(this).attr("placeholder","确认密码和密码不一样");
		}
	});
	
	
	
	//薪酬标准非空判断
	$("#stanForm").submit(function(){
    	var flg = true;
    	if($("input[name='name']").val()==""){
    		$("input[name='name']").attr("placeholder","标准名称不能为空");
    		flg = false;
    	}
    	return flg;
    });
    
    //点击提交
	$("#sub").click(function(){
//		alert(document.getElementByName("role").value);
//		if(document.getElementByName("role").value=='薪酬经理'){
//			$("input[name='state']").val("审核通过");
//		}else{
			$("input[name='state']").val("审核中");
//		}
		$("#stanForm").submit();
	});
	
	//薪酬标准审核非空判断
	$("#staAudForm").submit(function(){
    	var flg = true;
    	if(document.getElementById("state").value==0){
    		flg = false;
    	}
    	return flg;
    });
	
	
	
	//分页
	$("#page button").click(function(){
		var name = $(this).attr("name");
    	var currPageNo = parseInt($("#currPageNo").val());
    	if(name == "home"){
    		currPageNo = 1;
    	}
    	if(name == "prev"){
    		currPageNo += -1; 
    	}
    	if(name == "next"){
    		currPageNo += 1;
    	}
    	if(name == "last"){
    		currPageNo = $("#totalPageCount").val();
    	}
    	if(name == "ok"){
    		var reg = new RegExp("^[0-9]*[1-9][0-9]*$");
    		if(!reg.test($("#num").val())){return;}
    		currPageNo = $("#num").val();
    	}
    	$("#currPageNo").val(currPageNo);
    	$("#myForm").submit();
	});
	
	//日期
    $("#begin").click(function(){
        WdatePicker({
            highLineWeekDay:true //周末高亮
            ,readOnly:true      //只读，只可用控件input中 修改内容
            ,dateFmt:'yyyy-MM-dd HH:mm:ss'
        });
    });
});

//ajax提交删除
//function jqueryDel(url, id){
//	if(confirm('确认删除吗?') == true){
//		$.post(url, "id="+id, function(data){
//			$("#msg").html(data);
//		}, "json");
//	}
//}
//
//function jqueryDelByName(url, name){
//	if(confirm('确认删除吗?')){
//		$.post(url, "name="+name);
//	}
//}