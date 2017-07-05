package cn.hrms.train.dao.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hrms.train.dao.TrainDao;
import cn.hrms.train.entity.Train;
import cn.hrms.util.Page;

public class TrainDaoImpl extends SqlSessionDaoSupport implements TrainDao {

	public List<Train> findTrain(Train train, Page<Train> page) {
		Map<String ,Object> params = new HashMap<String, Object>(); 
		params.put("train", train);
		params.put("start", ((page.getCurrPageNo()-1)*page.getPageSize()));
		params.put("size", page.getPageSize());
		return super.getSqlSession().selectList("cn.hrms.train.entity.Train.findTrain",params);
	}

	public Integer findTotalCount(Train train) {
		return super.getSqlSession().selectOne("cn.hrms.train.entity.Train.findTotalCount", train);
	}

	public Integer addTrain(Train train) {
		return super.getSqlSession().insert("cn.hrms.train.entity.Train.addTrain",train);
	}

	public Integer updTrain(Train train) {
		return super.getSqlSession().update("cn.hrms.train.entity.Train.updTrain", train);
	}

	public Integer updTrainState(Train train) {
		return super.getSqlSession().update("cn.hrms.train.entity.Train.updTrainState", train);
	}

	public Integer delTrain(Integer id) {
		return super.getSqlSession().delete("cn.hrms.train.entity.Train.delTrain", id);
	}

	
}
