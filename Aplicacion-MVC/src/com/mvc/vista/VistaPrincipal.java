/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.vista;

/**
 *
 * @author FABAME
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(3);
    }

    private void registrar() {
        RegistrarCliente rc = new RegistrarCliente();
        rc.setVisible(true);
        this.dispose();
    }

    private void consultar() {
        ConsultarCliente cc = new ConsultarCliente();
        cc.setVisible(true);
        this.dispose();
    }

    private void modificar() {

    }

    private void eliminar() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        toolBarMenuOpciones = new javax.swing.JToolBar();
        buttonRegistrar = new javax.swing.JButton();
        buttonConsultar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBarMenuOpciones.setRollover(true);

        buttonRegistrar.setText("Registrar");
        buttonRegistrar.setFocusable(false);
        buttonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        toolBarMenuOpciones.add(buttonRegistrar);

        buttonConsultar.setText("Consultar");
        buttonConsultar.setFocusable(false);
        buttonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });
        toolBarMenuOpciones.add(buttonConsultar);

        buttonModificar.setText("Modificar");
        buttonModificar.setFocusable(false);
        buttonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenuOpciones.add(buttonModificar);

        buttonEliminar.setText("Eliminar");
        buttonEliminar.setFocusable(false);
        buttonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenuOpciones.add(buttonEliminar);

        buttonSalir.setText("Salir");
        buttonSalir.setFocusable(false);
        buttonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarMenuOpciones.add(buttonSalir);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarMenuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(toolBarMenuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 275, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        this.registrar();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        this.consultar();
    }//GEN-LAST:event_buttonConsultarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JToolBar toolBarMenuOpciones;
    // End of variables declaration//GEN-END:variables
}
