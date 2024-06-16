package org.smart.doghealth.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "dogs")
public class Dog extends BaseEnitity {
    @Column(name = "age")
    private String age;

    @OneToMany
    private Set<Disease> diseases;
    @OneToMany
    private Set<Vaccination> vaccinations;
}
