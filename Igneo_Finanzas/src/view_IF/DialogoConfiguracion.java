/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_IF;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model_IF.ModeloIgneoFinanzas;
import model_IF.Usuario;

/**
 * Decido crear una clase para el JDialog en vez de un JfRame ya que no he
 * sabido relizarlo con JFrame
 *
 * @author ignac
 */
public class DialogoConfiguracion extends JDialog {

    private ModeloIgneoFinanzas modelo;

    /**
     * Constructor para el JDialog
     *
     * @param parent JFrame del que hereda
     * @param estado True para bloquear las accioens con su parent ahsta que se
     * cierre
     */
    public DialogoConfiguracion(JFrame parent, boolean estado, ModeloIgneoFinanzas modelo) {
        super(parent, "Configuración del Sistema", estado);
        this.modelo = modelo;
        initDialogo();
    }

    /**
     * Metodo que inicia todos los componnetes del Jdialog
     */
    private void initDialogo() {
        // Configuración del JDialog
        setSize(300, 200);
        setLocationRelativeTo(null); // Centrar el diálogo
        setResizable(false); // No redimensionable

        // Layout
        setLayout(new BorderLayout());

        // Componentes
        JLabel titulo = new JLabel("Configuración del Sistema", JLabel.CENTER);
        JButton btnLookAndFeel = new JButton("Cambiar Look");
        JButton btnUsuarios = new JButton("Gestionar Usuarios");

        // Panel con botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 1, 10, 10)); // Espaciado entre botones
        panelBotones.add(btnLookAndFeel);
        panelBotones.add(btnUsuarios);

        // Añadir componentes
        add(titulo, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);

        // Acción al cerrar
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        btnLookAndFeel.addActionListener(e -> cambiarLookAndFeel());
        btnUsuarios.addActionListener(e -> gestionarUsuarios());

    }

    /**
     * Metodo para cambair el look, como ves necesita un ajuste :(
     */
    private void cambiarLookAndFeel() {
        try {
            if (!UIManager.getLookAndFeel().equals("javax.swing.plaf.nimbus.NimbusLookAndFeel")) {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(getParent()); // Actualizar
                JOptionPane.showMessageDialog(this, "Look cambiado con éxito a Nimbus");
            } else {
                UIManager.setLookAndFeel("javax.swing.plaf.Metal.MetalLookAndFeel");
                SwingUtilities.updateComponentTreeUI(getParent()); // Actualizar
                JOptionPane.showMessageDialog(this, "Look cambiado con éxito a Metal");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cambiar el Look & Feel");
        }
    }

    private void gestionarUsuarios() {
        int opcion = JOptionPane.showOptionDialog(
                this,
                "¿Qué desea hacer?",
                "Gestión de Usuarios",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Ver Usuarios", "Agregar Usuario"},
                "Ver Usuarios"
        );

        if (opcion == 0) { // Ver Usuarios
            mostrarUsuarios();
        } else if (opcion == 1) { // Agregar Usuario
            agregarUsuario();
        }
    }

    private void mostrarUsuarios() {
        ArrayList<Usuario> usuarios = modelo.getUsuarios();
        StringBuilder lista = new StringBuilder("Usuarios del Sistema:\n");
        for (Usuario usuario : usuarios) {
            lista.append(usuario.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(this, lista.toString(), "Usuarios", JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarUsuario() {
        String nuevoUsuario = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo usuario:");
        if (nuevoUsuario != null && !nuevoUsuario.trim().isEmpty()) {
            modelo.agregarUsuario(nuevoUsuario.trim());
            JOptionPane.showMessageDialog(this, "Usuario agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
        }
    }

}
