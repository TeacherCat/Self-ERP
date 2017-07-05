package cn.hrms.recruit.entity;

import java.io.Serializable;
import cn.hrms.sysset.entity.Dept;
import cn.hrms.sysset.entity.Post;

/**
 * 职位发布
 */
public class Releases implements Serializable {

	private static final long serialVersionUID = 7101102968625294283L;

	/**
	 * 发布编号
	 */
	private Integer id;
	
	/**
	 * 所属部门
	 */
	private Dept dept;
	
	/**
	 * 所属职位
	 */
	private Post post;
	
	/**
	 * 招聘类型
	 */
	private String type;
	
	/**
	 * 招聘人数
	 */
	private Integer count;
	
	/**
	 * 学历要求
	 */
	private String education;
	
	/**
	 * 工作年限
	 */
	private String limit;
	
	/**
	 * 职位描述
	 */
	private String desc;
	
	/**
	 * 招聘要求
	 */
	private String requier;
	
	/**
	 * 登记人
	 */
	private String registrar;
	
	/**
	 * 登记时间
	 */
	private String time;
	
	/**
	 * 截止日期
	 */
	private String endTime;
	
	
	/**
	 * 构造函数
	 */
	public Releases() { }
	
	public Releases(Integer id, Dept dept, Post post, String type,
			Integer count, String education, String limit, String desc,
			String requier, String registrar, String time, String endTime) {
		this.id = id;
		this.dept = dept;
		this.post = post;
		this.type = type;
		this.count = count;
		this.education = education;
		this.limit = limit;
		this.desc = desc;
		this.requier = requier;
		this.registrar = registrar;
		this.time = time;
		this.endTime = endTime;
	}

	
	/**
	 * 属性封装
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	public Dept getDept() {
		return dept;
	}

	public Post getPost() {
		return post;
	}

	public String getType() {
		return type;
	}

	public Integer getCount() {
		return count;
	}

	public String getEducation() {
		return education;
	}

	public String getLimit() {
		return limit;
	}

	public String getDesc() {
		return desc;
	}

	public String getRequier() {
		return requier;
	}

	public String getRegistrar() {
		return registrar;
	}

	public String getTime() {
		return time;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setRequier(String requier) {
		this.requier = requier;
	}

	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
