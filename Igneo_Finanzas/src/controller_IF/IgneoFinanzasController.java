/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_IF;


import model_IF.ModeloIgneoFinanzas;
import view_IF.VistaInicialgneoFinanzas;

/**
 *
 * @author ignac
 */
public class IgneoFinanzasController {
    private VistaInicialgneoFinanzas viewIF; // Atributo para la vista
    private ModeloIgneoFinanzas modeloIF;  // Atributo para la cuenta

    public IgneoFinanzasController(VistaInicialgneoFinanzas viewIF, ModeloIgneoFinanzas modeloIF ) {
        this.viewIF = viewIF;
        this.modeloIF = modeloIF;
        initControladorIF(); //metodo que iniciaria
    }
 private void initControladorIF(){
     viewIF.setVisible(true); // de momento iniciar la pantalla mainframe
 }
    
}
