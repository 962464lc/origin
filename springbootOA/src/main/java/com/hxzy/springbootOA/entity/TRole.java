package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * @author Ryo Liu
 * @category 角色表
 * 
 */
@Entity
@Table(name="t_role")
public class TRole implements Serializable {
	private static final long serialVersionUID = 1L;
	//角色ID
	private Integer roleId;
	//角色名
	private String roleName;
	//关联权限表
	private List<TPermission> TPermissions;
	//关联用户表
	private List<TUser> TUsers;

	public TRole() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	@Column(name="role_name")
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	// 多对多
	@ManyToMany
	@JoinTable(
		name="t_role_permission"
		, joinColumns={
			@JoinColumn(name="role_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="permission_id")
			}
		)
	public List<TPermission> getTPermissions() {
		return this.TPermissions;
	}

	public void setTPermissions(List<TPermission> TPermissions) {
		this.TPermissions = TPermissions;
	}


	// 多对多
	@ManyToMany(mappedBy="TRoles")
	public List<TUser> getTUsers() {
		return this.TUsers;
	}

	public void setTUsers(List<TUser> TUsers) {
		this.TUsers = TUsers;
	}

}