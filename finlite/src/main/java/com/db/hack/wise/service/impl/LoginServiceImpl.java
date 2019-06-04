package com.db.hack.wise.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.db.hack.wise.dao.MemberRepository;
import com.db.hack.wise.model.Member;
import com.db.hack.wise.service.LoginService;

/**
 * Created by Balamurugan on 6/4/2019.
 */
@Component
public class LoginServiceImpl implements LoginService {
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public boolean getMemberDetails(int id, String userName, String password) {
		Optional<Member> response = memberRepository.findById((long) id);
		if (response.isPresent()) {
			Member member = response.get();
			if (member != null) {
				if (member.getUserName().equalsIgnoreCase(userName) && member.getPassword().equals(password)) {
					return true;
				}
			}

		}
		return false;
	}
}
