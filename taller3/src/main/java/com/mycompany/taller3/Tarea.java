/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.ActividadSumativa;
import java.util.Date;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Tarea extends ActividadSumativa{
    
    private Date fechaDePublicacion;

    public Tarea(String titulo, Date fechaDeEntrega, String contenido, float calificacion, String id, Date fechaDePublicacion) {
        super(titulo, fechaDeEntrega, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
    

}
