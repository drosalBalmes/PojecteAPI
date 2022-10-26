package com.example.pojecteapi.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.example.pojecteapi.HorariGrup;
import com.example.pojecteapi.IdentificaAlumne;

import org.springframework.web.bind.annotation.GetMapping;

public class HorariController {
	   @GetMapping("/horari/grup")
	    public ArrayList<HorariGrup> horarigrup(){
	    	ArrayList<HorariGrup> hora = new ArrayList<>();
	    	hora.add(new HorariGrup(LocalDate.now(), "DAM"));
	    	hora.add(new HorariGrup(LocalDate.now(), "DAW"));
	    	hora.add(new HorariGrup(LocalDate.now(), "DAM"));
	    	hora.add(new HorariGrup(LocalDate.now(), "DAW"));
	    	return hora;
	    }
	   @GetMapping("/horari/assistencia")
	   public ArrayList<IdentificaAlumne> horariassistencia(){
	    	ArrayList<IdentificaAlumne> dies = new ArrayList<>();
	    	dies.add(new IdentificaAlumne("46A", LocalTime.now(), LocalTime.now(), LocalDate.now()));
	    	dies.add(new IdentificaAlumne("23B", LocalTime.now(), LocalTime.now(), LocalDate.now()));
	    	dies.add(new IdentificaAlumne("12C", LocalTime.now(), LocalTime.now(), LocalDate.now()));
	    	dies.add(new IdentificaAlumne("33B", LocalTime.now(), LocalTime.now(), LocalDate.now()));
	    	
	    	return dies;
	    }
}
