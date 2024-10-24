/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.Incidente;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Usuario {
    
    
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected List<Incidente> incidentes;
    
    public Usuario(String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = incidentes;
        
    }
    
    protected boolean logIn(){
    //metodo
    }
    
    protected boolean logOut(){
    //metodo
    }

}
