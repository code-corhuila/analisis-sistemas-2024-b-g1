package com.corhuila.poo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends ABaseEntity{
    @Column(name = "correo", length = 50, nullable = false, unique = true)
    private String correo;

    @Column(name = "contresenia", length = 50, nullable = false)
    private String contresenia;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", unique = true, nullable = false)
    private Persona personaId;
}
