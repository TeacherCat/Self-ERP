package cn.hrms.train.dao.impl;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.train.dao.TrainAuditDao;
import cn.hrms.train.entity.TrainAudit;

public class TrainAuditDaoImpl extends SqlSessionDaoSupport implements TrainAuditDao{

	public TrainAudit findTrainAudit(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.train.entity.TrainAudit.findTrainAuditByID", id);
	}

	public Integer addTrainAudit(TrainAudit trainAudit) {
		return super.getSqlSession().insert("cn.hrms.train.entity.TrainAudit.addTrainAudit", trainAudit);
	}
	
	public Integer updTrainAudit(TrainAudit trainAudit) {
		return super.getSqlSession().update("cn.hrms.train.entity.TrainAudit.updTrainAudit", trainAudit);
	}

	public Integer delTrainAudit(Integer id) {
		return super.getSqlSession().delete("cn.hrms.train.entity.TrainAudit.delTrainAudit", id);
	}

}
