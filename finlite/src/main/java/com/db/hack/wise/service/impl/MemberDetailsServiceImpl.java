package com.db.hack.wise.service.impl;

import com.db.hack.wise.dao.MemberDetailsRepository;
import com.db.hack.wise.model.MemberDetails;
import com.db.hack.wise.service.MemberDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by jones_vinu on 6/5/2019.
 */
@Component
public class MemberDetailsServiceImpl implements MemberDetailsService {


    @Autowired
    private MemberDetailsRepository MemberDetailsRepository;

    @Override
    public MemberDetails get(int id) {
        Optional<MemberDetails> result = MemberDetailsRepository.findById((long) id);
        if (result.isPresent()) {
            return result.get();
        }

        return new MemberDetails();
    }

    @Override
    public List<MemberDetails> getAll() {
        List<MemberDetails> memberList = new ArrayList<MemberDetails>();
        Iterable<MemberDetails> result = MemberDetailsRepository.findAll();
        if (result != null) {
            result.forEach(MemberDetails -> memberList.add(MemberDetails));
        }
        return memberList;
    }

    @Override
    public MemberDetails update(int id, MemberDetails MemberDetails) {
        MemberDetails.setMemberDetailID((long) id);
        MemberDetails response = MemberDetailsRepository.save(MemberDetails);
        return response;
    }

    @Override
    public void delete(int id) {
        MemberDetailsRepository.deleteById((long) id);
    }

    @Override
    public MemberDetails save(MemberDetails MemberDetails) {
        MemberDetails response = MemberDetailsRepository.save(MemberDetails);
        return response;
    }



}
