package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contacts;
import com.zohocrm.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository contactsRepo;

	@Override
	public void saveContact(Contacts contact) {
		
		contactsRepo.save(contact);
	}

	@Override
	public List<Contacts> getContacts() {
		List <Contacts> contacts = contactsRepo.findAll();
		return contacts;
	}

	@Override
	public void deleteContactsById(long id) {
		contactsRepo.deleteById(id);
		
	}

}
