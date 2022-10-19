package com.example.pojecteapi.repositoris;

import com.example.pojecteapi.Alumnes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlumnesRepository extends CrudRepository<Alumnes, Long> {
    public List<Alumnes> findAll();

}
