package com.db.hack.wise.service;

import com.db.hack.wise.model.MemberDetails;
import com.db.hack.wise.model.School;

import java.util.List;

/**
 * Created by jones_vinu on 6/5/2019.
 */
public interface MemberDetailsService {
    public MemberDetails get(int id);
    public List<MemberDetails> getAll();
    public MemberDetails update(int id, MemberDetails memberDetails);
    public void delete(int id);
    public MemberDetails save(MemberDetails memberDetails);
}
