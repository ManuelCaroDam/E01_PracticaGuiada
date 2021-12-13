package com.e01ManuelCaro.e01ManuelCaro.service;

import com.e01ManuelCaro.e01ManuelCaro.errores.excepciones.ListEntityNotFoundException;
import com.e01ManuelCaro.e01ManuelCaro.model.EstacionServicio;
import com.e01ManuelCaro.e01ManuelCaro.repos.EstacionServicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionSerivicioService {

    private final EstacionServicioRepository estacionServicioRepository;


    public List<EstacionServicio> findAll() {
        List<EstacionServicio> result = estacionServicioRepository.findAll();

        if (result.isEmpty()) {
            throw  new ListEntityNotFoundException(EstacionServicio.class);
        }else {
            return result;
        }
    }


}
