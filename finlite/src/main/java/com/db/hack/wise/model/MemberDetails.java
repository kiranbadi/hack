package com.db.hack.wise.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@Entity
@Table(name = "MemberDetails")
public class MemberDetails {


    @Column(name = "Member_ID")
    private Long memberId;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MemberDetail_ID")
    private Long memberDetailID;

    @Column(name = "ClassName")
    private String className;

    @Column(name = "Score")
    private String score;

    @Column(name = "CertifiedDate")
    private Date certifiedDate;

    @Column(name = "ClassStatus")
    private Date classStatus;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getMemberDetailID() {
        return memberDetailID;
    }

    public void setMemberDetailID(Long memberDetailID) {
        this.memberDetailID = memberDetailID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getCertifiedDate() {
        return certifiedDate;
    }

    public void setCertifiedDate(Date certifiedDate) {
        this.certifiedDate = certifiedDate;
    }

    public Date getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(Date classStatus) {
        this.classStatus = classStatus;
    }
}
