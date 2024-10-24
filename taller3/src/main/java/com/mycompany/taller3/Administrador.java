/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Administrador extends Usuario { //completar segun diagrama
    
    
    public Administrador(String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes){
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
    public void crearUsarioConRol(String usuario, String contrasena){
    //
    }
    
    public void asignarPermiso(String usuario){
    
    //metodo
    }
    public void actualizarSoftware(){
    //metodo
    }
    public void asignarResponsable(Curso curso, Profesor responsable){
    //metodo
    }
}
