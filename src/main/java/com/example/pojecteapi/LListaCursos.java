package com.example.pojecteapi;

public class LListaCursos {
	String cicle;
	String grup;
	String curs;
	String aula;
	
	
	public LListaCursos(String cicle, String grup, String curs, String aula){
		this.cicle = cicle;
		this.grup = grup;
		this.curs = curs;
		this.aula = aula;
	}


	public String getCicle() {
		return cicle;
	}


	public void setCicle(String cicle) {
		this.cicle = cicle;
	}


	public String getGrup() {
		return grup;
	}


	public void setGrup(String grup) {
		this.grup = grup;
	}


	public String getCurs() {
		return curs;
	}


	public void setCurs(String curs) {
		this.curs = curs;
	}


	public String getAula() {
		return aula;
	}


	public void setAula(String aula) {
		this.aula = aula;
	}
	
	
	
}
