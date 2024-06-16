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
//        parvovirus.setName("Parvovirus");
//        Set<Cause> parvovirusCauses = new HashSet<>();
//        parvovirusCauses.add(new Cause("Lethargy"));
//        parvovirusCauses.add(new Cause("Anorexia"));
//        parvovirusCauses.add(new Cause("vomiting"));
//        parvovirusCauses.add(new Cause("Diarrhea by blood"));
//        parvovirusCauses.add(new Cause("drought"));
//        parvovirus.setCauses(parvovirusCauses);
//        diseaseService.save(parvovirus);
//
//        Disease earInfection = new Disease();
//        earInfection.setName("Ear infection");
//        Set<Cause> earInfectionCauses = new HashSet<>();
//        earInfectionCauses.add(new Cause("Ear swelling and redness"));
//        earInfectionCauses.add(new Cause("ear secretion"));
//        earInfectionCauses.add(new Cause("bad smell"));
//        earInfection.setCauses(earInfectionCauses);
//        diseaseService.save(earInfection);
//
//        Set<Disease> diseases = new HashSet<>();
//        Cause cause1 = causeService.findByDescriptionEqualsIgnoreCase("Lethargy");
//        Disease disease = diseaseService.getByCause(cause1.getId());
//        diseases.add(disease);
//        System.out.println(disease);

//        Vaccination vaccination = new Vaccination("45th Day","Seven-cell Vaccination");
//        vaccinationService.save(vaccination);
//        vaccination = new Vaccination("45th Day","Eight-cell Vaccination");
//        vaccinationService.save(vaccination);
//
//        Set<Vaccination> vaccinations = vaccinationService.findAllByAge("45th Day");
//        System.out.println(vaccinations);

    }
}
