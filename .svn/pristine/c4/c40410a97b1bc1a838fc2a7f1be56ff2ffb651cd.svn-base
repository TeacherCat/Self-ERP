package cn.hrms.train.biz.impl;

import cn.hrms.train.biz.TrainAuditBiz;
import cn.hrms.train.dao.TrainAuditDao;
import cn.hrms.train.entity.TrainAudit;


public class TrainAuditBizImpl implements TrainAuditBiz {

	private TrainAuditDao trainAuditDao;
	
	public TrainAudit findTrainAudit(Integer id) {
		return trainAuditDao.findTrainAudit(id);
	}

	public Integer addTrainAudit(TrainAudit trainAudit) {
		return trainAuditDao.addTrainAudit(trainAudit);
	}

	public Integer updTrainAudit(TrainAudit trainAudit) {
		return trainAuditDao.updTrainAudit(trainAudit);
	}
	
	public Integer delTrainAudit(Integer id) {
		return trainAuditDao.delTrainAudit(id);
	}

	
	public void setTrainAuditDao(TrainAuditDao trainAuditDao) {
		this.trainAuditDao = trainAuditDao;
	}

}
