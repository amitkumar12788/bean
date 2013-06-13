package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;



@Entity
@Table(name="export_configuration")
public class ExportConfiguration {
private Long id;
private String title;
private List<CustomVariable> customVariable=new ArrayList<CustomVariable>(0);
private String columnHeader;
private Survey survey;
private List<Question> questions=new ArrayList<Question>();
private String xmlData;

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="EXPORT_CONFIGURATION_ID")
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@OneToMany(cascade={CascadeType.ALL})
@JoinTable(name="custom_export",joinColumns={@JoinColumn(name="EXPORT_CONFIGURATION_ID")},inverseJoinColumns={@JoinColumn(name="CUSTOM_VARIABLE_ID")})
public List<CustomVariable> getCustomVariable() {
	return customVariable;
}
public void setCustomVariable(List<CustomVariable> customVariable) {
	this.customVariable = customVariable;
}
@Column(name="COLUMN_HEADER")
public String getColumnHeader() {
	return columnHeader;
}
public void setColumnHeader(String columnHeader) {
	this.columnHeader = columnHeader;
}
@ManyToOne
@JoinColumn(name="SURVEY_ID")
public Survey getSurvey() {
	return survey;
}
public void setSurvey(Survey survey) {
	this.survey = survey;
}
@ManyToMany
@JoinTable(name="exportconfig_questions",joinColumns={@JoinColumn (name="EXPORT_CONFIGURATION_ID")},inverseJoinColumns={@JoinColumn(name="QUESTION_ID")})
public List<Question> getQuestions() {
	return questions;
}
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}
@Column(name="TITLE")
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@Lob
public String getXmlData() {
	return xmlData;
}
public void setXmlData(String xmlData) {
	this.xmlData = xmlData;
}




}
