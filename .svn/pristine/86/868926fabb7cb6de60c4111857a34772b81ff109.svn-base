package cn.hrms.sysset.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.sysset.dao.DeptDao;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.util.Page;

public class DeptDaoImpl extends SqlSessionDaoSupport implements DeptDao{

	@Override
	public List<Dept> findDept(Dept dept) {
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Dept.findDeptByName", dept);
	}

	@Override
	public List<Dept> findDept(Dept dept, Page<Dept> page) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("dept", dept);
		params.put("start", (page.getCurrPageNo() - 1)*page.getPageSize());
		params.put("pageSize", page.getPageSize());
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Dept.findDept", params);
	}

	@Override
	public Dept findDeptById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Dept.findDeptById", id);
	}

	@Override
	public int deptCount(Dept dept) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Dept.deptCount", dept);
	}

	@Override
	public int addDept(Dept dept) {
		return this.getSqlSession().insert("cn.hrms.sysset.entity.Dept.addDept", dept);
	}

	@Override
	public int delDept(Integer id) {
		return this.getSqlSession().delete("cn.hrms.sysset.entity.Dept.delDept", id);
	}

	@Override
	public int updDept(Dept dept) {
		return this.getSqlSession().update("cn.hrms.sysset.entity.Dept.updDept", dept);
	}

}
