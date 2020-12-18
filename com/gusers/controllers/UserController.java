package com.gusers.controllers;

import com.gusers.models.Users;
import java.util.ArrayList;

public class UserController {
    ArrayList<Users> profileList = new ArrayList<Users>();

    public UserController() {

    }

    public int calculerSalaire(int salaire, String profil) {
        if (profil == "MN") {
            salaire += (salaire * 8) / 100;
        } else if (profil == "DG") {
            salaire += (salaire * 15) / 100;
        }
        return salaire;
    }

    public void affiche() {
        String[] matricule = { "yc11", "yc111", "yc112", "yc113" };
        String[] prenom = { "SALAHEDDINE", "HAMZA", "SAMI", "BRAHIM" };
        String[] nom = { "BOUANBA", "JILALI", "BEKAOUI", "MAGHFOR" };
        String[] email = { "salahbouanba@gmail.com", "hamza@gmail.com", "sami@gmail.com", "brahim@gmail.com" };
        String[] telephone = { "0646274243", "0647762712", "0661829212", "0697863721" };
        String[] services = { "MN", "DP", "testemploi", "DG" };
        int[] salaire = { 2000, 3000, 4000, 5000 };
        String[] login = { "salahlogin", "hamzalogin", "samilogin", "brahimlogin" };
        String[] motDePasse = { "passwordSalah", "passwordHamza", "passwordSami", "passwordBrahim" };
        for (int i = 0; i < matricule.length; i++) {
            Users user = new Users();
            user.setMatricule(matricule[i]);
            user.setPrenom(prenom[i]);
            user.setNom(nom[i]);
            user.setEmail(email[i]);
            user.setTelephone(telephone[i]);
            user.setService(services[i]);
            user.setSalaire(calculerSalaire(salaire[i], services[i])); 
            user.setLogin(login[i]);
            user.setMotDePass(motDePasse[i]);
            profileList.add(user);
        }
        System.out.println(profileList);
    }
}
