package cn.hrms.train.entity;
import java.io.Serializable;

/**
 * 培训反馈
 */
public class TrainBack implements Serializable {

	private static final long serialVersionUID = -278480526116510527L;
	
	/**
	 * 培训编号
	 */
	private Integer id;
	/**
	 * 反馈结果
	 */
	private String result;
	/**
	 * 反馈意见
	 */
	private String opinion;
	/**
	 * 反馈人
	 */
	private String person;
	/**
	 * 反馈时间
	 */
	private String time;
	
	
	/**
	 * 构造函数
	 */
	public TrainBack() { }
	
	public TrainBack(Integer id, String result, String opinion, String person,
			String time) {
		this.id = id;
		this.result = result;
		this.opinion = opinion;
		this.person = person;
		this.time = time;
	}
	
	
	/**
	 * 属性封装
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
