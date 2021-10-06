package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class ResultEntity {

	@OneToOne
	private ExamEntity exam;
	
	int totalMarks;
	
	String status;

	public ExamEntity getEid() {
		return Eid;
	}

	public void setEid(ExamEntity eid) {
		Eid = eid;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
