package cn.hrms.train.dao.impl;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import cn.hrms.train.dao.TrainBackDao;
import cn.hrms.train.entity.TrainBack;

public class TrainBackDaoImpl extends SqlSessionDaoSupport implements TrainBackDao{

	public TrainBack findTrainBack(Integer id) {
		return super.getSqlSession().selectOne("cn.hrms.train.entity.TrainBack.findTrainBackByID", id);
	}

	public Integer addTrainBack(TrainBack trainBack) {
		return super.getSqlSession().insert("cn.hrms.train.entity.TrainBack.addTrainBack", trainBack);
	}

	public Integer delTrainBack(Integer id) {
		return super.getSqlSession().delete("cn.hrms.train.entity.TrainBack.delTrainBack", id);
	}

}
