package br.com.mi80.api_covid19.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "etl_load")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EtlLoad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "source_filename",
            nullable = false
    )
    private String sourceFilename;

    @Column(
            name = "raw_row_count",
            nullable = false
    )
    private Long rawRowCount;

    @Column(
            name = "normalized_day_count",
            nullable = false
    )
    private Long normalizedDayCount;

    @Column(
            name = "complementary_duplicate_count",
            nullable = false
    )
    private Long complementaryDuplicateCount;

    @Column(
            name = "loaded_at",
            nullable = false
    )
    private Timestamp loadedAt;
}
