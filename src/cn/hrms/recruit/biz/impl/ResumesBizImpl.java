package cn.hrms.recruit.biz.impl;

import java.util.List;

import cn.hrms.recruit.biz.ResumesBiz;
import cn.hrms.recruit.dao.ResumesDao;
import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Page;

public class ResumesBizImpl implements ResumesBiz{

	private ResumesDao resumesDao;
	
	public Resumes findResumesByID(Integer id) {
		return resumesDao.findResumesByID(id);
	}

	public List<Resumes> findResumes(Resumes resumes, Page<Resumes> page) {
		return resumesDao.findResumes(resumes, page);
	}

	public Integer findTotalCount(Resumes resumes) {
		return resumesDao.findTotalCount(resumes);
	}

	public Integer addResumes(Resumes resumes) {
		return resumesDao.addResumes(resumes);
	}

	public Integer updResumes(Resumes resumes) {
		return resumesDao.updResumes(resumes);
	}

	public Integer updResumesState(Resumes resumes) {
		return resumesDao.updResumesState(resumes);
	}
	
	public Integer delResumes(Integer id) {
		return resumesDao.delResumes(id);
	}

	
	
	public void setResumesDao(ResumesDao resumesDao) {
		this.resumesDao = resumesDao;
	}

}
