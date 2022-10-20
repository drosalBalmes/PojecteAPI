package com.example.pojecteapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cursos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cicle;
	private String grup;
	private String curs;
	private String aula;

	public Cursos(){

	}
	
	public Cursos(String cicle, String grup, String curs, String aula){
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

	@Override
	public String toString() {
		return "Cursos{" +
				"id=" + id +
				", cicle='" + cicle + '\'' +
				", grup='" + grup + '\'' +
				", curs='" + curs + '\'' +
				", aula='" + aula + '\'' +
				'}';
	}
}
