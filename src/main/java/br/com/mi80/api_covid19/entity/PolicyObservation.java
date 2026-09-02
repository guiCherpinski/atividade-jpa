package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "policy_observation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PolicyObservation {
    @EmbeddedId
    private ObservationDayID id;

    @MapsId("idLocation")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(
            name = "stringency_index",
            nullable = false
    )
    private BigDecimal stringencyIndex;
}
