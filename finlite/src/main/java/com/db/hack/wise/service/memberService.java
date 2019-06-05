package com.db.hack.wise.service;

import com.db.hack.wise.model.Member;
import com.db.hack.wise.model.School;

import java.util.List;

/**
 * Created by jones_vinu on 6/5/2019.
 */
public interface MemberService {

    public Member get(int id);
    public List<Member> getAll();
    public Member update(int id, Member school);
    public void delete(int id);
    public Member save(Member school);
}
