package cn.hrms.recruit.entity;

import java.io.Serializable;

/**
 * 录用
 */
public class Hire implements Serializable {

	private static final long serialVersionUID = -8325586249755723032L;

	/**
	 * 简历编号
	 */
	private Integer id;
	
	/**
	 * 录用决议
	 */
	private String opinion;
	
	/**
	 * 录用人
	 */
	private String person;
	
	/**
	 * 录用时间
	 */
	private String time;

	
	/**
	 * 构造函数
	 */
	public Hire() { }

	public Hire(Integer id, String opinion, String person, String time) {
		this.id = id;
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

	public String getOpinion() {
		return opinion;
	}

	public String getPerson() {
		return person;
	}

	public String getTime() {
		return time;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
