package com.example.pojecteapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class AlumnesController {
    @GetMapping("/alumnes")
    public ArrayList<Alumnes> llistatAlumnes(){
        ArrayList<Alumnes> a = new ArrayList<>();
        a.add(new Alumnes("David","Rosal","emailrandom@jaumebalmes.net", "DAM",1));
        a.add(new Alumnes("Waneta","Bytheway","emailrandom@jaumebalmes.net", "DAM",1));
        a.add(new Alumnes("Marco","Laureano","emailrandom@jaumebalmes.net", "ASIX",1));
        a.add(new Alumnes("Lote","Gatorate","emailrandom@jaumebalmes.net", "DAW",1));
        return a;
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
