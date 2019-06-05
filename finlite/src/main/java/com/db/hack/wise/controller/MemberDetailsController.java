package com.db.hack.wise.controller;

import com.db.hack.wise.dao.MemberRepository;
import com.db.hack.wise.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.db.hack.wise.dao.MemberDetailsRepository;
import com.db.hack.wise.model.MemberDetails;

import java.util.Optional;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@CrossOrigin
@RestController
public class MemberDetailsController {

    @Autowired
    private MemberDetailsRepository memberDetailsRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/members/details/create")
    public void createMemberDetails(MemberDetails details){
        memberDetailsRepository.save(details);
    }

    @GetMapping("members/details/{id}/details")
    public Iterable<MemberDetails> memberDetails(@PathVariable Long id){
        return memberDetailsRepository.findMemberDetailsByMember(id);
    }

    @GetMapping("members/id")
    public String getMemberCourse(@PathVariable  Long id){
        Optional<Member> member =  memberRepository.findById(id);
        return member.isPresent() ? member.get().getCourse() : "";
    }





}
