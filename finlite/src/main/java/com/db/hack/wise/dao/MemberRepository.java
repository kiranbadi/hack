package com.db.hack.wise.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.db.hack.wise.model.Member;

/**
 * Created by jones_vinu on 6/4/2019.
 */

public interface MemberRepository extends CrudRepository<Member,Long> {
	@Query("select members.password from Member members where members.username = :userName")
	public String getUserDetails(String userName);


	
}
