package com.alura.literalura.service;

import com.alura.literalura.model.Libro;
import com.alura.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class GutendexService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private ConsumoAPI consumoAPI;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Libro> fetchAndSaveBooks() {
        try {
            // Obtiene los datos de la API de Gutendex
        String json = consumoAPI.obtenerDatos("parametroNecesario");
            // Convierte los datos JSON a un array de objetos Libro
            Libro[] libros = objectMapper.readValue(json, Libro[].class);
            // Guarda los libros obtenidos en la base de datos
            return libroRepository.saveAll(Arrays.asList(libros));
        } catch (IOException ex) {
            // Maneja posibles errores durante la conversión de JSON
            ex.printStackTrace();
            return null;
        }
    }
}