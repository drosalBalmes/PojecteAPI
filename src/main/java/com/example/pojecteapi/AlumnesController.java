package com.example.pojecteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class AlumnesController {
    @GetMapping("/alumnes")
    public ArrayList<Alumnes> llistatAlumnes(){
        ArrayList<Alumnes> a = new ArrayList<>();
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
    
    @GetMapping("/alumnes/grup")
    public ArrayList<AlumnesGrup> grup(){
    	ArrayList<AlumnesGrup> grup = new ArrayList<>();
    	grup.add(new AlumnesGrup("David", "Rosal","DAM"));
    	grup.add(new AlumnesGrup("Waneta","Bytheway","DAW"));
    	grup.add(new AlumnesGrup("Marco", "Laureano","DAM"));
    	grup.add(new AlumnesGrup("Lote","Gatorate","DAW"));
    	return grup;
    }
}
