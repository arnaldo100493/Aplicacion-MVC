/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.control;

import com.mvc.modelo.Cliente;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FABAME
 */
public class ControlCliente implements Controlador, Serializable {

    private static List<Cliente> listadoClientes;

    public ControlCliente() {

    }

    private void inicializar() {
        try {
            listadoClientes = ControlArchivo.leerArchivo("Clientes");
            if (listadoClientes == null) {
                listadoClientes = new LinkedList<>();
            }
        } catch (ClassNotFoundException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void registrar(Object objeto) {
        try {
            if (objeto instanceof Cliente) {
                this.inicializar();
                Cliente cliente = (Cliente) objeto;
                if (!this.existe(cliente.getIdentificacion())) {
                    listadoClientes.add(cliente);
                    ControlArchivo.guardarArchivo(listadoClientes, "Clientes");
                    JOptionPane.showMessageDialog(null, "Cliente registrado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Este cliente ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Cliente buscar(String identificacion) {
        this.inicializar();
        String id = (String) identificacion;
        Cliente cliente = null;
        for (Cliente c : listadoClientes) {
            if (c.getIdentificacion().equals(id)) {
                cliente = c;
            }
        }
        return cliente;
    }

    private boolean existe(String identificacion) {
        this.inicializar();
        boolean estado = false;
        Cliente cliente = this.buscar(identificacion);
        if (cliente != null) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                estado = true;
            }
        }
        return estado;
    }

    @Override
    public Cliente consultar(String identificacion) {
        Cliente cliente = null;
        try {
            this.inicializar();
            cliente = this.buscar(identificacion);
            for (int i = 0; i < listadoClientes.size(); i++) {
                if (listadoClientes.get(i).getIdentificacion().equals(identificacion) && cliente != null) {
                    cliente = listadoClientes.get(i);
                } else {
                    JOptionPane.showMessageDialog(null, "Este cliente no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cliente;
    }

    @Override
    public void listar(JTable tabla) {
        try {
            this.inicializar();
            ((DefaultTableModel) tabla.getModel()).setNumRows(0);
            for (Cliente cliente : listadoClientes) {
                ((DefaultTableModel) tabla.getModel()).addRow(new Object[]{cliente.getIdentificacion(), cliente.getNombre(), cliente.getApellido()});
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void modificar(Object objeto) {
        try {
            if (objeto instanceof Cliente) {
                this.inicializar();
                Cliente cliente = (Cliente) objeto;
                for (int i = 0; i < listadoClientes.size(); i++) {
                    if (listadoClientes.get(i).getIdentificacion().equals(cliente.getIdentificacion())) {
                        listadoClientes.remove(i);
                        listadoClientes.add(cliente);
                        ControlArchivo.guardarArchivo(listadoClientes, "Clientes");
                        JOptionPane.showMessageDialog(null, "Cliente modificado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este cliente no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void eliminar(String identificacion) {
        try {
            this.inicializar();
            Cliente cliente = this.buscar(identificacion);
            for (int i = 0; i < listadoClientes.size(); i++) {
                if (this.listadoClientes.get(i).getIdentificacion().equals(identificacion) && cliente != null) {
                    int opcion = JOptionPane.showOptionDialog(null, "¿Esta¡ seguro que desea eliminar este cliente llamado " + cliente.getNombre() + " " + cliente.getApellido() + " ? ", "Confirmar EliminaciÃ³n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, "SI");
                    if (opcion != -1) {
                        if ((opcion + 1) == 1) {
                            listadoClientes.remove(cliente);
                            ControlArchivo.guardarArchivo(listadoClientes, "Clientes");
                            JOptionPane.showMessageDialog(null, "Cliente eliminado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este cliente no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    private static void setListadoClientes(List<Cliente> listado) {
        listadoClientes = listado;
    }

}
