package br.com.mi80.api_covid19.controller;

import br.com.mi80.api_covid19.dto.EpidemiologyResponse;
import br.com.mi80.api_covid19.dto.LocationProfileResponse;
import br.com.mi80.api_covid19.dto.LocationResponse;
import br.com.mi80.api_covid19.entity.Location;
import br.com.mi80.api_covid19.entity.LocationProfile;
import br.com.mi80.api_covid19.exception.ResourcesNotFoundException;
import br.com.mi80.api_covid19.mapper.LocationMapper;
import br.com.mi80.api_covid19.mapper.LocationProfileMapper;
import br.com.mi80.api_covid19.repository.LocationProfileRepository;
import br.com.mi80.api_covid19.repository.LocationRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
@RequestMapping("/api/v1/locations")
public class LocationController {

    private final LocationRepository repository;
    private final LocationMapper mapper;

    private final LocationProfileRepository repositoryProfile;
    private final LocationProfileMapper mapperProfile;

    public LocationController (LocationRepository repository, LocationMapper mapper, LocationProfileRepository repositoryProfile, LocationProfileMapper mapperProfile) {
        this.repository = repository;
        this.mapper = mapper;
        this.repositoryProfile = repositoryProfile;
        this.mapperProfile = mapperProfile;
    }

    @GetMapping()
    public ResponseEntity<Page<LocationResponse>> listarLocations (
            @PageableDefault(size = 20) Pageable pageable) {
        Page<Location> lista = repository.findAll(pageable);
        Page<LocationResponse> listaCerta = mapper.toResponsePage(lista);
        return ResponseEntity.ok(listaCerta);
    }

    @GetMapping("/{isoCode}")
    public ResponseEntity<LocationResponse> buscarPorCodigo(@PathVariable String isoCode){
        Location buscado = repository.findByIsoCode(isoCode).orElseThrow(() -> new ResourcesNotFoundException("código não encontrado"));

        LocationResponse response = mapper.toResponse(buscado);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{isoCode}/profile")
    public ResponseEntity<LocationProfileResponse> buscarPorCodigoProfile(@PathVariable String isoCode){
        LocationProfile profile = repositoryProfile.findByLocationIsoCode(isoCode).orElseThrow(() -> new ResourcesNotFoundException("código não encontrado"));

        LocationProfileResponse response = mapperProfile.toResponse(profile);
        return ResponseEntity.ok(response);
    }

    //@GetMapping("/{isoCode}/epidemiology")
    //public ResponseEntity<EpidemiologyResponse> buscarPorCodigoEpidemiology(@PathVariable String isoCode){
    //
    //}
}
