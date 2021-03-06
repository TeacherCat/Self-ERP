package cn.hrms.pay.biz.impl;

import java.util.List;

import cn.hrms.pay.biz.StandardBiz;
import cn.hrms.pay.dao.StandardDao;
import cn.hrms.pay.entity.Standard;
import cn.hrms.util.Page;

public class StandardBizImpl implements StandardBiz {
	private StandardDao standardDao;

	public List<Standard> findStan(Standard stan, String endTime, String role, Page<Standard> page) {
		return standardDao.findStan(stan, endTime, role, page);
	}

	public Standard findStanById(Integer id) {
		return standardDao.findStanById(id);
	}

	public int stanCoun(Standard stan, String endTime, String role) {
		return standardDao.stanCoun(stan, endTime, role);
	}

	public int addStan(Standard stan) {
		return standardDao.addStan(stan);
	}

	public int delStan(Integer id) {
		return standardDao.delStan(id);
	}

	public int updStan(Standard stan) {
		return standardDao.updStan(stan);
	}

	public void setStandardDao(StandardDao standardDao) {
		this.standardDao = standardDao;
	}

}
