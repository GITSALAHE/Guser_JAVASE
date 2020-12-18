package com.gusers.app;
import com.gusers.controllers.ProfileController;
import com.gusers.controllers.UserController;
public class Main {
    
    
   
    public static void main(String[] args) {

        ProfileController profile = new ProfileController();
        profile.addProfile();
        UserController user = new UserController();
        user.affiche();
        }


        
    }

