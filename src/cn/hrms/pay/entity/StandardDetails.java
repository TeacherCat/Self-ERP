package cn.hrms.pay.entity;

import java.io.Serializable;

import cn.hrms.sysset.entity.Project;

/*
 * 薪酬标准详情
 */
public class StandardDetails implements Serializable {

	private static final long serialVersionUID = 6599536307124510252L;
	
	/*
	 * 标准编号
	 */
	private Integer id;
	
	/*
	 * 薪酬标准编号
	 */
	private Standard standard;
	
	/*
	 * 项目名称
	 */
	private Project project;
	
	/*
	 * 项目金额
	 */
	private String money;

	public StandardDetails(Integer id, Standard standard, Project project,
			String money) {
		super();
		this.id = id;
		this.standard = standard;
		this.project = project;
		this.money = money;
	}

	public StandardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardDetails(Project project, String money) {
		super();
		this.project = project;
		this.money = money;
	}

	public StandardDetails(Integer id, String money) {
		super();
		this.id = id;
		this.money = money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

}
