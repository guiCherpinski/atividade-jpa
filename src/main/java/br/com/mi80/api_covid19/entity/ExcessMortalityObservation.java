package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "excess_mortality_observation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExcessMortalityObservation {
    @EmbeddedId
    private ObservationDayID id;

    @MapsId("idLocation")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "excess_mortality_cumulative_absolute")
    private BigDecimal excessMortalityAbsolute;

    @Column(name = "excess_mortality_cumulative")
    private BigDecimal excessMortalityCumulative;

    @Column(name = "excess_mortality")
    private BigDecimal excessMortality;

    @Column(name = "excess_mortality_cumulative_per_million")
    private BigDecimal excessMortalityMillion;
}
