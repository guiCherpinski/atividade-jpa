package br.com.mi80.api_covid19.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ObservationDayID implements Serializable {

    @Column(name = "location_id")
    private Long idLocation;

    @Column(name = "observation_date")
    private LocalDate observationDate;
}
