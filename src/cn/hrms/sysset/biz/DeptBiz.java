package cn.hrms.sysset.biz;

import java.util.List;

import cn.hrms.sysset.entity.Dept;
import cn.hrms.util.Page;

public interface DeptBiz {
	
	/**
	 * 查找部门
	 * @param dept 条件
	 * @return
	 */
	public List<Dept> findDept(Dept dept);
	
	/**
	 * 分页查看部门
	 * @param dept 条件
	 * @param pageno 当前页
	 * @return
	 */
	public List<Dept> findDept(Dept dept, Page<Dept> page);
	
	/**
	 * 根据部门编号查询详情
	 * @param id 编号
	 * @return
	 */
	public Dept findDeptById(Integer id);
	
	/**
	 * 部门总算
	 * @param dept 条件
	 * @return
	 */
	public int deptCount(Dept dept);
	
	/**
	 * 新增部门
	 * @param dept 部门信息
	 * @return
	 */
	public int addDept(Dept dept);
	
	/**
	 * 删除部门
	 * @param id 部门编号
	 * @return
	 */
	public int delDept(Integer id);
	
	/**
	 * 修改部门
	 * @param dept 部门信息
	 * @return
	 */
	public int updDept(Dept dept);

}
