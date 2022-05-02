package com.fitness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

	@Autowired
	ContactRepository repository;
	
	public void saveMessage(Contact contact) {
		repository.save(contact);
	}

}
