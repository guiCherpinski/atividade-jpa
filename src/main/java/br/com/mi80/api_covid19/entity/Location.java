package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "location")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long location_id;

    @Column(
            length = 12, nullable = false,
            name = "iso_code"
    )
    private String iso_code;

    @Column(
            length = 120, nullable = false,
            name = "name"
    )
    private String name;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "continent_id",
            nullable = false
    )
    private Continent continent_id;

    @JoinColumn(
            name = "location_type_code",
            nullable = false
    )
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private LocationType location_type_code;
}
