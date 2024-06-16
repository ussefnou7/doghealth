package org.smart.doghealth.repo;

import org.smart.doghealth.domain.Vaccination;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VaccinationRepo extends CrudRepository<Vaccination,Long> {
    Vaccination findByAgeIgnoreCase(String age);
    Set<Vaccination> findAllByAgeIgnoreCase(String age);
}
