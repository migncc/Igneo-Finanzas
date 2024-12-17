/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igneo_finanzas;

import controller_IF.IgneoFinanzasController;
import model_IF.ModeloIgneoFinanzas;
import view_IF.VentanaPresentacion;
import view_IF.VistaInicialgneoFinanzas;

/**
 *
 * @author ignac
 */
public class IgneoFinanzasMain {

    public static void main(String[] args) {
        ModeloIgneoFinanzas modeloIF = new ModeloIgneoFinanzas();
        VistaInicialgneoFinanzas vistaIF = new VistaInicialgneoFinanzas();
        VentanaPresentacion ventanaPresentacionIF = new VentanaPresentacion();
        ventanaPresentacionIF.setVisible(true);
        System.out.println("iniciando programa...");
        System.out.println("App iniciada");

    }
}
