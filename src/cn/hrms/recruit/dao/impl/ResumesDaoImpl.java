package cn.hrms.recruit.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.recruit.dao.ResumesDao;
import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Page;

public class ResumesDaoImpl extends SqlSessionDaoSupport implements ResumesDao{

	public Resumes findResumesByID(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.recruit.entity.Resumes.findResumesById", id);
	}

	public List<Resumes> findResumes(Resumes resumes, Page<Resumes> page) {
		Map<String ,Object> params = new HashMap<String, Object>();
		params.put("resumes", resumes);
		params.put("start", ((page.getCurrPageNo()-1)*page.getPageSize()));
		params.put("size", page.getPageSize());
		return super.getSqlSession().selectList("cn.hrms.recruit.entity.Resumes.findResumes", params);
	}

	public Integer findTotalCount(Resumes resumes) {
		return super.getSqlSession().selectOne("cn.hrms.recruit.entity.Resumes.findTotalCount", resumes);
	}

	public Integer addResumes(Resumes resumes) {
		return super.getSqlSession().insert("cn.hrms.recruit.entity.Resumes.addResumes", resumes);
	}

	public Integer updResumes(Resumes resumes) {
		return super.getSqlSession().update("cn.hrms.recruit.entity.Resumes.updResumes", resumes);
	}

	public Integer updResumesState(Resumes resumes) {
		return super.getSqlSession().update("cn.hrms.recruit.entity.Resumes.updResumesState", resumes);
	}
	
	public Integer delResumes(Integer id) {
		return super.getSqlSession().delete("cn.hrms.recruit.entity.Resumes.delResumes", id);
	}

}
