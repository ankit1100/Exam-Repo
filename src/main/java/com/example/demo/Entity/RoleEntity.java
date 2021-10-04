package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class RoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleId")
	int roleId;
	@Column(name = "roleName")
	String roleName;
	
	@OneToMany(mappedBy = "role")
	List<CandidateEntity> candidate = new ArrayList<>();
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public List<CandidateEntity> getCandidate() {
		return candidate;
	}
	public void setCandidate(List<CandidateEntity> candidate) {
		this.candidate = candidate;
	}
	
	@Override
	public String toString() {
		return "RoleEntity [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
}
