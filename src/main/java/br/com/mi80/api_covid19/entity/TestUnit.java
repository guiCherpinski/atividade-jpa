package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "test_unit")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TestUnit {
    @Id
    @Column(
            name = "test_unit_code",
            length = 30
    )
    private String testUnitCode;

    @Column(
            name = "description",
            length = 100,
            nullable = false
    )
    private String description;
}
