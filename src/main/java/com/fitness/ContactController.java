package com.fitness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fitnesstracker/contacts")
public class ContactController {

	@Autowired	
	ContactService service;
	
	@PostMapping
	public void postMessage(@RequestBody Contact contact) {
		service.saveMessage(contact);
	}
}
