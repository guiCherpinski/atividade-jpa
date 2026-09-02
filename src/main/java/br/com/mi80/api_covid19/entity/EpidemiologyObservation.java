package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "epidemiology_observation")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class EpidemiologyObservation implements Serializable {
    @EmbeddedId
    private ObservationDayID id;

    @MapsId("idLocation")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "total_cases")
    private BigDecimal totalCases;

    @Column(name = "new_cases")
    private BigDecimal newCases;

    @Column(name = "new_cases_smoothed")
    private BigDecimal newCasesSmoothed;

    @Column(name = "total_deaths")
    private BigDecimal totalDeaths;

    @Column(name = "new_deaths")
    private BigDecimal newDeaths;

    @Column(name = "new_deaths_smoothed")
    private BigDecimal newDeathsSmoothed;

    @Column(name = "total_cases_per_million")
    private BigDecimal totalCasesMillion;

    @Column(name = "new_cases_per_million")
    private BigDecimal newCasesMillion;

    @Column(name = "new_cases_smoothed_per_million")
    private BigDecimal newCasesSmoothedMillion;

    @Column(name = "total_deaths_per_million")
    private BigDecimal totalDeathsMillion;

    @Column(name = "new_deaths_per_million")
    private BigDecimal newDeathsMillion;

    @Column(name = "new_deaths_smoothed_per_million")
    private BigDecimal newDeathsSmoothedMillion;

    @Column(name = "reproduction_rate")
    private BigDecimal reproductionRate;
}
