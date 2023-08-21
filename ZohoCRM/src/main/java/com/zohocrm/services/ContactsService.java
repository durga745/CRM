package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactsService {
	
	public void saveContact(Contacts contact);
	
	public List <Contacts> getContacts();
	
	public void deleteContactsById(long id);
}
