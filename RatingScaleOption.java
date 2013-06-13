/**
 * RatingScaleOption.java
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
 * @author Nimish
 *
 */
@Entity
@Table(name="rating_scale_options")
public class RatingScaleOption extends BaseEntity {
	private Long id;
	private String optionLabel;
	private Short weight; 
	private Boolean isNaColumn;
	private Question question;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RATING_SCALE_OPTION_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="OPTION_LABEL")
	public String getOptionLabel() {
		return optionLabel;
	}
	public void setOptionLabel(String optionLabel) {
		this.optionLabel = optionLabel;
	}
	@Column(name="OPTION_WEIGHT")
	public Short getWeight() {
		return weight;
	}
	public void setWeight(Short weight) {
		this.weight = weight;
	}
	@Column(name="IS_NA_COLUMN")
	public Boolean getIsNaColumn() {
		return isNaColumn;
	}
	public void setIsNaColumn(Boolean isNaColumn) {
		this.isNaColumn = isNaColumn;
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
