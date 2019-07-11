package com.hxzy.springbootOA.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * @author Ryo Liu
 * @category 权限表
 * 
 */
@Entity
@Table(name = "t_permission")
public class TPermission implements Serializable {
	private static final long serialVersionUID = 1L;
	//权限ID
	private Integer permissionId;
	//权限名称
	private String permissionName;
	//权限Url
	private String permissionUrl;
	//关联角色表
	private List<TRole> TRoles;

	public TPermission() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "permission_id")
	public int getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	@Column(name = "permission_name")
	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	@Column(name = "permission_url")
	public String getPermissionUrl() {
		return this.permissionUrl;
	}

	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}

	// 多对多
	@ManyToMany(mappedBy = "TPermissions")
	public List<TRole> getTRoles() {
		return this.TRoles;
	}

	public void setTRoles(List<TRole> TRoles) {
		this.TRoles = TRoles;
	}

}