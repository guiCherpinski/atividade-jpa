package br.com.mi80.api_covid19.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record LocationResponse(
        @Schema(description = "Identificador único", example = "1")
        Long id,
        @Schema(description = "Código")
        String isoCode,
        @Schema(description = "Nome da location" , example = "México")
        String name,
        @Schema(description = "Identificador do continente" , example = "1")
        Short continentId,
        @Schema(description = "Tipo de código")
        String locationTypeCode
) {
}
