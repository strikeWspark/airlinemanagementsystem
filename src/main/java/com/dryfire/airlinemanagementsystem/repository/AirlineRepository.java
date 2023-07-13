package com.dryfire.airlinemanagementsystem.repository;

import com.dryfire.airlinemanagementsystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends CrudRepository<Flight, Integer> {
}
