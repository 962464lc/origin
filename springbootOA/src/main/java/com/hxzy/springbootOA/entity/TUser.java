package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Ryo Liu
 * @category 用户表
 * 
 */
@Entity
@Table(name = "t_user")
public class TUser implements Serializable {
	private static final long serialVersionUID = 1L;
	// 用户ID
	private Integer userId;
	// 用户年龄
	private Integer age;
	// 用户邮箱
	private String email;
	// 入职时间
	private Timestamp hiredate;
	// 真实名字
	private String name;
	// 密码
	private String password;
	// 电话
	private String phone;
	// 1代表正式员工，0代表非正式员工
	private Integer regular;
	// 用户名
	private String username;
	// 工作状态，1：在职；2：离职
	private Integer working;
	// 关联考勤表
	private List<TAttendance> TAttendances;
	// 关联公积金表
	private List<TFund> TFunds;
	// 关联请假表
	private List<TLeave> TLeaves;
	// 关联社保表
	private List<TSocial> TSocials;
	// 关联部门表
	private TDept TDept;
	// 关联角色表
	private List<TRole> TRoles;

	public TUser() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRegular() {
		return this.regular;
	}

	public void setRegular(int regular) {
		this.regular = regular;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getWorking() {
		return this.working;
	}

	public void setWorking(int working) {
		this.working = working;
	}

	// 一对多
	@OneToMany(mappedBy = "TUser")
	public List<TAttendance> getTAttendances() {
		return this.TAttendances;
	}

	public void setTAttendances(List<TAttendance> TAttendances) {
		this.TAttendances = TAttendances;
	}

	// 一对多
	@OneToMany(mappedBy = "TUser")
	public List<TFund> getTFunds() {
		return this.TFunds;
	}

	public void setTFunds(List<TFund> TFunds) {
		this.TFunds = TFunds;
	}

	// 一对多
	@OneToMany(mappedBy = "TUser")
	public List<TLeave> getTLeaves() {
		return this.TLeaves;
	}

	public void setTLeaves(List<TLeave> TLeaves) {
		this.TLeaves = TLeaves;
	}

	// 一对多
	@OneToMany(mappedBy = "TUser")
	public List<TSocial> getTSocials() {
		return this.TSocials;
	}

	public void setTSocials(List<TSocial> TSocials) {
		this.TSocials = TSocials;
	}

	// 多对一
	@ManyToOne
	@JoinColumn(name = "dept_id")
	public TDept getTDept() {
		return this.TDept;
	}

	public void setTDept(TDept TDept) {
		this.TDept = TDept;
	}

	// 多对多
	@ManyToMany
	@JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "role_id") })
	public List<TRole> getTRoles() {
		return this.TRoles;
	}

	public void setTRoles(List<TRole> TRoles) {
		this.TRoles = TRoles;
	}

}