package cn.hrms.pay.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.pay.dao.StaDetDao;
import cn.hrms.pay.entity.StandardDetails;

public class StaDetDaoImpl extends SqlSessionDaoSupport implements StaDetDao{

	public StandardDetails findStaDetById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.pay.entity.StandardDetails.findStaDetById", id);
	}

	public List<StandardDetails> findStanById(Integer stanId) {
		return this.getSqlSession().selectList("cn.hrms.pay.entity.StandardDetails.findStanById", stanId);
	}

	public int findStaDetByMin(Integer stanId) {
		return this.getSqlSession().selectOne("cn.hrms.pay.entity.StandardDetails.findStaDetByMin", stanId);
	}

	public int addStaDet(StandardDetails staDet) {
		return this.getSqlSession().insert("cn.hrms.pay.entity.StandardDetails.addStaDet", staDet);
	}

	public int delStaDet(Integer stanId) {
		return this.getSqlSession().delete("cn.hrms.pay.entity.StandardDetails.delStaDet", stanId);
	}

	public int updStaDet(StandardDetails staDet) {
		return this.getSqlSession().update("cn.hrms.pay.entity.StandardDetails.updStaDet", staDet);
	}

}
