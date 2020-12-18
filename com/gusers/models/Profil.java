package com.gusers.models;

public class Profil {
    private int id;
    private String code;
    private String libelle;


    public Profil(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    
    public Profil(){

    }


    @Override
    public String toString() {
        return "{" +
            "Profile: id='" + id + "'" +
            ", code='" + code + "'" +
            ", libelle='" + libelle + "'" +
            "}\n";
    }
  
}
