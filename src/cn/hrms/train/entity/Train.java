package cn.hrms.train.entity;
import java.io.Serializable;

/**
 * 培训
 */
public class Train implements Serializable {

	private static final long serialVersionUID = -7662697467918343963L;
	
	/**
	 * 培训编号
	 */
	private Integer id;
	/**
	 * 培训名称
	 */
	private String name;
	/**
	 * 培训讲师
	 */
	private String lecturer;
	/**
	 * 培训目的
	 */
	private String goal;
	/**
	 * 培训描述
	 */
	private String desc;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 参训人员
	 */
	private String personnel;
	/**
	 * 培训资料
	 */
	private String data;
	/**
	 * 登记人
	 */
	private String registrar;
	/**
	 * 登记时间
	 */
	private String time;
	/**
	 * 状态
	 */
	private String state;
	
	
	/**
	 * 构造函数
	 */
	public Train() { }
	
	public Train(Integer id) {
		this.id = id;
	}

	public Train(Integer id, String state){
		this.id = id;
		this.state = state;
	}
	
	public Train(Integer id, String name, String lecturer, String goal,
			String desc, String startTime, String endTime, String personnel,
			String data, String registrar, String time, String state) {
		this.id = id;
		this.name = name;
		this.lecturer = lecturer;
		this.goal = goal;
		this.desc = desc;
		this.startTime = startTime;
		this.endTime = endTime;
		this.personnel = personnel;
		this.data = data;
		this.registrar = registrar;
		this.time = time;
		this.state = state;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPersonnel() {
		return personnel;
	}
	public void setPersonnel(String personnel) {
		this.personnel = personnel;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRegistrar() {
		return registrar;
	}
	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
