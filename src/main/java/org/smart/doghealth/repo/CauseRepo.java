package org.smart.doghealth.repo;

import org.smart.doghealth.domain.Cause;
import org.smart.doghealth.service.CRUDService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CauseRepo extends JpaRepository<Cause,Long> {
    Cause findByDescriptionEqualsIgnoreCase(String s);
}
