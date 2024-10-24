/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    private Usuario responsable;
    protected PersonalAcademico beneficiario;

    public Incidente(int id, Date fecha_reportado, String estado, String titulo, String descripcion, List<String> log_actualizaciones, Date fecha_cerrado, String tipo, Usuario responsable, PersonalAcademico beneficiario) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.responsable = responsable;
        this.beneficiario = beneficiario;
    }
    
    
}
