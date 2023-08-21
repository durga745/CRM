package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {
	
	Leads findLeadByEmail(String email);

}
