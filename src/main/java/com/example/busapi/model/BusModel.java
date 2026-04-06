package com.example.busapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name ="bus")
public class BusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;

    @Column (name = "numBus")
    private long numBus;

    @Column
    private String placa;

    @Column
    private LocalDateTime fecCreacion = LocalDateTime.now();

    @Column
    private String caracteristica;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private MarcaModel marca;

    @Column
    private Boolean estado = true;

    public long getNumBus() {
        return numBus;
    }

    public void setNumBus(long numBus) {
        this.numBus = numBus;
    }

    public long getIdBus() {
        return id;
    }

    public void setIdBus(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(LocalDateTime fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public MarcaModel getMarca() {
        return marca;
    }

    public void setMarca(MarcaModel marca) {
        this.marca = marca;
    }
}
