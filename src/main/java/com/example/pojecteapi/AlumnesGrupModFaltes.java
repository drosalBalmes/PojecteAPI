package com.example.pojecteapi;

public class AlumnesGrupModFaltes {
    private String nom;
    private String cognom;
    private String grup;
    private String modul;
    private String faltesPercent;

    public AlumnesGrupModFaltes(String nom, String cognom, String grup, String modul, String faltesPercent) {
        this.nom = nom;
        this.cognom = cognom;
        this.grup = grup;
        this.modul = modul;
        this.faltesPercent = faltesPercent;
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

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public String getFaltesPercent() {
        return faltesPercent;
    }

    public void setFaltesPercent(String faltesPercent) {
        this.faltesPercent = faltesPercent;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }
}
