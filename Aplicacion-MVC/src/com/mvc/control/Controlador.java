/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.control;

import com.mvc.modelo.Cliente;
import javax.swing.JTable;

/**
 *
 * @author FABAME
 */
public interface Controlador {

    public void registrar(Object objeto);

    public Cliente consultar(String identificacion);

    public void listar(JTable tabla);

    public void modificar(Object objeto);

    public void eliminar(String identificacion);

}
