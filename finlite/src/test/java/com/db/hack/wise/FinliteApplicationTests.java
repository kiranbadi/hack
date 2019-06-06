package com.db.hack.wise;

import com.db.hack.wise.controller.MemberDetailsController;
import com.db.hack.wise.controller.RegistrationController;
import com.db.hack.wise.controller.StudentQuestionsController;
import com.db.hack.wise.controller.TeacherQuestionsController;
import com.db.hack.wise.model.Member;
import com.db.hack.wise.model.MemberDetails;
import com.db.hack.wise.service.MemberDetailsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "applicationtest.properties")
public class FinliteApplicationTests {

	@Autowired
	RegistrationController registrationController;

	@Autowired
	TeacherQuestionsController teacherQuestionsController;

	@Autowired
	StudentQuestionsController studentQuestionsController;

	@Autowired
	MemberDetailsController memberDetailsController;

	@Test
	public void testRegister() {
		System.out.println("*****");
		Member member = new Member();
		member.setFirstName("J");
		member.setLastName("Y");
		member.setUsername("test123");
		member.setPassword("password");
		member.setMemberType("STUDENT");
		registrationController.registerMember(member);
		Member createMember  = registrationController.getUsers().iterator().next();
		Assert.assertEquals("Y",createMember.getLastName());
		Assert.assertEquals("STUDENT",createMember.getMemberType());
		Assert.assertEquals(1L,createMember.getMemberId().longValue());



	}

	@Test
	public void testAssignment(){
		MemberDetails memberDetails = new MemberDetails();
		memberDetails.setMemberId(1L);
		memberDetails.setClassName("FP Planning");
		memberDetailsController.createMemberDetails(memberDetails);
		Assert.assertEquals("FP Planning",memberDetailsController.memberDetails(1L).iterator().next().getClassName());
	}

}
