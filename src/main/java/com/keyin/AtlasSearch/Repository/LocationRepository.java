package com.keyin.AtlasSearch.Repository;

import com.keyin.AtlasSearch.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Location", path = "Location")
public interface LocationRepository extends JpaRepository<Location, Long> {

     static List<Location> findByCountry(@Param("country") String country) {
          return null;
     }

     @Query(value = "SELECT * FROM product country", nativeQuery = true)
     List<Location> findAllCountry();
}