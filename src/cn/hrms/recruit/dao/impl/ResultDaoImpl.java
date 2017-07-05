package cn.hrms.recruit.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.recruit.dao.ResultDao;
import cn.hrms.recruit.entity.Result;

public class ResultDaoImpl extends SqlSessionDaoSupport implements ResultDao {

	public Result findResultbyID(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.recruit.entity.Result.findResult", id);
	}

	public Integer addResult(Result result) {
		return super.getSqlSession().insert("cn.hrms.recruit.entity.Result.addResult", result);
	}

	public Integer delResult(Integer id) {
		return super.getSqlSession().delete("cn.hrms.recruit.entity.Result.delResult", id);
	}

}
