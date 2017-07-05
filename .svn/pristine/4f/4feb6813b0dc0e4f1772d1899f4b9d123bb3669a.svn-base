package cn.hrms.pay.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.pay.dao.StaAudDao;
import cn.hrms.pay.entity.StandardAudit;

public class StaAudDaoImpl extends SqlSessionDaoSupport implements StaAudDao {

	public StandardAudit findStaAudById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.pay.entity.StandardAudit.findStaAudById", id);
	}

	public List<StandardAudit> findStaAud() {
		return this.getSqlSession().selectList("cn.hrms.pay.entity.StandardAudit.findStaAud");
	}

	public int addStaAud(StandardAudit staAud) {
		return this.getSqlSession().insert("cn.hrms.pay.entity.StandardAudit.addStaAud", staAud);
	}

	public int delStaAud(Integer id) {
		return this.getSqlSession().delete("cn.hrms.pay.entity.StandardAudit.delStaAud", id);
	}

	public int updStaAud(StandardAudit staAud) {
		return this.getSqlSession().update("cn.hrms.pay.entity.StandardAudit.updStaAud", staAud);
	}

}
