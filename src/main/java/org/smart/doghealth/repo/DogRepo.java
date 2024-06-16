package org.smart.doghealth.repo;

import org.smart.doghealth.domain.Dog;
import org.smart.doghealth.service.CRUDService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepo extends JpaRepository<Dog,Long> {

}
