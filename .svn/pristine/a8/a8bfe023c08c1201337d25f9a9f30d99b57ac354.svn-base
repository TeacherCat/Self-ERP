package cn.hrms.sysset.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.sysset.dao.TopicDao;
import cn.hrms.sysset.entity.Topic;
import cn.hrms.util.Page;

public class TopicDaoImpl extends SqlSessionDaoSupport implements TopicDao {

	public List<Topic> findTop(Topic topic, Page<Topic> page) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("topic", topic);
		params.put("start", (page.getCurrPageNo()-1)*page.getPageSize());
		params.put("pageSize", page.getPageSize());
		return this.getSqlSession().selectList("cn.hrms.sysset.entity.Topic.findTop", params);
	}

	public Topic findTopById(Integer id) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Topic.findTopById", id);
	}

	public int TopCount(Topic topic) {
		return this.getSqlSession().selectOne("cn.hrms.sysset.entity.Topic.topCount", topic);
	}

	public int addTop(Topic topic) {
		return this.getSqlSession().insert("cn.hrms.sysset.entity.Topic.addTop", topic);
	}

	public int delTop(Integer id) {
		return this.getSqlSession().delete("cn.hrms.sysset.entity.Topic.delTop", id);
	}

	public int updTop(Topic topic) {
		return this.getSqlSession().update("cn.hrms.sysset.entity.Topic.updTop", topic);
	}

}
