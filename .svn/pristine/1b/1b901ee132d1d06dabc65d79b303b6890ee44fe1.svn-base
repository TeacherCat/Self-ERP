package cn.hrms.sysset.biz;

import java.util.List;

import cn.hrms.sysset.entity.Project;
import cn.hrms.util.Page;

public interface ProjectBiz {
	
	/**
	 * 查看薪酬项目
	 * @param page 分页条件
	 * @return
	 */
	public List<Project> findPro(Page<Project> page);
	
	/**
	 * 查看所有的薪酬项目
	 * @return
	 */
	public List<Project> findPro();
	
	/**
	 * 查看薪酬项目详情
	 * @param id 项目编号
	 * @return
	 */
	public Project findProById(Integer id);
	
	/**
	 * 薪酬项目总数
	 * @return
	 */
	public int proCount();
	
	/**
	 * 新增薪酬项目
	 * @param pro 项目信息
	 * @return
	 */
	public int addPro(Project pro);
	
	/**
	 * 删除薪酬项目
	 * @param id 项目编号
	 * @return
	 */
	public int delPro(Integer id);
	
	/**
	 * 修改薪酬项目
	 * @param pro 项目信息
	 * @return
	 */
	public int updPro(Project pro);

}
