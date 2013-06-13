/**
 * Answer.java
 */
package com.bdisys.survey.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="answer")
public class Answer extends BaseEntity {
	private Long id;
	private Question question;
	private Response response;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ANSWER_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@ManyToOne
	@JoinColumn(name="RESPONSE_ID")
	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
}
