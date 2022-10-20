package com.example.pojecteapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumnes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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

    public Alumnes(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Alumnes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", email='" + email + '\'' +
                ", cicle='" + cicle + '\'' +
                ", curs=" + curs +
                ", grup='" + grup + '\'' +
                '}';
    }
}
