package com.ska.sms.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ska.sms.entity.Student;
import com.ska.sms.model.Response;

@RestController
public class RegistrationRestController {

	@PostMapping("/std_registration")
	public Response StudentRegistration(@RequestBody Student std) {
		
		Response res = new Response();
		res.setSUCCESS("Student Successfull added.");
		res.setPAYLOAD(std);
		return new Response();
	}
}
