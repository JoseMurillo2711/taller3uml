/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected String contenido;
    protected float calificacion;
    protected String id;
    
    public ActividadSumativa(String titulo, Date fechaDeEntrega, String contenido, float calificacion, String id){
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.contenido =contenido;
        this.calificacion = calificacion;
        this.id = id;
    
    }
}
