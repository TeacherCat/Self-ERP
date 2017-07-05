package cn.hrms.pay.entity;

import java.io.Serializable;
import java.util.Date;

/*
 * 薪酬标准审核
 */
public class StandardAudit implements Serializable {

	private static final long serialVersionUID = 2130526421568980611L;
	
	/*
	 * 标准编号
	 */
	private Standard standard;
	
	/*
	 * 审核结果
	 */
	private String result;
	
	/*
	 * 审核意见
	 */
	private String opinion;
	
	/*
	 * 审核人
	 */
	private String person;
	
	/*
	 * 审核时间
	 */
	private Date time;

	public StandardAudit(Standard standard, String result, String opinion,
			String person, Date time) {
		super();
		this.standard = standard;
		this.result = result;
		this.opinion = opinion;
		this.person = person;
		this.time = time;
	}

	public StandardAudit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
