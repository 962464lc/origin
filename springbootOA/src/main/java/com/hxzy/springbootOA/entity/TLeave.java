package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * @author Ryo Liu
 * @category 请假表
 * 
 */
@Entity
@Table(name="t_leave")
public class TLeave implements Serializable {
	private static final long serialVersionUID = 1L;
	//ID
	private int leaveId;
	//结束请假的时间
	private Timestamp endLeave;
	//开始请假的时间
	private Timestamp startLeave;
	//关联用户表
	private TUser TUser;

	public TLeave() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="leave_id")
	public int getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}


	@Column(name="end_leave")
	public Timestamp getEndLeave() {
		return this.endLeave;
	}

	public void setEndLeave(Timestamp endLeave) {
		this.endLeave = endLeave;
	}


	@Column(name="start_leave")
	public Timestamp getStartLeave() {
		return this.startLeave;
	}

	public void setStartLeave(Timestamp startLeave) {
		this.startLeave = startLeave;
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