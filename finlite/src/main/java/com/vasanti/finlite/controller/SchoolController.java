package com.vasanti.finlite.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vasanti.finlite.model.ResponseMessageBean;
import com.vasanti.finlite.model.SchoolInformationBean;
import com.vasanti.finlite.service.SchoolInformationService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SchoolController {
	
	
	@Autowired
	SchoolInformationService schoolInformationService;
	
	
    /* add new school information to database  */
	@CrossOrigin(origins = "http://localhost:4200")
    @ApiOperation(value = "add new school information.No constraints given.Duplicates possible")
    @RequestMapping(value = "/school/new", method = RequestMethod.POST)
    public ResponseEntity<ResponseMessageBean> AddNewSchool(@Valid @RequestBody SchoolInformationBean schoolInformationBean) {
    	ResponseMessageBean responseMessage = null;
    //    LOGGER.info("calling AddCategory() controller -- {}", categorydata);
    	schoolInformationBean = schoolInformationService.saveNewSchoolInformation(schoolInformationBean);
    	if(schoolInformationBean.getId()!= 0) {
    		responseMessage = new ResponseMessageBean();
    		responseMessage.setMessage("Successfully added " + schoolInformationBean.getSchoolname());
    		responseMessage.setStatus("success");  		
    	}
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
    
    
    /* find the school information from database  */
    @CrossOrigin(origins = "http://localhost:4200")
    @ApiOperation(value = "find school information")
    @RequestMapping(value = "/school/search", method = RequestMethod.GET)
    public ResponseEntity<ResponseMessageBean> findSchool(String keyword) {
    	 ResponseMessageBean responseMessage = new ResponseMessageBean();    	 
         List<String> suggestions = schoolInformationService.findSchool(keyword);      	 
    	 if(suggestions.size() != 0) {
    		responseMessage.setMessage("Found " + suggestions.size() + " school for you");
    		responseMessage.setStatus("success");
    		responseMessage.setResponseData(suggestions);
    		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    	}
 		responseMessage.setMessage("Sorry we are not able to find school for your search word " + keyword + ".Please refine your search word ");
 		responseMessage.setStatus("success");
        return new ResponseEntity<>(responseMessage, HttpStatus.NOT_FOUND);
    }

}
