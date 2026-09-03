package br.com.mi80.api_covid19.mapper;

import br.com.mi80.api_covid19.dto.LocationProfileResponse;
import br.com.mi80.api_covid19.dto.LocationResponse;
import br.com.mi80.api_covid19.entity.LocationProfile;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class LocationProfileMapper {


    public LocationProfileResponse toResponse (LocationProfile profile) {
        return new LocationProfileResponse(
                profile.getId(),
                profile.getAged65Older(),
                profile.getAged70Older(),
                profile.getGdpPerCapita(),
                profile.getExtremePoverty(),
                profile.getCardiovascDeath(),
                profile.getDiabetesPrevalence(),
                profile.getFemaleSmokers(),
                profile.getMaleSmokers(),
                profile.getHandwashingFacilities(),
                profile.getHospitalBeds(),
                profile.getLifeExpectancy(),
                profile.getHumanDevelopment()
        );
    }

    public List<LocationProfileResponse> toResponseList (List<LocationProfile> lista) {
        return lista.stream().map(this :: toResponse).toList();
    }

    public Page<LocationProfileResponse> toResponsePage (Page<LocationProfile> lista) {
        return lista.map(this :: toResponse);
    }
}
