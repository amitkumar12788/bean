/**
 * Option.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="options")
public class Option extends BaseEntity {
	private Long id;
	private String optionText;
	private Question question;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPTION_ID")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	@Lob
	@Column(name="OPTION_TEXT")
	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
