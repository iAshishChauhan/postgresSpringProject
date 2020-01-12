package com.training.demoorganisation.repository;

import com.training.demoorganisation.entity.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Integer> {

}
