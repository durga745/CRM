package com.zohocrm.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.LeadData;
import com.zohocrm.entities.Leads;
import com.zohocrm.services.LeadsService;

@Controller
public class LeadsController {

	@Autowired
	private LeadsService leadsService;
	

	@RequestMapping("/leads")
	public String welcomePage() {
		return "welcome";
	}

	@RequestMapping("/createLeads")
	public String createLeadPage() {
		return "createLeads";
	}

	@RequestMapping("/saveLead")
	public String saveLeadsInfo(@ModelAttribute("leads") Leads leads, ModelMap modelMap) {
		if (leads.getFirst_name() != null && !(leads.getFirst_name().equals("")) && leads.getLast_name() != null
				&& !(leads.getLast_name().equals("")) && leads.getCompany() != null && !(leads.getCompany().equals(""))
				&& leads.getMobile() != null && !(leads.getMobile().equals("")) && leads.getLead_source() != null
				&& !(leads.getLead_source().equals("")) && leads.getEmail() != null && !(leads.getEmail().equals(""))) {
			System.out.println(leads.getId());
			System.out.println(leads.getFirst_name());
			System.out.println(leads.getLast_name());
			System.out.println(leads.getCompany());
			System.out.println(leads.getEmail());
			System.out.println(leads.getMobile());
			System.out.println(leads.getLead_source());
			leadsService.saveLeads(leads);
			modelMap.addAttribute("msg", "Lead is saved!!!");
			return "createLeads";
		} else {
			modelMap.addAttribute("msg", "Please provide complete data!");
			return "createLeads";
		}
	}

	@RequestMapping("/getLeads")
	public String getLeads(ModelMap modelMap) {
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads", leads);
		return "SearchResults";
	}

	@RequestMapping("/getLeadsInfo")
	public String getLeadsInfo(@RequestParam("id") long id, ModelMap modelMap) {
		Leads leads = leadsService.getLeadById(id);
		modelMap.addAttribute("leads", leads);
		return "leadInfo";
	}

	@RequestMapping("/deleteLeadsInfo")
	public String deleteLeadsInfo(@RequestParam("id") long id, ModelMap modelMap) {
		leadsService.deleteLeads(id);
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads", leads);
		return "SearchResults";
	}

	@RequestMapping("/updateLeadsInfo")
	public String updateLeadById(@RequestParam("id") long id, ModelMap modelMap) {
		Leads leads = leadsService.getLeadById(id);
		modelMap.addAttribute("leads", leads);
		return "updateLead";
	}

	@RequestMapping("/updateLead")
	public String updateLead(@ModelAttribute("leads") LeadData leadData, ModelMap modelMap) {

		leadsService.updateLead(leadData);
		List<Leads> leads = leadsService.getAllLeads();
		modelMap.addAttribute("leads", leads);
//		modelMap.addAttribute("msg", "Lead is updated!");
		return "SearchResults";
	}
}
