package com.example.pojecteapi;

import java.time.LocalDate;
import java.util.ArrayList;

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
}
