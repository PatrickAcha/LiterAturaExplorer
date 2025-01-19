package com.alura.literalura.controller;

import com.alura.literalura.model.Libro;
import com.alura.literalura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gutendex")
public class GutendexController {

    @Autowired
    private GutendexService gutendexService;

    @GetMapping("/fetch-books")
    public List<Libro> fetchBooks() {
        return gutendexService.fetchAndSaveBooks();
    }
}