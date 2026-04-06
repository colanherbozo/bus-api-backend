package com.example.busapi.service;

import com.example.busapi.model.BusModel;
import com.example.busapi.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BusService {
    @Autowired
    private BusRepository busRepository;

    public Page<BusModel> getAllBus(Pageable pageable){
        return busRepository.findAll(pageable);
    }

    public BusModel getBusById (Long id) {
        Optional<BusModel> bus = busRepository.findById(id);
        return bus.orElse(null);
    }
}
