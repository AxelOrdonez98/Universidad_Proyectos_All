package com.XML;

import java.util.ArrayList;
import java.util.List;

public class Guardar {

    private List movies = new ArrayList();

    public Guardar() {
    }

    public List getMovies() {
        return movies;
    }

    public void setMovies(List movies) {
        this.movies = movies;
    }
    @Override
    public String toString() {
        return "DVD{" + "movies=" + movies + '}';
    }
}
