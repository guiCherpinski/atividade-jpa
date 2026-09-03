package br.com.mi80.api_covid19.repository;

import br.com.mi80.api_covid19.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface LocationRepository extends JpaRepository<Location, Long> {

    Optional<Location> findByIsoCode (String isoCode);
}
