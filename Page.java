/**
 * Page.java
 */
package com.bdisys.survey.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="page")
public class Page extends BaseEntity implements Serializable {
	private Long id;
	private String title;
	private String description;
	private List<Question> questions = new ArrayList<Question>(0);
	private Survey survey;
	private DeletePageStatus pageStatus;
	private Boolean hasLogic;

	private Long nextPageId;
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PAGE_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@OneToMany(cascade={CascadeType.ALL})
	@JoinTable(name="page_question",joinColumns={@JoinColumn(name="PAGE_ID")},inverseJoinColumns={@JoinColumn(name="QUESTION_ID")})
	@IndexColumn(name = "ORDER_NUMBER", base = 1)
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	@Lob
	@Column(name="TITLE")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Lob
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public enum DeletePageStatus{
		ACTIVE,INACTIVE
	}
    @Enumerated(EnumType.STRING)
	@Column(name="PAGE_STATUS")
	public DeletePageStatus getPageStatus() {
		return pageStatus;
	}
	public void setPageStatus(DeletePageStatus pageStatus) {
		this.pageStatus = pageStatus;
	}
	@Column(name="HAS_LOGIC")
	public Boolean getHasLogic() {
		return hasLogic;
	}
	public void setHasLogic(Boolean hasLogic) {
		this.hasLogic = hasLogic;
	}
	@Column(name="NEXT_PAGE_ID")
	public Long getNextPageId() {
		return nextPageId;
	}
	public void setNextPageId(Long nextPageId) {
		this.nextPageId = nextPageId;
	}
  
	

}
