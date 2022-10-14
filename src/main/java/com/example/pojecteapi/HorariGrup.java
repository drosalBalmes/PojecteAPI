package com.example.pojecteapi;

import java.time.LocalDate;

public class HorariGrup{
	
	String grup;
    LocalDate horari;

    public HorariGrup(LocalDate horari, String grup) {
    	this.horari = horari;
    	this.grup = grup;
    }
    
    public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}

	public LocalDate getHorari() {
		return horari;
	}

	public void setHorari(LocalDate horari) {
		this.horari = horari;
	}
}
