package cn.hrms.pay.dao;

import java.util.List;

import cn.hrms.pay.entity.StandardDetails;

public interface StaDetDao {
	
	/**
	 * 根据编号查找薪酬标准详情
	 * @param id 薪酬标准详情编号
	 * @return
	 */
	public StandardDetails findStaDetById(Integer id);
	
	/**
	 * 根据薪酬标准编号查找薪酬标准详情
	 * @param StanId 薪酬标准编号
	 * @return
	 */
	public List<StandardDetails> findStanById(Integer StanId);
	
	/**
	 * 根据薪酬标准查找最小编号的薪酬标准详情
	 * @param StanId 薪酬标准编号
	 * @return
	 */
	public int findStaDetByMin(Integer StanId);
	
	/**
	 * 新增薪酬标准详情
	 * @param staDet 薪酬标准详情信息
	 * @return
	 */
	public int addStaDet(StandardDetails staDet);
	
	/**
	 * 删除薪酬标准详情
	 * @param id 薪酬标准编号
	 * @return
	 */
	public int delStaDet(Integer stanId);
	
	/**
	 * 修改薪酬标准详情
	 * @param staDet 薪酬标准详情信息
	 * @return
	 */
	public int updStaDet(StandardDetails staDet);

}
