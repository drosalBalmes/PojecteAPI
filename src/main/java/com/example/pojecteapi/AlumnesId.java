package com.example.pojecteapi;

public class AlumnesId {
    private String nom;
    private String cognom;
    private String id;

    public AlumnesId(String nom, String cognom, String id) {
        this.nom = nom;
        this.cognom = cognom;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
