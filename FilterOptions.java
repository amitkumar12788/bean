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
 * @author amit
 *
 */
@Entity
@Table(name="filter_options")
public class FilterOptions {

	private Long id;
	//private FilterQuestions filterQuestions;
	private Option option;
	private Question question;
	private FilterMaster filterMaster;
	private Long rowChoiceId;
	private Long colChoiceId;
	private String filterComment;
	private String choice;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Filter_Options_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="Choice")
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	@Column(name="Filter_Comment")
	public String getFilterComment() {
		return filterComment;
	}
	public void setFilterComment(String filterComment) {
		this.filterComment = filterComment;
	}
	
	@Column(name="Row_Choice")
	public Long getRowChoiceId() {
		return rowChoiceId;
	}
	public void setRowChoiceId(Long rowChoiceId) {
		this.rowChoiceId = rowChoiceId;
	}
	
	@Column(name="Col_Choice")
	public Long getColChoiceId() {
		return colChoiceId;
	}
	public void setColChoiceId(Long colChoiceId) {
		this.colChoiceId = colChoiceId;
	}
	
//	@ManyToOne
//	@JoinColumn(name="Filter_Questions_ID")
//	public FilterQuestions getFilterQuestions() {
//		return filterQuestions;
//	}
//	public void setFilterQuestions(FilterQuestions filterQuestions) {
//		this.filterQuestions = filterQuestions;
//	}
	
	@ManyToOne
	@JoinColumn(name="OPTION_ID")
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
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
	@JoinColumn(name="Filter_ID")
	public FilterMaster getFilterMaster() {
		return filterMaster;
	}
	public void setFilterMaster(FilterMaster filterMaster) {
		this.filterMaster = filterMaster;
	}
	
}
