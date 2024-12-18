/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view_IF;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;

/**
 *
 * @author ignac
 */
public class VistaInicialgneoFinanzas extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public VistaInicialgneoFinanzas() {
        initComponents();
        setLocationRelativeTo(null); // Centrar en pantalla
        panelDerecho.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelDerecho.add(Box.createRigidArea(new Dimension(0, 10)));
// Padding: top, left, bottom, right

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqIdea = new javax.swing.JLabel();
        panelDerecho = new javax.swing.JPanel();
        btnCrearSubcuenta = new javax.swing.JButton();
        btnEliminarSubcuenta = new javax.swing.JButton();
        panelizq = new javax.swing.JPanel();
        btnConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etqIdea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_IF/Imagen menu principal.png"))); // NOI18N
        getContentPane().add(etqIdea, java.awt.BorderLayout.CENTER);

        panelDerecho.setLayout(new javax.swing.BoxLayout(panelDerecho, javax.swing.BoxLayout.Y_AXIS));

        btnCrearSubcuenta.setText("Crear Subcuenta");
        panelDerecho.add(btnCrearSubcuenta);

        btnEliminarSubcuenta.setText("Eliminar Subcuenta");
        btnEliminarSubcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSubcuentaActionPerformed(evt);
            }
        });
        panelDerecho.add(btnEliminarSubcuenta);

        getContentPane().add(panelDerecho, java.awt.BorderLayout.LINE_END);

        panelizq.setLayout(new javax.swing.BoxLayout(panelizq, javax.swing.BoxLayout.LINE_AXIS));

        btnConfiguracion.setText("Configuracion");
        panelizq.add(btnConfiguracion);

        getContentPane().add(panelizq, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarSubcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSubcuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSubcuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnCrearSubcuenta;
    private javax.swing.JButton btnEliminarSubcuenta;
    private javax.swing.JLabel etqIdea;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelizq;
    // End of variables declaration//GEN-END:variables

//mis variables y metodos: 
    public JButton getBtnCrearSubcuenta() {
        return btnCrearSubcuenta;
    }

    public JButton getBtnEliminarSubcuenta() {
        return btnEliminarSubcuenta;
    }

    public JButton getBtnConfiguracion() {
        return btnConfiguracion;
    }

}
