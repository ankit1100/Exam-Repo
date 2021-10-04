package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subjects")
public class SubjectEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subId;
	
	String subName;
	CandidateEntity candidate;
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public CandidateEntity getCandidate() {
		return candidate;
	}
	public void setCandidate(CandidateEntity candidate) {
		this.candidate = candidate;
	}
	@Override
	public String toString() {
		return "SubjectEntity [subId=" + subId + ", subName=" + subName + ", candidate=" + candidate + "]";
	}

}
