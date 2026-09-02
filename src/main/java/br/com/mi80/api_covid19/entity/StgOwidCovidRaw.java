package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "stg_owid_covid_raw")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StgOwidCovidRaw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "continent")
    private String continent;

    @Column(name = "location")
    private String location;

    @Column(name = "date")
    private LocalDate date;

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
    private BigDecimal totalCasesPerMillion;

    @Column(name = "new_cases_per_million")
    private BigDecimal newCasesPerMillion;

    @Column(name = "new_cases_smoothed_per_million")
    private BigDecimal newCasesSmoothedPerMillion;

    @Column(name = "total_deaths_per_million")
    private BigDecimal totalDeathsPerMillion;

    @Column(name = "new_deaths_per_million")
    private BigDecimal newDeathsPerMillion;

    @Column(name = "new_deaths_smoothed_per_million")
    private BigDecimal newDeathsSmoothedPerMillion;

    @Column(name = "reproduction_rate")
    private BigDecimal reproductionRate;

    @Column(name = "icu_patients")
    private BigDecimal icuPatients;

    @Column(name = "icu_patients_per_million")
    private BigDecimal icuPatientsPerMillion;

    @Column(name = "hosp_patients")
    private BigDecimal hospPatients;

    @Column(name = "hosp_patients_per_million")
    private BigDecimal hospPatientsPerMillion;

    @Column(name = "weekly_icu_admissions")
    private BigDecimal weeklyIcuAdmissions;

    @Column(name = "weekly_icu_admissions_per_million")
    private BigDecimal weeklyIcuAdmissionsPerMillion;

    @Column(name = "weekly_hosp_admissions")
    private BigDecimal weeklyHospAdmissions;

    @Column(name = "weekly_hosp_admissions_per_million")
    private BigDecimal weeklyHospAdmissionsPerMillion;

    @Column(name = "total_tests")
    private BigDecimal totalTests;

    @Column(name = "new_tests")
    private BigDecimal newTests;

    @Column(name = "total_tests_per_thousand")
    private BigDecimal totalTestsPerThousand;

    @Column(name = "new_tests_per_thousand")
    private BigDecimal newTestsPerThousand;

    @Column(name = "new_tests_smoothed")
    private BigDecimal newTestsSmoothed;

    @Column(name = "new_tests_smoothed_per_thousand")
    private BigDecimal newTestsSmoothedPerThousand;

    @Column(name = "positive_rate")
    private BigDecimal positiveRate;

    @Column(name = "tests_per_case")
    private BigDecimal testsPerCase;

    @Column(name = "tests_units")
    private String testsUnits;

    @Column(name = "total_vaccinations")
    private BigDecimal totalVaccinations;

    @Column(name = "people_vaccinated")
    private BigDecimal peopleVaccinated;

    @Column(name = "people_fully_vaccinated")
    private BigDecimal peopleFullyVaccinated;

    @Column(name = "total_boosters")
    private BigDecimal totalBoosters;

    @Column(name = "new_vaccinations")
    private BigDecimal newVaccinations;

    @Column(name = "new_vaccinations_smoothed")
    private BigDecimal newVaccinationsSmoothed;

    @Column(name = "total_vaccinations_per_hundred")
    private BigDecimal totalVaccinationsPerHundred;

    @Column(name = "people_vaccinated_per_hundred")
    private BigDecimal peopleVaccinatedPerHundred;

    @Column(name = "people_fully_vaccinated_per_hundred")
    private BigDecimal peopleFullyVaccinatedPerHundred;

    @Column(name = "total_boosters_per_hundred")
    private BigDecimal totalBoostersPerHundred;

    @Column(name = "new_vaccinations_smoothed_per_million")
    private BigDecimal newVaccinationsSmoothedPerMillion;

    @Column(name = "new_people_vaccinated_smoothed")
    private BigDecimal newPeopleVaccinatedSmoothed;

    @Column(name = "new_people_vaccinated_smoothed_per_hundred")
    private BigDecimal newPeopleVaccinatedSmoothedPerHundred;

    @Column(name = "stringency_index")
    private BigDecimal stringencyIndex;

    @Column(name = "population")
    private Long population;

    @Column(name = "population_density")
    private BigDecimal populationDensity;

    @Column(name = "median_age")
    private BigDecimal medianAge;

    @Column(name = "aged_65_older")
    private BigDecimal aged65Older;

    @Column(name = "aged_70_older")
    private BigDecimal aged70Older;

    @Column(name = "gdp_per_capita")
    private BigDecimal gdpPerCapita;

    @Column(name = "extreme_poverty")
    private BigDecimal extremePoverty;

    @Column(name = "cardiovasc_death_rate")
    private BigDecimal cardiovascDeathRate;

    @Column(name = "diabetes_prevalence")
    private BigDecimal diabetesPrevalence;

    @Column(name = "female_smokers")
    private BigDecimal femaleSmokers;

    @Column(name = "male_smokers")
    private BigDecimal maleSmokers;

    @Column(name = "handwashing_facilities")
    private BigDecimal handwashingFacilities;

    @Column(name = "hospital_beds_per_thousand")
    private BigDecimal hospitalBedsPerThousand;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "human_development_index")
    private BigDecimal humanDevelopmentIndex;

    @Column(name = "excess_mortality_cumulative_absolute")
    private BigDecimal excessMortalityCumulativeAbsolute;

    @Column(name = "excess_mortality_cumulative")
    private BigDecimal excessMortalityCumulative;

    @Column(name = "excess_mortality")
    private BigDecimal excessMortality;

    @Column(name = "excess_mortality_cumulative_per_million")
    private BigDecimal excessMortalityCumulativePerMillion;
}