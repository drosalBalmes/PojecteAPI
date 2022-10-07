package com.example.pojecteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/alumnes/modul/faltes")
    public ArrayList<AlumnesModFaltes> llistatAlModFal(){
        ArrayList<AlumnesModFaltes> a = new ArrayList<>();
        a.add(new AlumnesModFaltes("David", "Rosal", "M01", "17%"));
        a.add(new AlumnesModFaltes("Marco", "Laureano", "M02", "15%"));
        a.add(new AlumnesModFaltes("Marco", "Laureano", "M10", "20%"));
        a.add(new AlumnesModFaltes("Pau", "Chacon", "M13", "24%"));
        return a;
    }
}
