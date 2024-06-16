package org.smart.doghealth.service.impl;

import org.smart.doghealth.domain.Cause;
import org.smart.doghealth.repo.CauseRepo;
import org.smart.doghealth.service.CauseService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CauseServiceImpl implements CauseService {
    private final CauseRepo causeRepo;

    public CauseServiceImpl(CauseRepo causeRepo) {
        this.causeRepo = causeRepo;
    }

    @Override
    public Set<Cause> findAll() {
        Set<Cause> causes = new HashSet<>();
        causeRepo.findAll().forEach(causes::add);
        return causes;
    }

    @Override
    public Cause findById(Long aLong) {
        return causeRepo.findById(aLong).orElse(null);
    }

    @Override
    public Cause save(Cause object) {
        return causeRepo.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        causeRepo.deleteById(aLong);
    }

    @Override
    public Set<Cause> getCauses() {

        return null;
    }

    @Override
    public Cause findByDescriptionEqualsIgnoreCase(String s) {
        return causeRepo.findByDescriptionEqualsIgnoreCase(s);
    }
}
