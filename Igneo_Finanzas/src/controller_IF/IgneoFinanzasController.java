/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_IF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model_IF.ModeloIgneoFinanzas;
import view_IF.DialogoConfiguracion;
import view_IF.VentanaPresentacion;
import view_IF.VistaInicialgneoFinanzas;

/**
 *
 * @author ignac
 */
public class IgneoFinanzasController {

    private VistaInicialgneoFinanzas viewIF; // Atributo para la vista
    private ModeloIgneoFinanzas modeloIF;  // Atributo para la cuenta

    public IgneoFinanzasController(VistaInicialgneoFinanzas viewIF, ModeloIgneoFinanzas modeloIF) {
        this.viewIF = viewIF;
        this.modeloIF = modeloIF;
        initControladorIF(); //metodo que iniciaria
    }

    private void initControladorIF() {
        viewIF.setVisible(true); // de momento iniciar la pantalla mainframe
        agregarListeners(); // Añadir los ActionListeners
    }

    private void agregarListeners() {
        viewIF.getBtnCrearSubcuenta().addActionListener(e -> {
            System.out.println("Botón Crear Subcuenta presionado");
        });

        viewIF.getBtnEliminarSubcuenta().addActionListener(e -> {
            System.out.println("Botón Eliminar Subcuenta presionado");
        });

        viewIF.getBtnConfiguracion().addActionListener(e -> {
            System.out.println("Botón Configuración presionado");
            DialogoConfiguracion dialogo = new DialogoConfiguracion(viewIF, true, modeloIF);
            dialogo.setVisible(true); // Mostrar el JDialog
        });
    }
}
