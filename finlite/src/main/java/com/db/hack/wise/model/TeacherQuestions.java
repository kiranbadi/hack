package com.db.hack.wise.model;

import javax.persistence.*;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@Entity
@Table(name = "TeacherQuestions")
public class TeacherQuestions {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TeacherQuestion_ID")
    private Long teacherQuestionID;

    @Column(name = "TopicCode")
    private String topicCode;

    @Column(name = "Difficulty")
    private String difficulty;

    @Column(name="CorrectAns")
    private String correctAns;

    @Column(name="Item")
    private String item;

    @Column(name="ClassName")
    private String className;

    public Long getTeacherQuestionID() {
        return teacherQuestionID;
    }

    public void setTeacherQuestion_ID(Long teacherQuestionID) {
        this.teacherQuestionID = teacherQuestionID;
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
}
