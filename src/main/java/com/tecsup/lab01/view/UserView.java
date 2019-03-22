package com.tecsup.lab01.view;
import com.tecsup.lab01.model.*;
import com.tecsup.lab01.controller.*;
import javax.swing.JOptionPane;

public class UserView {
	
    public static void main(String[] args) {
    	
        UserController uc=new UserController();

        String nombre,paterno,edad;

        nombre =JOptionPane.showInputDialog("Ingrese su nombre: ");
        paterno= JOptionPane.showInputDialog("Ingrese su apellido: ");
        edad= JOptionPane.showInputDialog("Ingrese su edad: ");
        
        System.out.println(uc.datos(nombre, paterno, edad));
    }


}


	



