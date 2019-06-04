package com.db.hack.wise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@Entity
@Table(name = "member")


public class Member {

    @Id
    @Column(name = "StudentID")
    private Long studentId;

    @Column(name = "FName")
    private String firstName;

    @Column(name = "MName")
    private String middleName;

    @Column(name = "LName")
    private String lastName;

    @Column(name = "UserName")
    private String userName;


}
