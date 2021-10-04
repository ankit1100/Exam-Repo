package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Topics")
public class TopicEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int topicId;
	String topicName;
	
	@OneToMany
	SubjectEntity subject;
	
	CandidateEntity candidate;

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public SubjectEntity getSubject() {
		return subject;
	}

	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}

	public CandidateEntity getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateEntity candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "TopicEntity [topicId=" + topicId + ", topicName=" + topicName + ", subject=" + subject + ", candidate="
				+ candidate + "]";
	}
}
