package org.smart.doghealth.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clinics")
public class Clinic extends BaseEnitity {
    private String name;
    private String city;
    private String address;
    private String phone;
    private String hours;
}
