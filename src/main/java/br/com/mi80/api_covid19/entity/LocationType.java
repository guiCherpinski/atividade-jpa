package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "location_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LocationType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            nullable = false,
            length = 30,
            name = "location_type_code"
    )
    private String location;

    @Column(
            name = "description",
            length = 150,
            nullable = false
    )
    private String description;
}
