package cn.hrms.recruit.entity;

import java.io.Serializable;

/**
 * 简历
 */
public class Resumes implements Serializable {

	private static final long serialVersionUID = 34423101049608152L;

	/**
	 * 简历编号
	 */
	private Integer id;
	
	/**
	 * 职位发布对象
	 */
	private Releases releases;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 年龄
	 */
	private Integer age;
	
	/**
	 * 学历
	 */
	private String education;
	
	/**
	 * 联系电话
	 */
	private String telephone;
	
	/**
	 * 简历附件
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
	 * 简历状态
	 */
	private String state;

	
	/**
	 * 构造函数
	 */
	public Resumes() { }

	public Resumes(Integer id, String state){
		this.id = id;
		this.state = state;
	}
	
	public Resumes(Integer id, Releases releases, String name, String sex,
			Integer age, String education, String telephone, String data,
			String registrar, String time, String state) {
		this.id = id;
		this.releases = releases;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.education = education;
		this.telephone = telephone;
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

	public Releases getReleases() {
		return releases;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public Integer getAge() {
		return age;
	}

	public String getEducation() {
		return education;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getData() {
		return data;
	}

	public String getRegistrar() {
		return registrar;
	}

	public String getTime() {
		return time;
	}

	public String getState() {
		return state;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setRegistrar(String registrar) {
		this.registrar = registrar;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
