package com.zohocrm.services;

import java.util.List;

import com.zohocrm.dto.LeadData;
import com.zohocrm.entities.Leads;

public interface LeadsService {

	public void saveLeads(Leads leads);

	public List<Leads> getAllLeads();

	public Leads getLeadById(Long id);

	public void deleteLeads(long id);

	public void updateLead(LeadData data);
}
