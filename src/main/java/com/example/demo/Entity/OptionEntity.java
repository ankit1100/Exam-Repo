package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Options")
public class OptionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int optionId;
	
	
	@Column(name="optionName")
	String optName;
	
	
	@Column(name="correctAnswer")
	String CorrAnswer;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QuestionId")
	int queId;

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	public String getCorrAnswer() {
		return CorrAnswer;
	}

	public void setCorrAnswer(String corrAnswer) {
		CorrAnswer = corrAnswer;
	}

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	@Override
	public String toString() {
		return "OptionEntity [optionId=" + optionId + ", optName=" + optName + ", CorrAnswer=" + CorrAnswer + ", queId="
				+ queId + "]";
	}


}
