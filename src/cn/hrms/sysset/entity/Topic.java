package cn.hrms.sysset.entity;
import java.io.Serializable;

/**
 * 题库
 */
public class Topic implements Serializable {

	private static final long serialVersionUID = 3384279618095513697L;

	/**
	 * 试题编号
	 */
	private Integer id;
	
	/**
	 * 试题名称
	 */
	private String name;
	
	/**
	 * 试题类型
	 */
	private String type;
	
	/**
	 * 试题级别
	 */
	private String level;
	
	/**
	 * 所属部门
	 */
	private Dept dept;
	
	/**
	 * 出题人
	 */
	private String person;
	
	/**
	 * 出题时间
	 */
	private String time;
	
	/**
	 * 试题内容
	 */
	private String content;
	
	/**
	 * 备注
	 */
	private String remarks;
	
	/**
	 * 试题附件
	 */
	private String data;
	
	
	/**
	 * 构造函数
	 */
	public Topic() { }
	
	public Topic(Integer id, String name, String type, String level, Dept dept,
			String person, String time, String content, String remarks,
			String data) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.level = level;
		this.dept = dept;
		this.person = person;
		this.time = time;
		this.content = content;
		this.remarks = remarks;
		this.data = data;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
