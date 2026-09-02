package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * This is the class that represents the object of content
 */

@Entity
@Table(name = "continent")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short continentId;

    @Column(length = 40, nullable = false, name = "name")
    private String name;
}
