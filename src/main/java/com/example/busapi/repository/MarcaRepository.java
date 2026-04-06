package com.example.busapi.repository;

import com.example.busapi.model.MarcaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<MarcaModel, Long> {
}
