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
    	
    
}
