package cn.hrms.sysset.biz;

import java.util.List;

import cn.hrms.sysset.entity.Topic;
import cn.hrms.util.Page;

public interface TopicBiz {
	
	/**
	 * 查找试题
	 * @param topic 试题条件
	 * @param page 分页
	 * @return
	 */
	public List<Topic> findTop(Topic topic, Page<Topic> page);
	
	/**
	 * 查找试题详情
	 * @param id 试题编号
	 * @return
	 */
	public Topic findTopById(Integer id);
	
	/**
	 * 查找试题总数
	 * @param topic 试题条件
	 * @return
	 */
	public int TopCount(Topic topic);
	
	/**
	 * 新增试题
	 * @param topic 试题信息
	 * @return
	 */
	public int addTop(Topic topic);
	
	/**
	 * 删除试题
	 * @param id 试题编号
	 * @return
	 */
	public int delTop(Integer id);
	
	/**
	 * 修改试题
	 * @param topic 试题信息
	 * @return
	 */
	public int updTop(Topic topic);

}
