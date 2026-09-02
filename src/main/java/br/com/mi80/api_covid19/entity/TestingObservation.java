package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "vaccination_observation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestingObservation {
    @EmbeddedId
    private ObservationDayID id;

    @MapsId("idLocation")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "total_tests")
    private BigDecimal totalTests;

    @Column(name = "new_tests")
    private BigDecimal newTests;

    @Column(name = "total_tests_per_thousand")
    private BigDecimal totalTestsThousand;

    @Column(name = "new_tests_per_thousand")
    private BigDecimal newTestsThousand;

    @Column(name = "new_tests_smoothed")
    private BigDecimal newTestsSmoothed;

    @Column(name = "new_tests_smoothed_per_thousand")
    private BigDecimal newTestsSmoothedThousand;

    @Column(name = "positive_rate")
    private BigDecimal positiveRate;

    @Column(name = "tests_per_case")
    private BigDecimal testsCase;

    @JoinColumn(name = "test_unit_code")
    @ManyToOne(fetch = FetchType.LAZY)
    private TestUnit testUnit;
}
