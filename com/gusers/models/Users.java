package com.gusers.models;

public class Users extends Person{
    private String profil;
    private String motDePass;
    private String service;
    private String login;
    
    public Users(){

    }
    public Users(String matricule, String nom, String prenom, String email, String telephone, double salaire, String motDePass, String service, String login) {
        super(matricule, nom, prenom, email, telephone, salaire);
        this.motDePass = motDePass;
        this.service = service;
        this.login = login;
    }
   


    public String getMotDePass() {
        return this.motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "\n{" +super.toString()+
            "\n motDePass='" + motDePass + "'" +
            "\n service='" + service + "'" +
            "\n login='" + login + "'" +
            "}\n";
    }

}
