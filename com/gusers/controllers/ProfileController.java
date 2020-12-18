package com.gusers.controllers;
import com.gusers.models.Profil;
import java.util.ArrayList;
public class ProfileController {
    public ProfileController(){

    }
    ArrayList<Profil> profileList = new ArrayList<Profil>();
  
    public void addProfile() {
        String[] code = {"Chef de projet", "Manager", "Directeur de projet", "Directeur des ressources humaines", "Directeur général"};
        String[] libele = {"CP", "MN", "DP", "DRH", "DG"};
        int id;
        for(int i = 0;i < code.length;i++) {
			id = profileList.size() + 1;
			Profil profilProfil = new Profil();
			profilProfil.setId(id);
			profilProfil.setCode(code[i]);
			profilProfil.setLibelle(libele[i]);
			profileList.add(profilProfil);
		}		
    }
}
