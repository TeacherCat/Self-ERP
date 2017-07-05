package cn.hrms.pay.entity;

import java.io.Serializable;

/*
 * 薪酬标准
 */
public class Standard implements Serializable {

	private static final long serialVersionUID = 8519713234973545860L;

	/*
	 * 标准编号
	 */
	private Integer id;

	/*
	 * 标准名称
	 */
	private String name;

	/*
	 * 薪酬总额
	 */
	private String amount;

	/*
	 * 登记人
	 */
	private String registrar;

	/*
	 * 登记时间
	 */
	private String time;

	/*
	 * 状态
	 */
	private String state;

	public Standard(Integer id, String name, String amount, String registrar,
			String time, String state) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.registrar = registrar;
		this.time = time;
		this.state = state;
	}

	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard(Integer id) {
		super();
		this.id = id;
	}

	public Standard(Integer id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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
