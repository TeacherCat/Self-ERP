package cn.hrms.sysset.entity;

import java.io.Serializable;

/**
 * 公共属性
 */
public class Property implements Serializable {

	private static final long serialVersionUID = -832246311858870503L;
	
	/**
	 * 属性编号
	 */
	private Integer id;
	
	/**
	 * 属性名称
	 */
	private String name;
	
	/**
	 * 属性描述
	 */
	private String desc;
	
	
	/**
	 * 构造函数
	 */
	public Property() { }
	
	public Property(Integer id, String name, String desc) {
		super();
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
