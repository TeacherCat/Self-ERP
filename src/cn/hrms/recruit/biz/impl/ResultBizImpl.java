package cn.hrms.recruit.biz.impl;

import cn.hrms.recruit.biz.ResultBiz;
import cn.hrms.recruit.dao.ResultDao;
import cn.hrms.recruit.entity.Result;

public class ResultBizImpl implements ResultBiz {

	private ResultDao resultDao;
	
	public Result findResultbyID(Integer id) {
		return resultDao.findResultbyID(id);
	}
	
	public Integer addResult(Result result) {
		return resultDao.addResult(result);
	}

	public Integer delResult(Integer id) {
		return resultDao.delResult(id);
	}

	
	
	public void setResultDao(ResultDao resultDao) {
		this.resultDao = resultDao;
	}
	
}
