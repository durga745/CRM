package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.zohocrm.dto.LeadData;
import com.zohocrm.entities.Leads;
import com.zohocrm.repositories.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {

	@Autowired
	private LeadsRepository leadsRepo;

	@Override
	public void saveLeads(Leads leads) {
		leadsRepo.save(leads);
	}

	@Override
	public List<Leads> getAllLeads() {
		List<Leads> leads = leadsRepo.findAll();
		return leads;
	}

	@Override
	public Leads getLeadById(Long id) {
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads leads = findById.get();
		return leads;
	}

	@Override
	public void deleteLeads(long id) {
		leadsRepo.deleteById(id);
	}

	@Override
	public void updateLead(LeadData data) {
		Optional<Leads> lead = leadsRepo.findById(data.getId());
		Leads leads = lead.get();
		leads.setFirst_name(data.getFirst_name());
		leads.setLast_name(data.getLast_name());
		leads.setEmail(data.getEmail());
		leads.setMobile(data.getMobile());
		leadsRepo.save(leads);
	}

}