package com.db.hack.wise.dao;

import com.db.hack.wise.model.PracticeTestQuestions;
import com.db.hack.wise.model.StudentQuestions;
import com.db.hack.wise.model.Survey;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jones_vinu on 6/5/2019.
 */


public interface PracticeTestQuestionsRepository extends CrudRepository<PracticeTestQuestions,Long> {


}
