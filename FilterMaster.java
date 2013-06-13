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
@Table(name="filter_master")
public class FilterMaster {

	private Long id;
	private String filter_name;
	private String active_status;
	private String filter_type;
	private String filter_logic;//="And";
	private Survey survey;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Filter_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "Filter_Name")
	public String getFilter_name() {
		return filter_name;
	}
	public void setFilter_name(String filter_name) {
		this.filter_name = filter_name;
	}

	@Column(name = "Filter_Logic")
	public String getFilter_logic() {
		return filter_logic;
	}
	public void setFilter_logic(String filter_logic) {
		this.filter_logic = filter_logic;
	}
	
	@Column(name = "Active_Status")
	public String getActive_status() {
		return active_status;
	}
	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}
	
	@Column(name = "Filter_Type")
	public String getFilter_type() {
		return filter_type;
	}
	public void setFilter_type(String filter_type) {
		this.filter_type = filter_type;
	}
	
	@ManyToOne
	@JoinColumn(name="SURVEY_ID")
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

}
