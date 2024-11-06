/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_IF;

import model_IF.Cuenta;
import view_IF.MainFrame;

/**
 *
 * @author ignac
 */
public class GestorFinanzasController {
    private MainFrame view; // Atributo para la vista
    private Cuenta cuenta;  // Atributo para la cuenta

    public GestorFinanzasController(MainFrame view) {
        this.view = view;
        this.cuenta = new Cuenta(); // Inicializa la cuenta
    }

}
