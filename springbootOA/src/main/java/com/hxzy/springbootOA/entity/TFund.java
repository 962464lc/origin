package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * @author Ryo Liu
 * @category 公积金表
 * 
 */
@Entity
@Table(name="t_fund")
public class TFund implements Serializable {
	private static final long serialVersionUID = 1L;
	//ID
	private int fundId;
	//账户
	private String account;
	//缴纳机构
	private String agency;
	//密码
	private String password;
	//所在单位
	private String unit;
	//关联用户表
	private TUser TUser;

	public TFund() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fund_id")
	public int getFundId() {
		return this.fundId;
	}

	public void setFundId(int fundId) {
		this.fundId = fundId;
	}


	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}


	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}


	// 多对一
	@ManyToOne
	@JoinColumn(name="user_id")
	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

}