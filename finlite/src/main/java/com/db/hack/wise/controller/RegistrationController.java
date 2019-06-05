package com.db.hack.wise.controller;

import com.db.hack.wise.dao.MemberRepository;
import com.db.hack.wise.model.Member;
import com.db.hack.wise.model.MemberDetails;
import com.db.hack.wise.model.School;
import com.db.hack.wise.service.MemberDetailsService;
import com.db.hack.wise.service.MemberService;
import com.db.hack.wise.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jones_vinu on 6/4/2019.
 */


@RestController
public class RegistrationController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberDetailsService memberDetailsService;

    @PostMapping("/members/create")
    Member registerMember(Member member){
        Member savedMember = memberService.save(member);
        return savedMember;
    }

    @GetMapping("/members/all")
    Iterable <Member> getUser(){
       return memberService.getAll();
    }

    @GetMapping("/members/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.get(id);
    }

    @DeleteMapping("/members/{id}")
    public void deleteMember(@PathVariable("id") int id) {
        memberService.delete(id);
    }

    @PutMapping("/members/{id}")
    public Member updateMember(@PathVariable("id") int id,@RequestBody  Member member) {
        return memberService.update(id,member);
    }

}
