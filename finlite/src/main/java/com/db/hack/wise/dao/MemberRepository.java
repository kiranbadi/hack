package com.db.hack.wise.dao;

import com.db.hack.wise.model.Member;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jones_vinu on 6/4/2019.
 */

public interface MemberRepository extends CrudRepository<Member,Long> {
	
}
