package com.example.movielibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieRepositry movieRepositry;

    @GetMapping("/")
    public List<Movie> getAll() {
        return movieRepositry.getAll();
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable("id") int id) {
        return movieRepositry.getById(id);
    }

    @PostMapping("/")
    public int add(@RequestBody List<Movie> movies) {
        return movieRepositry.save(movies);
    }
}
