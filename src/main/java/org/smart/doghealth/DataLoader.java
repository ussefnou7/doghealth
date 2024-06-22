package org.smart.doghealth;

import org.smart.doghealth.domain.Cause;
import org.smart.doghealth.domain.Clinic;
import org.smart.doghealth.domain.Disease;
import org.smart.doghealth.domain.Vaccination;
import org.smart.doghealth.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final DogService dogService;
    private final CauseService causeService;
    private final DiseaseService diseaseService;
    private final VaccinationService vaccinationService;
    private final ClinicService clinicService;

    public DataLoader(DogService dogService, CauseService causeService, DiseaseService diseaseService, VaccinationService vaccinationService, ClinicService clinicService) {
        this.dogService = dogService;
        this.causeService = causeService;
        this.diseaseService = diseaseService;
        this.vaccinationService = vaccinationService;
        this.clinicService = clinicService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
