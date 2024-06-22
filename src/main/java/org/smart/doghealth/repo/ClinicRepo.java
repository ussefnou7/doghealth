package org.smart.doghealth.repo;

import org.smart.doghealth.domain.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepo extends JpaRepository<Clinic,Long> {
    Clinic findByCity(String city);
}
