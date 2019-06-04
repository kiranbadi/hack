package com.db.hack.wise.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@Entity

@Table(name = "Member")
public class Member {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Member_ID")
    private Long memberId;

    @Column(name = "FName")
    private String firstName;

    @Column(name = "MName")
    private String middleName;

    @Column(name = "LName")
    private String lastName;

    @Column(name = "username")
    private String userName;

    @Column(name = "Password")
    private String password;

    @Column(name = "membertype")
    private String memberType;


    @Column(name = "DOB")
    private LocalDate dob;

    @Column(name = "classcode")
    private String classCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "createddt")
    private Date createdDate;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "StudentID")
    private String studendID;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudendID() {
        return studendID;
    }

    public void setStudendID(String studendID) {
        this.studendID = studendID;
    }
}
