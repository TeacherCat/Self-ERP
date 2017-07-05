package cn.hrms.sysset.dao;

import java.util.List;

import cn.hrms.sysset.entity.Property;
import cn.hrms.util.Page;

public interface PropertyDao {
	
	/**
	 * 查找公共属性
	 * @param pro 条件
	 * @param page 分页
	 * @return
	 */
	public List<Property> findPro(Property pro, Page<Property> page);
	
	/**
	 * 查看公共属性详情
	 * @param id 公共属性编号
	 * @return
	 */
	public Property findProById(Integer id);
	
	/**
	 * 查找公共属性总数
	 * @param pro 条件
	 * @return
	 */
	public int proCount(Property pro);
	
	/**
	 * 新增公共属性
	 * @param pro 公共属性信息
	 * @return
	 */
	public int addPro(Property pro);
	
	/**
	 * 删除公共属性
	 * @param id 公共属性编号
	 * @return
	 */
	public int delPro(Integer id);
	
	/**
	 * 修改公共属性
	 * @param pro 公共属性信息
	 * @return
	 */
	public int updPro(Property pro);

}
