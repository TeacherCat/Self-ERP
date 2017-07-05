package cn.hrms.recruit.biz;

import cn.hrms.recruit.entity.Result;

public interface ResultBiz {

	/**
	 * 根据编号查询唯一面试结果对象
	 * @param id 编号
	 * @return
	 */
	public Result findResultbyID(Integer id);
	
	/**
	 * 新增面试结果
	 * @param result 面试结果对象
	 * @return
	 */
	public Integer addResult(Result result);
	
	/**
	 * 删除面试结果
	 * @param id 编号
	 * @return
	 */
	public Integer delResult(Integer id);
}
