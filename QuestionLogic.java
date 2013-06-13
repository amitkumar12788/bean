/**
 * 
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Vivek Kumar
 *
 */
@Entity
@Table(name="question_logic")
public class QuestionLogic extends BaseEntity {
	private Long id;
	private Option option;
	private Page page;
	private Question question;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LOGIC_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="OPTION_ID")
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	@ManyToOne
	@JoinColumn(name="PAGE_ID")
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
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
