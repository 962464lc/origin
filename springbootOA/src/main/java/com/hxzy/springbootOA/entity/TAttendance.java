package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * @author Ryo Liu
 * @category 考勤表
 * 
 */
@Entity
@Table(name = "t_attendance")
public class TAttendance implements Serializable {
	private static final long serialVersionUID = 1L;
	// ID
	private int attendanceId;
	// 下班时间
	private Timestamp endTime;
	// 上班时间
	private Timestamp startTime;
	// 关联用户表
	private TUser TUser;

	public TAttendance() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_id")
	public int getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	@Column(name = "end_time")
	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	@Column(name = "start_time")
	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	// 多对一
	@ManyToOne
	@JoinColumn(name = "user_id")
	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

}