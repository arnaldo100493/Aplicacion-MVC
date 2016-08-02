/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.modelo;

import java.io.Serializable;

/**
 *
 * @author FABAME
 */
public class Cliente implements Serializable {

    private String identificacion;
    private String nombre;
    private String apellido;

    public Cliente() {
        this.identificacion = "";
        this.nombre = "";
        this.apellido = "";
    }

    public Cliente(String identificacion, String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(Cliente cliente) {
        this.identificacion = cliente.getIdentificacion();
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
