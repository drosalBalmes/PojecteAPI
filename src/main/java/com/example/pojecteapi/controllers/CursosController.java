package com.example.pojecteapi.controllers;

import java.util.List;

import com.example.pojecteapi.Cursos;
import com.example.pojecteapi.repositoris.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cursos")
public class CursosController {

	@Autowired //per instanciar automaticament cuan sigui necesari
	CursosRepository cursosRep;

	@GetMapping("")
	public List<Cursos> llistatCursos() {
		return cursosRep.findAll();
	}
}
