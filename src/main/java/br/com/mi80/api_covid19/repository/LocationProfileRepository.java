package br.com.mi80.api_covid19.repository;

import br.com.mi80.api_covid19.entity.LocationProfile;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationProfileRepository extends JpaRepository<LocationProfile , Long> {

    Optional<LocationProfile> findByLocationIsoCode (String isoCode);
}
