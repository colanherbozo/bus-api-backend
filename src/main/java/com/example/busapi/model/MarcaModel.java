package com.example.busapi.model;

import jakarta.persistence.*;

@Entity
@Table(name ="marca")
public class MarcaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarca;

    private String nombre;

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
