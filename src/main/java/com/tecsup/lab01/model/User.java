package com.tecsup.lab01.model;
import com.tecsup.lab01.controller.*;
import com.tecsup.lab01.view.*;

public class User {
	public String nombre;
	public String apellido;
	public String edad;
	
        public User (String nombre, String apellido, String edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        } 
}
