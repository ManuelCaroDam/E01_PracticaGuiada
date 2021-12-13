package com.e01ManuelCaro.e01ManuelCaro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstacionServicio {

    @Id @GeneratedValue
    private Long id;
    private String marca;
    private String ubicacion;
    private Boolean tieneAutolavado;
    private double precioGasoilNormal;
    private double precioGasolina95Octavos;
    private double precioGasoilEspecial;
    private double precioGasolina98;
    private String servicios;
    private LocalDate fechaApertura;
}
