package com.db.hack.wise.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.MemberRepository;
import com.db.hack.wise.model.Member;
import com.db.hack.wise.service.MemberService;

/**
 * Created by jones_vinu on 6/5/2019.
 */
@Component
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member get(int id) {
        Optional<Member> result = memberRepository.findById((long) id);
        if (result.isPresent()) {
            return result.get();
        }

        return new Member();
    }

    @Override
    public List<Member> getAll() {
        List<Member> memberList = new ArrayList<Member>();
        Iterable<Member> result = memberRepository.findAll();
        if (result != null) {
            result.forEach(Member -> memberList.add(Member));
            return memberList;
        }
        return Arrays.asList();
    }

    @Override
    public Member update(int id, Member Member) {
        Member.setMemberId((long) id);
        Member response = memberRepository.save(Member);
        return response;
    }

    @Override
    public void delete(int id) {
        memberRepository.deleteById((long) id);
    }

    @Override
    public Member save(Member Member) {
        Member response = memberRepository.save(Member);
        return response;
    }


}
