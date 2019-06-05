package com.db.hack.wise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.hack.wise.dao.MemberDetailsRepository;
import com.db.hack.wise.model.MemberDetails;

/**
 * Created by jones_vinu on 6/4/2019.
 */
@RestController
public class MemberDetailsController {

    private MemberDetailsRepository memberDetailsRepository;

    @PostMapping("/members/details/create")
    void createMemberDetails(MemberDetails details){
        memberDetailsRepository.save(details);
    }

    @GetMapping("members/details/{id}/details")
    Iterable<MemberDetails> memberDetails(@PathVariable Long id){
        return memberDetailsRepository.findMemberDetailsByMember(id);
    }
}
