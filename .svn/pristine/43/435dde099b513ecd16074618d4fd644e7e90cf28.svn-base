<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<div id="page" class="btable-paged" data-type="paged" style="margin:20px auto;width:660px;">
	<input type="hidden" id="currPageNo" value="${page.currPageNo}" name="currPageNo">
	<input type="hidden" id="totalPageCount" value="${page.pageTotalCount}">
	<div class="layui-box layui-laypage layui-laypage-default">
		<span class="layui-laypage-total">
			<button type="button" name="home">首页</button>
			<button type="button" name="prev">上一页</button>
			<span>${page.currPageNo} / ${page.pageTotalCount}</span>
			<button type="button" name="next">下一页</button>
			<button type="button" name="last">尾页</button> &#12288;
			到第<input type="number" id="num">页
			<button type="button" name="ok">确定</button>
		</span>
	</div>
	共&nbsp;${page.totalCount}&nbsp;条记录
</div>
