package com.db.hack.wise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Entity

@Table(name = "studentquestions")
public class StudentQuestions {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "studentquestion_id")
    private Long studentQuestionID;

    @Column(name = "topiccode")
    private String topicCode;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "correctans")
    private String correctAns;

    @Column(name = "item")
    private String item;

    @Column(name = "classname")
    private String className;

	public Long getStudentQuestionID() {
		return studentQuestionID;
	}

	public void setStudentQuestionID(Long studentQuestionID) {
		this.studentQuestionID = studentQuestionID;
	}

	public String getTopicCode() {
		return topicCode;
	}

	public void setTopicCode(String topicCode) {
		this.topicCode = topicCode;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + ((correctAns == null) ? 0 : correctAns.hashCode());
		result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((studentQuestionID == null) ? 0 : studentQuestionID.hashCode());
		result = prime * result + ((topicCode == null) ? 0 : topicCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentQuestions other = (StudentQuestions) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (correctAns == null) {
			if (other.correctAns != null)
				return false;
		} else if (!correctAns.equals(other.correctAns))
			return false;
		if (difficulty == null) {
			if (other.difficulty != null)
				return false;
		} else if (!difficulty.equals(other.difficulty))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (studentQuestionID == null) {
			if (other.studentQuestionID != null)
				return false;
		} else if (!studentQuestionID.equals(other.studentQuestionID))
			return false;
		if (topicCode == null) {
			if (other.topicCode != null)
				return false;
		} else if (!topicCode.equals(other.topicCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentQuestions [studentQuestionID=" + studentQuestionID + ", topicCode=" + topicCode + ", difficulty="
				+ difficulty + ", correctAns=" + correctAns + ", item=" + item + ", className=" + className + "]";
	}

}
