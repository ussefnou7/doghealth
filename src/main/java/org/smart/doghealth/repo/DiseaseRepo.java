package org.smart.doghealth.repo;

import org.smart.doghealth.domain.Disease;
import org.smart.doghealth.service.CRUDService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DiseaseRepo extends JpaRepository<Disease,Long> {
    @Query(value = "SELECT disease_id from diseases_causes where causes_id = ?1", nativeQuery = true)
    Long findByCause(@Param("cause_id") Long cause_id);
}
