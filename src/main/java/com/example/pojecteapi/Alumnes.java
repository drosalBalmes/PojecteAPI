package com.example.pojecteapi;

public class Alumnes {
    private String nom;
    private String cognoms;
    private String email;
    private String cicle;
    private int curs;
    private String grup;

    public Alumnes(String nom, String cognoms, String email, String cicle, int curs) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
        this.cicle = cicle;
        this.curs = curs;
        this.grup = cicle + curs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }
}
