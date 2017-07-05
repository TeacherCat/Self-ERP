package cn.hrms.pay.biz;

import java.util.List;

import cn.hrms.pay.entity.StandardAudit;

public interface StaAudBiz {
	
	/**
	 * 根据薪酬标准查找薪酬标准审核
	 * @param id 薪酬标准编号
	 * @return
	 */
	public StandardAudit findStaAudById(Integer id);
	
	/**
	 * 查询所有薪酬标准审核
	 * @return
	 */
	public List<StandardAudit> findStaAud();
	
	/**
	 * 新增薪酬标准审核
	 * @param staAud 薪酬标准审核信息
	 * @return
	 */
	public int addStaAud(StandardAudit staAud);
	
	/**
	 * 删除薪酬标准审核
	 * @param id 薪酬标准编号
	 * @return
	 */
	public int delStaAud(Integer id);
	
	/**
	 * 修改薪酬标准审核
	 * @param staAud 薪酬标准审核信息
	 * @return
	 */
	public int updStaAud(StandardAudit staAud);

}
