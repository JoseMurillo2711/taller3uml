/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.ActividadSumativa;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Curso {
    
    
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private Profesor responsable;
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesSumativas;

    public Curso(List<Estudiante> estudiantesInscritos, List<Estudiante> estudiantesEnEsperaDeInscripcion, Profesor responsable, String id, String nombre, boolean estadoDisponible, List<Foro> foros, List<ActividadSumativa> actividadesSumativas) {
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.responsable = responsable;
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = foros;
        this.actividadesSumativas = actividadesSumativas;
    }
    
    
}
