package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "hospitalization_observation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class HospitalizationObservation {
    @EmbeddedId
    private ObservationDayID id;

    @MapsId("idLocation")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "icu_patients")
    private BigDecimal icuPatients;

    @Column(name = "icu_patients_per_million")
    private BigDecimal icuPatientsMillion;

    @Column(name = "hosp_patients")
    private BigDecimal hospPatients;

    @Column(name = "hosp_patients_per_million")
    private BigDecimal hospPatientsMillion;

    @Column(name = "weekly_icu_admissions")
    private BigDecimal weeklyIcuAdmissions;

    @Column(name = "weekly_icu_admissions_per_million")
    private BigDecimal weeklyIcuAdmissionsMillion;

    @Column(name = "weekly_hosp_admissions")
    private BigDecimal weeklyHospAdmissions;

    @Column(name = "weekly_hosp_admissions_per_million")
    private BigDecimal weeklyHopsAdissionsMillion;
}
