package com.e01ManuelCaro.e01ManuelCaro.controller;


import com.e01ManuelCaro.e01ManuelCaro.model.EstacionServicio;
import com.e01ManuelCaro.e01ManuelCaro.service.EstacionSerivicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estacionServicio")
public class EstacionServicioController {

    private EstacionSerivicioService estacionSerivicioService;

    @GetMapping("/")
    public List<EstacionServicio> todos () {
        return estacionSerivicioService.findAll();
    }



}
