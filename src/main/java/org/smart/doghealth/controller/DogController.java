package org.smart.doghealth.controller;

import org.smart.doghealth.domain.*;
import org.smart.doghealth.service.*;
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
    private final ClinicService clinicService;


    public DogController(DogService dogService, CauseService causeService, DiseaseService diseaseService, VaccinationService vaccinationService, ClinicService clinicService) {
        this.dogService = dogService;
        this.causeService = causeService;
        this.diseaseService = diseaseService;
        this.vaccinationService = vaccinationService;
        this.clinicService = clinicService;
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
    @GetMapping("/find_clinic")
    public Clinic findClinic(@RequestParam String city) {
        Clinic clinic = clinicService.findByCity(city);
        return clinic;
    }
}
