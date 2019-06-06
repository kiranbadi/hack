package com.db.hack.wise.controller;

import com.db.hack.wise.dao.PracticeTestQuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jones_vinu on 6/5/2019.
 */
@CrossOrigin
@RestController
public class PracticeController {

    @Autowired
    private PracticeTestQuestionsRepository practiceTestQuestionsRepository;


}
