package br.com.mi80.api_covid19.mapper;

import br.com.mi80.api_covid19.dto.LocationResponse;
import br.com.mi80.api_covid19.entity.Location;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class LocationMapper {

    public LocationResponse toResponse (Location location) {
        return new LocationResponse(
                location.getId(),
                location.getIsoCode(),
                location.getName(),
                location.getContinent().getContinentId(),
                location.getIsoCode()
        );
    }

    public List<LocationResponse> toResponseList (List<Location> locations) {
        return locations.stream().map(this :: toResponse).toList();
    }

    public Page<LocationResponse> toResponsePage (Page<Location> locations) {
        return locations.map(this :: toResponse);
    }
}
