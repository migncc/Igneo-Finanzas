/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_IF;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class ModeloIgneoFinanzas {

    // Lista para almacenar objetos Usuario
    private ArrayList<Usuario> listaUsuarios;
    private final String archivoUsuarios = "usuarios.txt"; // Archivo para guardar usuarios
/**
 * Construcotr del modelo
 */
    public ModeloIgneoFinanzas() {
        listaUsuarios = new ArrayList<>();
        cargarUsuarios();
    }

    /**
     *Obtener la lista de usaurios
     * @return  la lsiat de usuarios 
     */
    public ArrayList<Usuario> getUsuarios() {
        return listaUsuarios;
    }

    /**
     * Agrega el usuario a la lista
     * @param nombre nombre de usuario
     */
    public void agregarUsuario(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            listaUsuarios.add(new Usuario(nombre.trim()));
             guardarUsuarios();
        }
    }

    /**
     * Borra el usuario
     * @param nombre del usuario a borrar metodos creados apra el futuro
     */
    public void eliminarUsuario(String nombre) {
        listaUsuarios.removeIf(usuario -> usuario.getNombre().equalsIgnoreCase(nombre));
        guardarUsuarios(); 
    }
    /**
     * metodo que guarda el usuario en el archivo de texto para su persistencia
     */
    private void guardarUsuarios() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios))) {
            for (Usuario usuario : listaUsuarios) {
                bw.write(usuario.getNombre());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios: " + e.getMessage());
        }
    }
    /**
     * Metodo que craga el contenido del archivo en nuestro modelo
     */
     private void cargarUsuarios() {
        File archivo = new File(archivoUsuarios);
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
                String nombre;
                while ((nombre = br.readLine()) != null) {
                    listaUsuarios.add(new Usuario(nombre));
                }
                br.close();
            } catch (IOException e) {
                System.err.println("Error al cargar usuarios: " + e.getMessage());
            }
        }
    }
}
