/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.Curso;
import com.mycompany.taller3.ActividadSumativa;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Estudiante extends PersonalAcademico {
    
    public List<Curso> cursos;

    public Estudiante(List<Curso> cursos, String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
        this.cursos = cursos;
    }
    
    
    public void solicitarInscripcionCurso(Curso curso){
    //metodo
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    //metodo
    }
            
}
