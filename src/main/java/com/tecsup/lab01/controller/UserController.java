package com.tecsup.lab01.controller;
import com.tecsup.lab01.view.*;
import com.tecsup.lab01.model.*;

public class UserController {
    
    public String datos(String nom, String ape, String eda){
        User u = new User(nom, ape, eda);
    	String data="El nombre es "+u.nombre+" "+u.apellido+" con edad de "+u.edad+" años";
    	return data;
    }
}
