package cn.hrms.pay.biz.impl;

import java.util.List;

import cn.hrms.pay.biz.StaAudBiz;
import cn.hrms.pay.dao.StaAudDao;
import cn.hrms.pay.entity.StandardAudit;

public class StaAudBizImpl implements StaAudBiz{
	private StaAudDao staAudDao;

	public StandardAudit findStaAudById(Integer id) {
		return staAudDao.findStaAudById(id);
	}

	public List<StandardAudit> findStaAud() {
		return staAudDao.findStaAud();
	}

	public int addStaAud(StandardAudit staAud) {
		return staAudDao.addStaAud(staAud);
	}

	public int delStaAud(Integer id) {
		return staAudDao.delStaAud(id);
	}

	public int updStaAud(StandardAudit staAud) {
		return staAudDao.updStaAud(staAud);
	}

	public void setStaAudDao(StaAudDao staAudDao) {
		this.staAudDao = staAudDao;
	}

}
