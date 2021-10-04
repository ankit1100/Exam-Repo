package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class QuestionEntity {
	
	int queId;
	String queName;
	
	
	TopicEntity topic;

}
