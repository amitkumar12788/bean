package com.bdisys.survey.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="matrix_answers")
public class MatrixAnswer extends Answer {
	
	private List<MatrixRowChoiceResult> matrixRowChoiceResults = new ArrayList<MatrixRowChoiceResult>(0);
	private String answerComment;

	@OneToMany(mappedBy="answer",cascade=CascadeType.ALL)
	public List<MatrixRowChoiceResult> getMatrixRowChoiceResults() {
		return matrixRowChoiceResults;
	}

	public void setMatrixRowChoiceResults(
			List<MatrixRowChoiceResult> matrixRowChoiceResults) {
		this.matrixRowChoiceResults = matrixRowChoiceResults;
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
