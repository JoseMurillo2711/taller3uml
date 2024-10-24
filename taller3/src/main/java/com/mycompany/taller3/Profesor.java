/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.PersonalAcademico;
import com.mycompany.taller3.Incidente;
import com.mycompany.taller3.Foro;
import com.mycompany.taller3.Estudiante;
import com.mycompany.taller3.Curso;
import com.mycompany.taller3.ActividadSumativa;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Profesor extends PersonalAcademico{
    
    public List<Curso> cursosAcargo;

    public Profesor(List<Curso> cursosAcargo, String usuario, String contrasena, String nombre, String apellido, List<Incidente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
        this.cursosAcargo = cursosAcargo;
    }
    
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    //metodo
    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
    //metodo
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
    //metodo
    }
    public void crearNuevoForo(Foro foro){
    //metodo
    }
    
}
