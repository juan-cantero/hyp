package io.juanqui.hyp;

import io.juanqui.hyp.domain.CustomerContact;
import io.juanqui.hyp.repos.CustomerContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsManagementService {

	@Autowired
	private CustomerContactRepository customerContactRepository;
	
	public CustomerContact add(CustomerContact aContact) {
		
		CustomerContact newContact = customerContactRepository.save(aContact);
		
		return newContact;	
	}
	
	/*
	public CustomerContact addContactOccasion(CustomerContact aContact, ContactImportantOccasion anOccasion) {
		CustomerContact newContact = null;
		
		return newContact;	
	}
	*/
}
