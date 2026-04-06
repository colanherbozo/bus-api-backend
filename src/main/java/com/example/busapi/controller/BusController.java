package com.example.busapi.controller;

import com.example.busapi.model.BusModel;
import com.example.busapi.service.BusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class BusController {

    @Autowired
    private BusService serviceB;

    //GET
    @GetMapping ("/bus")
    public Page<BusModel> listarTodo(Pageable pageable){
        return serviceB.getAllBus(pageable);
    }

    //GET(ID)
    @GetMapping("/bus/{id}")
    public BusModel listarPorId(@PathVariable Long id){
        return serviceB.getBusById(id);
    }
}
