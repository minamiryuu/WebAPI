package com.example.demo.repository;

import java.util.List;

import com.example.demo.domain.Movie;

public interface MovieRepository {
    List<Movie> findList(String movieName, String directorName);

    Movie findOne(String movieId);

    Movie lock(String movieId);

    void insert(Movie movie);

    void update(Movie movie);

    void delete(Movie movie);
}