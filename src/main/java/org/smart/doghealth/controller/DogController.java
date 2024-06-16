package org.smart.doghealth.controller;

import org.smart.doghealth.domain.Cause;
import org.smart.doghealth.domain.Disease;
import org.smart.doghealth.domain.Dog;
import org.smart.doghealth.domain.Vaccination;
import org.smart.doghealth.service.CauseService;
import org.smart.doghealth.service.DiseaseService;
import org.smart.doghealth.service.DogService;
import org.smart.doghealth.service.VaccinationService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/dog")
public class DogController {
    private final DogService dogService;
    private final CauseService causeService;
    private final DiseaseService diseaseService;
    private final VaccinationService vaccinationService;

    public DogController(DogService dogService, CauseService causeService, DiseaseService diseaseService, VaccinationService vaccinationService) {
        this.dogService = dogService;
        this.causeService = causeService;
        this.diseaseService = diseaseService;
        this.vaccinationService = vaccinationService;
    }

    @GetMapping("/list_causes")
    public Set<Cause> getCauses() {
        Set<Cause> causes = causeService.findAll();
        return causes;
    }

    @GetMapping("/find")
    public Dog findDiseaseVac(@RequestParam String[] causes,@RequestParam String age) {
        Dog dog = new Dog();
        dog.setAge(age);
        Set<Disease> diseaseSet = new HashSet<>();
        for (String cause:causes) {
            Cause cause1 = causeService.findByDescriptionEqualsIgnoreCase(cause);
            Disease disease = diseaseService.getByCause(cause1.getId());
            diseaseSet.add(disease);
        }
        dog.setDiseases(diseaseSet);
        Set<Vaccination> vaccinations = vaccinationService.findAllByAge(age);
        dog.setVaccinations(vaccinations);
        return dog;
    }
//    @GetMapping("/get_disease")
//    public Set<Disease> getDisease() {
//        Set<Disease> diseases = new HashSet<>();
//        Cause cause1 = causeService.getByName("Anorexia");
//        Disease disease = diseaseService.getByCause(cause1.getId());
//        diseases.add(disease);
//        return diseases;
//    }
}
