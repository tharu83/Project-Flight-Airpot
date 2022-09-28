package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.dto.Flight;
@Repository
public interface FlightDao extends JpaRepository<Flight,Long>{

}
