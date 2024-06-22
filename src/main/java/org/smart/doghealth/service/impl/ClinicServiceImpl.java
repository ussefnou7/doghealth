package org.smart.doghealth.service.impl;

import org.smart.doghealth.domain.Clinic;
import org.smart.doghealth.repo.ClinicRepo;
import org.smart.doghealth.service.ClinicService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClinicServiceImpl implements ClinicService {

    final private ClinicRepo clinicRepo;

    public ClinicServiceImpl(ClinicRepo clinicRepo) {
        this.clinicRepo = clinicRepo;
    }

    @Override
    public Clinic findByCity(String city) {
        return clinicRepo.findByCity(city);
    }

    @Override
    public Set<Clinic> findAll() {
        Set<Clinic> clinics = new HashSet<>();
        clinicRepo.findAll().forEach(clinics::add);
        return clinics;
    }

    @Override
    public Clinic findById(Long aLong) {
        return clinicRepo.findById(aLong).get();
    }

    @Override
    public Clinic save(Clinic object) {
        return clinicRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        clinicRepo.deleteById(aLong);
    }
}
