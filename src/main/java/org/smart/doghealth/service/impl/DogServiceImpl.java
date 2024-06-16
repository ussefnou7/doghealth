package org.smart.doghealth.service.impl;

import org.smart.doghealth.domain.Dog;
import org.smart.doghealth.repo.DogRepo;
import org.smart.doghealth.service.DogService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DogServiceImpl implements DogService {
    private final DogRepo dogRepo;

    public DogServiceImpl(DogRepo dogRepo) {
        this.dogRepo = dogRepo;
    }

    @Override
    public Set<Dog> findAll() {
        return null;
    }

    @Override
    public Dog findById(Long aLong) {
        return dogRepo.findById(aLong).orElse(null);
    }

    @Override
    public Dog save(Dog object) {
        return dogRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        dogRepo.deleteById(aLong);
    }
}
