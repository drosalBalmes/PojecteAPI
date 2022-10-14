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
        a.add(new Alumnes("David", "Rosal", "drosal@jaumebalmes.net", "DAM", 2));
        a.add(new Alumnes("Waneta","Bytheway","wbytheway@jaumebalmes.net","DAW",2));
        a.add(new Alumnes("Marco","Laureano","mlaurean19@jaumbealmes.net","DAM",2));
        a.add(new Alumnes("Lote","Gatorate","lgatorate@jaumebalmes.net","DAW",2));
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
    //Variable de "/alumnes/grup".
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
    

    @GetMapping("/alumnes/modul/faltes")
    public ArrayList<AlumnesModFaltes> llistatAlModFal(){
    	//trucada al calcul de faltes
    	ArrayList<AlumnesModFaltes> a = new ArrayList<>();
    	a.add(new AlumnesModFaltes("David", "Rosal", "M01", "17%"));
    	a.add(new AlumnesModFaltes("Marco", "Laureano", "M02", "15%"));
    	a.add(new AlumnesModFaltes("Marco", "Laureano", "M10", "20%"));
    	a.add(new AlumnesModFaltes("Pau", "Chacon", "M13", "24%"));
    	return a;
    }

    @GetMapping("alumnes/grup/modul/faltes")
    public ArrayList<AlumnesGrupModFaltes> llistatAlGrupModFal(){
    	//trucada al calcul de faltes
    	ArrayList<AlumnesGrupModFaltes> a = new ArrayList<>();
    	//si grup o modul no valid error controlat
    	a.add(new AlumnesGrupModFaltes("David", "Rosal","DAM", "M01", "17%"));
    	a.add(new AlumnesGrupModFaltes("Marco", "Laureano", "DAW", "M02", "15%"));
    	a.add(new AlumnesGrupModFaltes("Marco", "Laureano","ASIX", "M10", "20%"));
    	a.add(new AlumnesGrupModFaltes("Pau", "Chacon","DAM", "M13", "24%"));
    	return a;

    }

    @GetMapping("alumnes/id")
    public ArrayList<AlumnesId> llistatAlumnesId() {
    	ArrayList<AlumnesId> a = new ArrayList<>();
    	a.add(new AlumnesId("Alberto", "Rodrigo", "12345678C"));
    	a.add(new AlumnesId("Gofre", "Sirope", "23456781D"));
    	return a;
    }
    
    //metode alumnes/grup
    @GetMapping("alumnes/{grup}")
    public ArrayList<Alumnes> llistatAlumnesGrup(@PathVariable String grup){
    	ArrayList<Alumnes> alumnes = llistatAlumnes();
    	ArrayList<Alumnes> alumnesGrup = new ArrayList<>();
    		for (Alumnes a: alumnes) {
    			if (a.getGrup().equals(grup)){
    				alumnesGrup.add(a);
    			}
    		}
    		return alumnesGrup;
		}

}
