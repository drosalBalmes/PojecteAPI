package com.example.pojecteapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class IdentificaAlumne {

	String aula;
	LocalTime entrada, sortida;
	LocalDate dia;
	
	
	
	public IdentificaAlumne(String aula, LocalTime entrada, LocalTime sortida, LocalDate dia) {
		this.aula = aula;
		this.entrada = entrada;
		this.sortida = sortida;
		this.dia = dia;
	}
	
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public LocalTime getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}
	public LocalTime getSortida() {
		return sortida;
	}
	public void setSortida(LocalTime sortida) {
		this.sortida = sortida;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "IdentificaAlumne [aula=" + aula + ", entrada=" + entrada + ", sortida=" + sortida + ", dia=" + dia
				+ "]";
	}
	
	
	
	
}
