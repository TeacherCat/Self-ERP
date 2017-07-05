package cn.hrms.recruit.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.recruit.dao.HireDao;
import cn.hrms.recruit.entity.Hire;

public class HireDaoImpl extends SqlSessionDaoSupport implements HireDao {

	public Hire findHireByID(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.recruit.entity.Hire.findHire", id);
	}

	public Integer addHire(Hire hire) {
		return super.getSqlSession().insert("cn.hrms.recruit.entity.Hire.addHire", hire);
	}

	public Integer delHire(Integer id) {
		return super.getSqlSession().delete("cn.hrms.recruit.entity.Hire.delHire", id);
	}

}
