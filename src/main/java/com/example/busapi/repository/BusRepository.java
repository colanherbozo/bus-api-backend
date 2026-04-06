package com.example.busapi.repository;

import com.example.busapi.model.BusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusModel, Long> {

}
