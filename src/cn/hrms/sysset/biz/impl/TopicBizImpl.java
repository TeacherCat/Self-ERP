package cn.hrms.sysset.biz.impl;

import java.util.List;

import cn.hrms.sysset.biz.TopicBiz;
import cn.hrms.sysset.dao.TopicDao;
import cn.hrms.sysset.entity.Topic;
import cn.hrms.util.Page;

public class TopicBizImpl implements TopicBiz{
	private TopicDao topicDao;

	public List<Topic> findTop(Topic topic, Page<Topic> page) {
		return topicDao.findTop(topic, page);
	}

	public Topic findTopById(Integer id) {
		return topicDao.findTopById(id);
	}

	public int TopCount(Topic topic) {
		return topicDao.TopCount(topic);
	}

	public int addTop(Topic topic) {
		return topicDao.addTop(topic);
	}

	public int delTop(Integer id) {
		return topicDao.delTop(id);
	}

	public int updTop(Topic topic) {
		return topicDao.updTop(topic);
	}

	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}

}
