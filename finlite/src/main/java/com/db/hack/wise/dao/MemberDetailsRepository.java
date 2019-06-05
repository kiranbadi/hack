package com.db.hack.wise.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.db.hack.wise.model.MemberDetails;
import org.springframework.data.repository.query.Param;

/**
 * Created by jones_vinu on 6/4/2019.
 */
public interface MemberDetailsRepository extends CrudRepository<MemberDetails,Long>  {

    @Query("SELECT m from MemberDetails m where m.memberId =  :memberId")
    List<MemberDetails> findMemberDetailsByMember(@Param("memberId") Long  memberId);


}
