package com.db.hack.wise.model;

import javax.persistence.*;


/**
 * Created by jones_vinu on 6/5/2019.
 */
@Entity
@Table(name = "PracticeTestQuestions")

public class PracticeTestQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PracticeQuestion_ID")
    private Long practiceQuestionID;

    @Column(name = "correctAns")
    private Integer correctAns;

    @Column(name = "item")
    private String item;

    @Column(name = "questionType")
    private String questionType;

    public Long getPracticeQuestionID() {
        return practiceQuestionID;
    }

    public void setPracticeQuestionID(Long practiceQuestionID) {
        this.practiceQuestionID = practiceQuestionID;
    }

    public Integer getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(Integer correctAns) {
        this.correctAns = correctAns;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}
