package cn.hrms.sysset.biz.impl;

import java.util.List;

import cn.hrms.sysset.biz.DeptBiz;
import cn.hrms.sysset.dao.DeptDao;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.util.Page;

public class DeptBizImpl implements DeptBiz{
	private DeptDao deptDao;

	@Override
	public List<Dept> findDept(Dept dept) {
		return deptDao.findDept(dept);
	}

	@Override
	public List<Dept> findDept(Dept dept, Page<Dept> page) {
		return deptDao.findDept(dept, page);
	}

	@Override
	public Dept findDeptById(Integer id) {
		return deptDao.findDeptById(id);
	}

	@Override
	public int deptCount(Dept dept) {
		return deptDao.deptCount(dept);
	}

	@Override
	public int addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public int delDept(Integer id) {
		return deptDao.delDept(id);
	}

	@Override
	public int updDept(Dept dept) {
		return deptDao.updDept(dept);
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

}
