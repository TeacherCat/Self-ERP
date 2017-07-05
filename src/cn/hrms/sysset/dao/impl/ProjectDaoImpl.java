package cn.hrms.sysset.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.sysset.dao.ProjectDao;
import cn.hrms.sysset.entity.Project;
import cn.hrms.util.Page;

public class ProjectDaoImpl extends SqlSessionDaoSupport implements ProjectDao {

	public List<Project> findPro(Page<Project> page) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("start", (page.getCurrPageNo()-1)*page.getPageSize());
		params.put("pageSize", page.getPageSize());
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Project.findPro", params);
	}

	public List<Project> findPro() {
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Project.findProj");
	}

	public Project findProById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Project.findProById", id);
	}

	public int proCount() {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Project.proCount");
	}

	public int addPro(Project pro) {
		return this.getSqlSession().insert("cn.hrms.sysset.entity.Project.addPro", pro);
	}

	public int delPro(Integer id) {
		return this.getSqlSession().delete("cn.hrms.sysset.entity.Project.delPro", id);
	}

	public int updPro(Project pro) {
		return this.getSqlSession().update("cn.hrms.sysset.entity.Project.updPro", pro);
	}

}
