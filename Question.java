/**
 * Question.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="question")
public class Question extends BaseEntity {
	private Long id;
	private QuestionType questionType;
	private Page page;
	private String shortTitle;
	private DeleteQuestionStatus questionStatus;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Enumerated(EnumType.STRING)
	@Column(name="QUESTION_TYPE")
	public QuestionType getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	@ManyToOne
	@JoinColumn(name="PAGE_ID")
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	@Column(name="SHORT_TITLE")
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	
	public enum DeleteQuestionStatus{
		ACTIVE,INACTIVE
	}
@Enumerated(EnumType.STRING)
@Column(name="QUESTION_STATUS")
	public DeleteQuestionStatus getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(DeleteQuestionStatus questionStatus) {
		this.questionStatus = questionStatus;
	}
	

	
	
}
