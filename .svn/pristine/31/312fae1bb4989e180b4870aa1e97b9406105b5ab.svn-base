package cn.hrms.recruit.biz;

import java.util.List;

import cn.hrms.recruit.entity.Resumes;
import cn.hrms.util.Page;

public interface ResumesBiz {

	/**
	 * 根据编号查询简历
	 * @param id 简历编号
	 * @return
	 */
	public Resumes findResumesByID(Integer id);
	
	/**
	 * 按条件分页查询简历
	 * @param resumes 查询条件
	 * @param page 分页对象
	 * @return
	 */
	public List<Resumes> findResumes(Resumes resumes, Page<Resumes> page);
	
	/**
	 * 查询总条数
	 * @param resumes 查询条件
	 * @return
	 */
	public Integer findTotalCount(Resumes resumes);
	
	/**
	 * 新增简历
	 * @param resumes 简历对象
	 * @return
	 */
	public Integer addResumes(Resumes resumes);
	
	/**
	 * 修改简历
	 * @param resumes
	 * @return
	 */
	public Integer updResumes(Resumes resumes);
	
	/**
	 * 修改简历状态
	 * @param resumes 简历对象
	 * @return
	 */
	public Integer updResumesState(Resumes resumes);
	
	/**
	 * 删除简历
	 * @param id 简历编号
	 * @return
	 */
	public Integer delResumes(Integer id);
}
