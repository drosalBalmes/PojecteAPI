package com.example.pojecteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;


@RestController
public class AlumnesController {
	 ArrayList<Alumnes> a = new ArrayList<>();
    @GetMapping("/alumnes")
    public ArrayList<Alumnes> llistatAlumnes(){
        a = new ArrayList<>();
        a.add(new Alumnes("David","Rosal", "DAM"));
        a.add(new Alumnes("Waneta","Bytheway","DAW"));
        a.add(new Alumnes("Marco","Laureano","DAM"));
        a.add(new Alumnes("Lote","Gatorate","DAW"));
        return a;
    }
    
    @GetMapping("/horari/grup")
    public ArrayList<HorariGrup> horarigrup(){
    	ArrayList<HorariGrup> hora = new ArrayList<>();
    	hora.add(new HorariGrup(LocalDate.now(), "DAM"));
    	hora.add(new HorariGrup(LocalDate.now(), "DAW"));
    	hora.add(new HorariGrup(LocalDate.now(), "DAM"));
    	hora.add(new HorariGrup(LocalDate.now(), "DAW"));
    	return hora;
    }
    
//    @GetMapping("/alumnes/{grup}")
//    public Alumnes alumnesgrup(@PathVariable(value = "grup")Alumnes grup){
//    	return grup;
//
//		}
   ArrayList <AlumnesGrup> y = new ArrayList<>();
    @GetMapping("/alumnes/grup")
    public ArrayList<AlumnesGrup> llistatAlumnesGrup(){
    	y = new ArrayList<>();
    	y.add(new AlumnesGrup("David","Rosal", "DAM"));
        y.add(new AlumnesGrup("Waneta","Bytheway","DAW"));
        y.add(new AlumnesGrup("Marco","Laureano","DAM"));
        y.add(new AlumnesGrup("Lote","Gatorate","DAW"));
        y.add(new AlumnesGrup("A","C","DAM"));
        y.add(new AlumnesGrup("B","D","DAM"));
    	return y;
    }
    //Variable de /alumnes/grup
    @GetMapping("/alumnes/{grup}")
    public ArrayList<AlumnesGrup> alumnesgrup(@PathVariable(value = "grup")String grup){
    	ArrayList <AlumnesGrup> g = new ArrayList<>();
    	for(AlumnesGrup x:y) {
    		if(x.getGrup().equalsIgnoreCase(grup)) {
    			g.add(x);
    		}
    	}
    	return y;
		}
    
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
