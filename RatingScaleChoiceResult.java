/**
 * RatingScaleChoiceResult.java
 */
package com.bdisys.survey.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Nimish
 * 
 */
@Entity
@Table(name = "rating_scale_choice_result")
public class RatingScaleChoiceResult extends BaseEntity {
	private Long id;
	private RatingScaleRowChoice rowchoice;
	private RatingScaleOption scaleoption;
	private Answer answer;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CHOICE_RESULT_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne
	@JoinColumn(name = "ROWCHOICE_ID")
	public RatingScaleRowChoice getRowchoice() {
		return rowchoice;
	}

	public void setRowchoice(RatingScaleRowChoice rowchoice) {
		this.rowchoice = rowchoice;
	}

	@OneToOne
	@JoinColumn(name = "RATING_OPTION_ID")
	public RatingScaleOption getScaleoption() {
		return scaleoption;
	}

	public void setScaleoption(RatingScaleOption scaleoption) {
		this.scaleoption = scaleoption;
	}

	@ManyToOne
	@JoinColumn(name = "ANSWER_ID")
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
