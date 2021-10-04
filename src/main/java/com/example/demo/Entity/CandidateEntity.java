package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Candidates")
public class CandidateEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidateId")
	int cId;
	
	@Column(name="candidateName")
	String cName;
	
	@Column(name="candidateAge")
	int cAge;
	
	@Column(name = "candidateAddress")
	String cAddress;
	
	@Column(name="candidateMobile")
	String cMobile;
	
	@Column(name = "candidateEmail")
	String cEmail;
	
	@Column(name="candidatePassword")
	String CPassword;
	
	@Column(name="alterEmail")
	String alterEmail;
	
	@Column(name="createdAt")
	Timestamp createdAt;
	
	@Column(name="flag")
	boolean flag;
	
	@ManyToOne
	RoleEntity role;
	
	public int getcId() {
		return cId;
	} 
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getCPassword() {
		return CPassword;
	}
	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcMobile() {
		return cMobile;
	}
	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}
	public String getAlterEmail() {
		return alterEmail;
	}
	public void setAlterEmail(String alterEmail) {
		this.alterEmail = alterEmail;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public RoleEntity getRole() {
		return role;
	}
	public void setRole(RoleEntity role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CandidateEntity [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", CPassword=" + CPassword
				+ ", cAge=" + cAge + ", cAddress=" + cAddress + ", cMobile=" + cMobile + ", alterEmail=" + alterEmail
				+ ", createdAt=" + createdAt + ", flag=" + flag + ", role=" + role + "]";
	}

}
