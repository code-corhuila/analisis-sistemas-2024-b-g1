package com.corhuila.poo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona extends ABaseEntity{

    @Column(name = "nombre", length = 55)
    private String nombre;

    @Column(name = "apellido", length = 55)
    private String apellido;

    @Column(name = "direccion", length = 55)
    private String direccion;
}
