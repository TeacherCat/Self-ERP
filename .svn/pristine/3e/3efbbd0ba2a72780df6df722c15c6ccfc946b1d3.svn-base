package cn.hrms.train.biz.impl;
import cn.hrms.train.biz.TrainBackBiz;
import cn.hrms.train.dao.TrainBackDao;
import cn.hrms.train.entity.TrainBack;

public class TrainBackBizImpl implements TrainBackBiz{

	private TrainBackDao trainBackDao;
	
	public TrainBack findTrainBack(Integer id) {
		return trainBackDao.findTrainBack(id);
	}

	public Integer addTrainBack(TrainBack trainBack) {
		return trainBackDao.addTrainBack(trainBack);
	}

	public Integer delTrainBack(Integer id) {
		return trainBackDao.delTrainBack(id);
	}

	
	public void setTrainBackDao(TrainBackDao trainBackDao) {
		this.trainBackDao = trainBackDao;
	}

}
