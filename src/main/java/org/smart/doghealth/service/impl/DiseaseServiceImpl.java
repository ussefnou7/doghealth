package org.smart.doghealth.service.impl;

import org.smart.doghealth.domain.Disease;
import org.smart.doghealth.repo.DiseaseRepo;
import org.smart.doghealth.service.DiseaseService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    private final DiseaseRepo diseaseRepo;

    public DiseaseServiceImpl(DiseaseRepo diseaseRepo) {
        this.diseaseRepo = diseaseRepo;
    }

    @Override
    public Set<Disease> findAll() {
        Set<Disease> diseases = new HashSet<>();
        diseaseRepo.findAll().forEach(diseases::add);
        return diseases;
    }

    @Override
    public Disease findById(Long aLong) {
        return diseaseRepo.findById(aLong).orElse(null);
    }

    @Override
    public Disease save(Disease object) {
        return diseaseRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        diseaseRepo.deleteById(aLong);

    }

    @Override
    public Disease getByCause(Long id) {
        Long diseaseId = diseaseRepo.findByCause(id);
        Optional<Disease> disease = diseaseRepo.findById(diseaseId);
        return disease.get();
    }
}
