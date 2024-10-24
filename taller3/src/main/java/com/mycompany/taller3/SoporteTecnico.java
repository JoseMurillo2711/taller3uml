/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.Incidente;
import com.mycompany.taller3.Administrador;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class SoporteTecnico extends Usuario{
    
    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes){
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
    public void brindarAsistencia(Usuario usuario){
    //metodo
    }
    public void resolverProblemaTecnico(Usuario usuario){
    //metodo
    }
    public void derivarProblemaDeGestion(Administrador administrador){
    //metodo
    }
}
