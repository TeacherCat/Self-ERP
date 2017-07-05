package cn.hrms.sysset.entity;

import java.io.Serializable;

/**
 * 薪酬项目
 */
public class Project implements Serializable {

	private static final long serialVersionUID = -8805897598647636345L;
	
	/**
	 * 项目编号
	 */
	private Integer id;
	
	/**
	 * 项目名称
	 */
	private String name;
	
	/**
	 * 项目描述
	 */
	private String desc;
	
	
	/**
	 * 构造函数
	 */
	public Project() { }
	
	public Project(Integer id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
