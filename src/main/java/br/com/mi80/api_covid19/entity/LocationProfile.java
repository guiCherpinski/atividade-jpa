package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "location_profile")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LocationProfile {
    @Id
    @Column(name = "location_id")
    private Long id;

    // AQUI FICA O MAPSID:
    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "aged_65_older")
    private BigDecimal aged65Older;

    @Column(name = "aged_70_older")
    private BigDecimal aged70Older;

    @Column(name = "gdp_per_capita")
    private BigDecimal gdpPerCapita;

    @Column(name = "extreme_poverty")
    private BigDecimal extremePoverty;

    @Column(name = "cardiovasc_death_rate")
    private BigDecimal cardiovascDeath;

    @Column(name = "diabetes_prevalence_numeric")
    private BigDecimal diabetesPrevalence;

    @Column(name = "female_smokers")
    private BigDecimal femaleSmokers;

    @Column(name = "male_smokers")
    private BigDecimal maleSmokers;

    @Column(name = "handwashing_facilities")
    private BigDecimal handwashingFacilities;

    @Column(name = "hospital_beds_per_thousand")
    private BigDecimal hospitalBeds;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "human_development_index")
    private BigDecimal humanDevelopment;



}
