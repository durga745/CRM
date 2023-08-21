package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.SaveContactDetails;
import com.zohocrm.entities.Contacts;
import com.zohocrm.services.ContactsService;
import com.zohocrm.services.LeadsService;


@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactsService;
	
	@Autowired
	private LeadsService leadsService;
	
	@RequestMapping("/contacts")
	public String saveContacts(@ModelAttribute("detils") SaveContactDetails details, ModelMap modelMap) {
		
		Contacts contact = new Contacts();
		contact.setFirst_name(details.getFirst_name());
		contact.setLast_name(details.getLast_name());
		contact.setCompany(details.getCompany());
		contact.setEmail(details.getEmail());
		contact.setMobile(details.getMobile());
		contact.setLead_source(details.getLead_source());
		
		contactsService.saveContact(contact);
		
		leadsService.deleteLeads(details.getId());
		modelMap.addAttribute("msg", "Lead is converted to sales");
		return "contactsSaved";
	}
	
	@RequestMapping("/getContacts")
	public String getContactsInfo(ModelMap modelMap) {
		
		List <Contacts> contacts = contactsService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		return "contactsSearchResults";
	}
	
	@RequestMapping("/deleteContactsInfo")
	public String deleteContactsById(@RequestParam("id") long id, ModelMap modelMap) {
		contactsService.deleteContactsById(id);
		List<Contacts> contacts = contactsService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		return "contactsSearchResults";
	}

}
