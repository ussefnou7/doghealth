package org.smart.doghealth;

import org.smart.doghealth.domain.Cause;
import org.smart.doghealth.domain.Disease;
import org.smart.doghealth.domain.Vaccination;
import org.smart.doghealth.service.CauseService;
import org.smart.doghealth.service.DiseaseService;
import org.smart.doghealth.service.DogService;
import org.smart.doghealth.service.VaccinationService;
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

    public DataLoader(DogService dogService, CauseService causeService, DiseaseService diseaseService, VaccinationService vaccinationService) {
        this.dogService = dogService;
        this.causeService = causeService;
        this.diseaseService = diseaseService;
        this.vaccinationService = vaccinationService;
    }

    @Override
    public void run(String... args) throws Exception {
//        Disease parvovirus = new Disease();
//        parvovirus.setName("Infectious canine Hepatitis");
//        Set<Cause> parvovirusCauses = new HashSet<>();
//        parvovirusCauses.add(new Cause("Persistent cough"));
//        parvovirusCauses.add(new Cause("Blue nasal discharge"));
//        parvovirusCauses.add(new Cause("Fever"));
////        parvovirusCauses.add(new Cause("Diarrhea by blood"));
//        parvovirusCauses.add(new Cause("General weakness"));
//        parvovirus.setCauses(parvovirusCauses);
//        diseaseService.save(parvovirus);
//
//        Disease earInfection = new Disease();
//        earInfection.setName("Worm infection");
//        Set<Cause> earInfectionCauses = new HashSet<>();
//        earInfectionCauses.add(new Cause("Stomach bloating"));
//        earInfectionCauses.add(new Cause("Malnutrition"));
//        earInfectionCauses.add(new Cause("Weight loss"));
//        earInfectionCauses.add(new Cause("Hair loss"));
//        earInfection.setCauses(earInfectionCauses);
//        diseaseService.save(earInfection);

    }
}
