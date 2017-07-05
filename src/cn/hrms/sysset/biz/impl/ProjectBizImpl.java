package cn.hrms.sysset.biz.impl;

import java.util.List;

import cn.hrms.sysset.biz.ProjectBiz;
import cn.hrms.sysset.dao.ProjectDao;
import cn.hrms.sysset.entity.Project;
import cn.hrms.util.Page;

public class ProjectBizImpl implements ProjectBiz{
	private ProjectDao projectDao;

	public List<Project> findPro(Page<Project> page) {
		return projectDao.findPro(page);
	}

	public List<Project> findPro() {
		return projectDao.findPro();
	}

	public Project findProById(Integer id) {
		return projectDao.findProById(id);
	}

	public int proCount() {
		return projectDao.proCount();
	}

	public int addPro(Project pro) {
		return projectDao.addPro(pro);
	}

	public int delPro(Integer id) {
		return projectDao.delPro(id);
	}

	public int updPro(Project pro) {
		return projectDao.updPro(pro);
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

}
