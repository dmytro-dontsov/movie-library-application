package com.example.movielibrary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    private int id;
    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

}