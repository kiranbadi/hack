package com.db.hack.wise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@Entity
@Table(name = "Survey")
public class Survey {


    @Id
    @Column(name = "Survey_ID")
    private long surveyID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name ="LastName")
    private String lastName;

    @Column(name="Phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name = "MailingAddress")
    private String mailingAddress;

    @Column(name = "HighSchool")
    private String highSchool;

    @Column(name = "YearGraduated")
    private String yearCertified;

    @Column(name = "AfterGraduated")
    private String afterGraduated;

    @Column(name = "GradSchool")
    private String gradSchool;

    @Column(name = "GradSchoolMajor")
    private String gradSchoolMajor;

    @Column(name = "GradScoolCompletedYear")
    private String gradSchoolCompletedYear;

    @Column(name = "OrganizationName")
    private String organizationName;

    @Column(name = "jobTitle")
    private String jobTitle;

    @Column(name = "likeToVolunteer")
    private String likeToVolunteer;

    @Column(name = "cFLRegistry")
    private String cFLRegistry;


    public long getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(long surveyID) {
        this.surveyID = surveyID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getYearCertified() {
        return yearCertified;
    }

    public void setYearCertified(String yearCertified) {
        this.yearCertified = yearCertified;
    }

    public String getAfterGraduated() {
        return afterGraduated;
    }

    public void setAfterGraduated(String afterGraduated) {
        this.afterGraduated = afterGraduated;
    }

    public String getGradSchool() {
        return gradSchool;
    }

    public void setGradSchool(String gradSchool) {
        this.gradSchool = gradSchool;
    }

    public String getGradSchoolMajor() {
        return gradSchoolMajor;
    }

    public void setGradSchoolMajor(String gradSchoolMajor) {
        this.gradSchoolMajor = gradSchoolMajor;
    }

    public String getGradSchoolCompletedYear() {
        return gradSchoolCompletedYear;
    }

    public void setGradSchoolCompletedYear(String gradSchoolCompletedYear) {
        this.gradSchoolCompletedYear = gradSchoolCompletedYear;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLikeToVolunteer() {
        return likeToVolunteer;
    }

    public void setLikeToVolunteer(String likeToVolunteer) {
        this.likeToVolunteer = likeToVolunteer;
    }

    public String getcFLRegistry() {
        return cFLRegistry;
    }

    public void setcFLRegistry(String cFLRegistry) {
        this.cFLRegistry = cFLRegistry;
    }
}
