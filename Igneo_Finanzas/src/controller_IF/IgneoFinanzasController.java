/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_IF;

import model_IF.CuentaIgenoFinanzas;
import view_IF.VistaInicialgneoFinanzas;

/**
 *
 * @author ignac
 */
public class IgneoFinanzasController {
    private VistaInicialgneoFinanzas view; // Atributo para la vista
    private CuentaIgenoFinanzas cuenta;  // Atributo para la cuenta

    public IgneoFinanzasController(VistaInicialgneoFinanzas view) {
        this.view = view;
        this.cuenta = new CuentaIgenoFinanzas(); // Inicializa la cuenta
    }

}
