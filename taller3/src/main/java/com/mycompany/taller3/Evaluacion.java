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
public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;

    public Evaluacion(String titulo, Date fechaDeEntrega, String contenido, float calificacion, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }
    
    
}
