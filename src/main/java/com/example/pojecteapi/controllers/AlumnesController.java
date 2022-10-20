package com.example.pojecteapi.controllers;

import com.example.pojecteapi.*;
import com.example.pojecteapi.repositoris.AlumnesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("alumnes")
public class AlumnesController {
	@Autowired //per instanciar automaticament cuan sigui necesari
	AlumnesRepository alumnRep;

	@GetMapping("")
	public List<Alumnes> llistatAlumnes() {
		return alumnRep.findAll();
	}

	ArrayList<AlumnesGrup> y = new ArrayList<>();

	@GetMapping("/grup")
	public ArrayList<AlumnesGrup> llistatAlumnesGrup() {
		y = new ArrayList<>();
		y.add(new AlumnesGrup("David", "Rosal", "DAM"));
		y.add(new AlumnesGrup("Waneta", "Bytheway", "DAW"));
		y.add(new AlumnesGrup("Marco", "Laureano", "DAM"));
		y.add(new AlumnesGrup("Lote", "Gatorate", "DAW"));
		y.add(new AlumnesGrup("A", "C", "DAM"));
		y.add(new AlumnesGrup("B", "D", "DAM"));
		return y;
	}
	//Variable de "/alumnes/grup".
//    @GetMapping("/grup/{grup}")
//    public ArrayList<AlumnesGrup> alumnesgrup(@PathVariable(value = "grup")String grup){
//    	ArrayList <AlumnesGrup> g = new ArrayList<>();
//    	for(AlumnesGrup x:y) {
//    		if(x.getGrup().equalsIgnoreCase(grup)) {
//    			g.add(x);
//    		}
//    	}
//    	return y;
//		}


	@GetMapping("/modul/faltes")
	public ArrayList<AlumnesModFaltes> llistatAlModFal() {
		//trucada al calcul de faltes
		ArrayList<AlumnesModFaltes> a = new ArrayList<>();
		a.add(new AlumnesModFaltes("David", "Rosal", "M01", "17%"));
		a.add(new AlumnesModFaltes("Marco", "Laureano", "M02", "15%"));
		a.add(new AlumnesModFaltes("Marco", "Laureano", "M10", "20%"));
		a.add(new AlumnesModFaltes("Pau", "Chacon", "M13", "24%"));
		return a;
	}

	@GetMapping("/grup/modul/faltes")
	public ArrayList<AlumnesGrupModFaltes> llistatAlGrupModFal() {
		//trucada al calcul de faltes
		ArrayList<AlumnesGrupModFaltes> a = new ArrayList<>();
		//si grup o modul no valid error controlat
		a.add(new AlumnesGrupModFaltes("David", "Rosal", "DAM", "M01", "17%"));
		a.add(new AlumnesGrupModFaltes("Marco", "Laureano", "DAW", "M02", "15%"));
		a.add(new AlumnesGrupModFaltes("Marco", "Laureano", "ASIX", "M10", "20%"));
		a.add(new AlumnesGrupModFaltes("Pau", "Chacon", "DAM", "M13", "24%"));
		return a;

	}

	@GetMapping("{id}")
	public Alumnes llistatAlumnesId(@PathVariable Long id) {
		if (alumnRep.findById(id).isPresent()) {

			return alumnRep.findById(id).get();
		} else {
			return null;
		}
	}

	@GetMapping("/grup/{grup}")
	public Iterable<Alumnes> alumnesgrup(@PathVariable String grup) {
		List<Alumnes> llistatAlumnes = llistatAlumnes();
		long id;
		List<Long> i = new ArrayList<>();
		int j = 0;
		for (Alumnes a : llistatAlumnes) {
			if ((a.getCicle() + a.getCurs()).equals(grup)) {
				id = a.getId();
				if (alumnRep.findById(id).isPresent()) {
					i.add(a.getId());
					j++;
				}
			}
		}
		return alumnRep.findAllById(i);
	}

}
