package cn.hrms.train.dao;
import java.util.List;
import cn.hrms.train.entity.Train;
import cn.hrms.util.Page;

public interface TrainDao {

	/**
	 * 按条件分页查询培训计划
	 * @param train 查询条件
	 * @param page 分页对象
	 * @return
	 */
	public List<Train> findTrain(Train train,Page<Train> page);
	
	/**
	 * 查询总条数
	 * @param train 查询条件
	 * @return
	 */
	public Integer findTotalCount(Train train);
	
	/**
	 * 新增培训
	 * @param train 培训对象
	 * @return
	 */
	public Integer addTrain(Train train);
	
	/**
	 * 修改培训信息
	 * @param train
	 * @return
	 */
	public Integer updTrain(Train train);
	
	/**
	 * 修改培训状态
	 * @param id 培训编号
	 * @param state 培训状态
	 * @return
	 */
	public Integer updTrainState(Train train);
	
	/**
	 * 删除培训
	 * @param id 培训编号
	 * @return
	 */
	public Integer delTrain(Integer id);
}
