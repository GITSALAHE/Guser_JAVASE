package com.gusers.models;

public class Person {
    private String matricule;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
    private double salaire;
    
    public Person(){

    }

    public Person(String matricule, String nom, String prenom, String email, String telephone, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }
   
    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return 
            " matricule='" + matricule + "'" +
            "\n nom='" + nom + "'" +
            "\n prenom='" + prenom + "'" +
            "\n email='" + email + "'" +
            "\n telephone='" + telephone + "'" +
            "\n salaire='" + salaire + "'\n" 
            ;
    }

}
