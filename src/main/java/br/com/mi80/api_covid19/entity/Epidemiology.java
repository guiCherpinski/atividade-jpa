package br.com.mi80.api_covid19.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Epidemiology implements Serializable {
    @Id
    @Column(
            name = "location_id",
            nullable = false
    )
    private Long locationId;

    @Id
    @Column(
            name = "observation_date",
            nullable = false
    )
    private Date observationDate;

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


}
