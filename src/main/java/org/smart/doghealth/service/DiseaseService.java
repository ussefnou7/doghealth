package org.smart.doghealth.service;

import org.smart.doghealth.domain.Disease;

public interface DiseaseService extends CRUDService<Disease,Long> {
    Disease getByCause(Long id);
}
