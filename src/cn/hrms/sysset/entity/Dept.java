package cn.hrms.sysset.entity;
import java.io.Serializable;

/**
 * 部门
 */
public class Dept implements Serializable{
	
	private static final long serialVersionUID = -9181655810413761136L;
	
	/**
	 * 部门编号
	 */
	private Integer id;
	/**
	 * 部门名称
	 */
	private String name;
	/**
	 * 部门描述
	 */
	private String desc;
	/**
	 * 部门备注
	 */
	private String remarks;
	/**
	 * 部门电话
	 */
	private String phone;
	
	/**
	 * 构造函数
	 */
	public Dept() { }
	
	public Dept(Integer id, String name, String desc, String remarks,
			String phone) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.remarks = remarks;
		this.phone = phone;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
