package org.smart.doghealth.service;

import org.smart.doghealth.domain.Clinic;

public interface ClinicService extends CRUDService<Clinic,Long>{

    Clinic findByCity(String city);
}
