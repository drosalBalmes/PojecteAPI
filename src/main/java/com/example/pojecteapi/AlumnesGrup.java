package com.example.pojecteapi;

public class AlumnesGrup {
		String nom;
		String cognom;
		String grup;
		
    public AlumnesGrup(String nom, String cognom, String grup) {
        this.nom = nom;
        this.cognom = cognom;
    	this.grup = grup;
        
    }
    
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getCognom() {
		return cognom;
	}



	public void setCognom(String cognom) {
		this.cognom = cognom;
	}



	public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}
    
    


}
