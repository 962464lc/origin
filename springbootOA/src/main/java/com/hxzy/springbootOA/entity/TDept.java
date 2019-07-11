package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * @author Ryo Liu
 * @category 部门表
 * 
 */
@Entity
@Table(name = "t_dept")
public class TDept implements Serializable {
	private static final long serialVersionUID = 1L;
	// ID
	private int deptId;
	// 部门名
	private String deptName;
	// 关联用户表
	private List<TUser> TUsers;

	public TDept() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Column(name = "dept_name")
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	// 一对多
	@OneToMany(mappedBy = "TDept")
	public List<TUser> getTUsers() {
		return this.TUsers;
	}

	public void setTUsers(List<TUser> TUsers) {
		this.TUsers = TUsers;
	}

}