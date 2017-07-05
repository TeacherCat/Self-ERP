package cn.hrms.recruit.dao;

import cn.hrms.recruit.entity.Hire;

public interface HireDao {

	/**
	 * 根据编号查询唯一录用对象
	 * @param id 编号
	 * @return
	 */
	public Hire findHireByID(Integer id);
	
	/**
	 * 新增录用对象
	 * @param hire 录用对象
	 * @return
	 */
	public Integer addHire(Hire hire);
	
	/**
	 * 删除录用对象
	 * @param id 编号
	 * @return
	 */
	public Integer delHire(Integer id);
}
