package org.smart.doghealth.service;

import org.smart.doghealth.domain.Vaccination;

import java.util.Set;

public interface VaccinationService extends CRUDService<Vaccination,Long> {
    Vaccination findByAge(String age);
    Set<Vaccination> findAllByAge(String age);
}
