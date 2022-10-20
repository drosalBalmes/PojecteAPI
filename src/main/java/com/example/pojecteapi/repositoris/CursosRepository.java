package com.example.pojecteapi.repositoris;

import com.example.pojecteapi.Cursos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CursosRepository extends CrudRepository<Cursos, Long> {
    public List<Cursos> findAll();
}
