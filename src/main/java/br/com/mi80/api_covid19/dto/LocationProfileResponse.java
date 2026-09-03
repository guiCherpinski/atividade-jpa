package br.com.mi80.api_covid19.dto;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public record LocationProfileResponse(
        Long id,
        BigDecimal aged65Older,
        BigDecimal aged70Older,
        BigDecimal gdpPerCapita,
        BigDecimal extremePoverty,
        BigDecimal cardiovascDeath,
        BigDecimal diabetesPrevalence,
        BigDecimal femaleSmokers,
        BigDecimal maleSmokers,
        BigDecimal handwashingFacilities,
        BigDecimal hospitalBeds,
        BigDecimal lifeExpectancy,
        BigDecimal humanDevelopment
) {
}
