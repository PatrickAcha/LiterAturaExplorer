package com.alura.literalura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @Autowired
    private ConsumoAPI consumoAPI;

    @GetMapping("/obtener-datos")
    public String obtenerDatos(@RequestParam String url) {
        return consumoAPI.obtenerDatos(url);
    }
}