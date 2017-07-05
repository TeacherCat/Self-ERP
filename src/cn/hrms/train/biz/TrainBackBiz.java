package cn.hrms.train.biz;
import cn.hrms.train.entity.TrainBack;

public interface TrainBackBiz {

	/**
	 * 查询培训反馈
	 * @param id 反馈编号
	 * @return
	 */
	public TrainBack findTrainBack(Integer id);
	
	/**
	 * 新增培训反馈
	 * @param trainAudit 培训反馈对象
	 * @return
	 */
	public Integer addTrainBack(TrainBack trainBack);
	
	/**
	 * 删除培训反馈
	 * @param id 反馈编号
	 * @return
	 */
	public Integer delTrainBack(Integer id);
}
