package org.smart.doghealth.service.impl;

import org.smart.doghealth.domain.Vaccination;
import org.smart.doghealth.repo.VaccinationRepo;
import org.smart.doghealth.service.VaccinationService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VaccinationServiceImpl implements VaccinationService {
    private final VaccinationRepo vaccinationRepo;

    public VaccinationServiceImpl(VaccinationRepo vaccinationRepo) {
        this.vaccinationRepo = vaccinationRepo;
    }

    @Override
    public Set<Vaccination> findAll() {
        Set<Vaccination> vaccinations = new HashSet<>();
        vaccinationRepo.findAll().forEach(vaccinations::add);
        return vaccinations;
    }

    @Override
    public Vaccination findById(Long aLong) {
        return vaccinationRepo.findById(aLong).get();
    }

    @Override
    public Vaccination save(Vaccination object) {
        return vaccinationRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vaccinationRepo.deleteById(aLong);
    }

    @Override
    public Vaccination findByAge(String age) {
        return vaccinationRepo.findByAgeIgnoreCase(age);
    }

    @Override
    public Set<Vaccination> findAllByAge(String age) {
        return vaccinationRepo.findAllByAgeIgnoreCase(age);
    }
}
