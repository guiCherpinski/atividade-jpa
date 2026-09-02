package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "observation_day")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ObservationDay {
    @Id
    @Column(
            name = "location_id",
            nullable = false
    )
    private Long location_id;



    @Id
    @Column(
            name = "observation_date",
            nullable = false
    )
    private Date observationDate;
}
