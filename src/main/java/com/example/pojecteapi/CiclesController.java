package com.example.pojecteapi;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

public class CiclesController {

    @GetMapping("/cicle/curs/grup/aula")
    public ArrayList<LListaCursos> llistaCurs(){
    	ArrayList<LListaCursos> cursos = new ArrayList<>();
    	cursos.add(new LListaCursos("Grado_Medio", "A", "ASIX1", "43"));
    	cursos.add(new LListaCursos("Grado_Medio", "B", "ASIX1", "44"));
    	cursos.add(new LListaCursos("Grado_Medio", "A", "ASIX2", "46"));
    	cursos.add(new LListaCursos("Grado_Medio", "B", "ASIX2", "47"));
    	cursos.add(new LListaCursos("Grado_Medio", "A", "SMX1", "61"));
    	cursos.add(new LListaCursos("Grado_Medio", "B", "SMX1", "62"));
    	cursos.add(new LListaCursos("Grado_Medio", "A", "SMX2", "63"));
    	cursos.add(new LListaCursos("Grado_Medio", "B", "SMX2", "64"));
    	cursos.add(new LListaCursos("Grado_Superior", "A", "DAM1", "70"));
    	cursos.add(new LListaCursos("Grado_Superior", "B", "DAM1", "71"));
    	cursos.add(new LListaCursos("Grado_Superior", "A", "DAM2", "72"));
    	cursos.add(new LListaCursos("Grado_Superior", "B", "DAM2", "73"));
    	cursos.add(new LListaCursos("Grado_Superior", "A", "DAW1", "74"));
    	cursos.add(new LListaCursos("Grado_Superior", "B", "DAW1", "75"));
       	cursos.add(new LListaCursos("Grado_Superior", "A", "DAW2", "76"));
       	cursos.add(new LListaCursos("Grado_Superior", "B", "DAW2", "77"));
    	return cursos;
    	
    }

}
