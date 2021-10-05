package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "questions")
public class QuestionEntity {
	
	@Id
	private String QuestionId;
	private String QuestionName;
	private Integer CategoryId;
	private Integer SubcategoryId;
	public String getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(String questionId) {
		QuestionId = questionId;
	}
	public String getQuestionName() {
		return QuestionName;
	}
	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public Integer getSubcategoryId() {
		return SubcategoryId;
	}
	public void setSubcategoryId(Integer subcategoryId) {
		SubcategoryId = subcategoryId;
	}
	@Override
	public String toString() {
		return "QuestionEntity [QuestionId=" + QuestionId + ", QuestionName=" + QuestionName + ", CategoryId="
				+ CategoryId + ", SubcategoryId=" + SubcategoryId + "]";
	}
	
	
	
	
}
