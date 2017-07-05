package cn.hrms.recruit.biz.impl;

import cn.hrms.recruit.biz.HireBiz;
import cn.hrms.recruit.dao.HireDao;
import cn.hrms.recruit.entity.Hire;

public class HireBizImpl implements HireBiz {

	private HireDao hireDao;
	
	public Hire findHireByID(Integer id) {
		return hireDao.findHireByID(id);
	}

	public Integer addHire(Hire hire) {
		return hireDao.addHire(hire);
	}

	public Integer delHire(Integer id) {
		return hireDao.delHire(id);
	}
	
	
	public void setHireDao(HireDao hireDao) {
		this.hireDao = hireDao;
	}
	
}
