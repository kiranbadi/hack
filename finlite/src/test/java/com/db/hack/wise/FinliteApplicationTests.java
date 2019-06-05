package com.db.hack.wise;

import com.db.hack.wise.controller.MemberDetailsController;
import com.db.hack.wise.controller.RegistrationController;
import com.db.hack.wise.controller.StudentQuestionsController;
import com.db.hack.wise.controller.TeacherQuestionsController;
import com.db.hack.wise.model.Member;
import com.db.hack.wise.model.MemberDetails;
import com.db.hack.wise.service.MemberDetailsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
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
	public void contextLoads() {
		/*System.out.println("*****");
		Member member = new Member();
		member.setFirstName("J");
		member.setLastName("P");
		member.setUserName("test123");
		member.setPassword("password");
		member.setMemberType("STUDENT");
		//registrationController.registerMember(member);
		System.out.println(registrationController.registerMember(member));
		System.out.println(studentQuestionsController.getDistinctListOfCourse());
		System.out.println(teacherQuestionsController.getDistinctListOfCourse());
		MemberDetails memberDetails = new MemberDetails();
		memberDetails.setMemberId(1L);
		memberDetails.setClassName("FP - Intermittent");
		//memberDetailsController.createMemberDetails(memberDetails);
		System.out.println(memberDetailsController.getMemberCourse(1L));
		System.out.println(memberDetailsController.memberDetails(1L));
		System.out.println(studentQuestionsController.getClassCourse("Financial Planning"));
		System.out.println(teacherQuestionsController.getClassCourse("Business Class"));*/


	}

}
