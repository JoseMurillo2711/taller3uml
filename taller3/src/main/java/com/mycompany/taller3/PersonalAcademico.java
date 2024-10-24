/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.Incidente;
import com.mycompany.taller3.Foro;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class PersonalAcademico extends Usuario {
    
    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes){
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
    
    public void reportarError(String email, String contenido){
    //metodo
    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
    //metodo
    }
    public void comentarEnForo(Foro foro, String comentario){
    //metodo
    }
}
