/**
 * RatingScaleAnswer.java
 */
package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Nimish
 *
 */
@Entity
@Table(name="rating_scale_answers")
public class RatingScaleAnswer extends Answer {
	private List<RatingScaleChoiceResult> choiceResults = new ArrayList<RatingScaleChoiceResult>(0);
	private String answerComment;

	@OneToMany(mappedBy="answer",cascade=CascadeType.ALL)
	public List<RatingScaleChoiceResult> getChoiceResults() {
		return choiceResults;
	}

	public void setChoiceResults(List<RatingScaleChoiceResult> choiceResults) {
		this.choiceResults = choiceResults;
	}

	@Lob
	@Column(name="ANSWER_COMMENT")
	public String getAnswerComment() {
		return answerComment;
	}

	public void setAnswerComment(String answerComment) {
		this.answerComment = answerComment;
	}
	
	
}
