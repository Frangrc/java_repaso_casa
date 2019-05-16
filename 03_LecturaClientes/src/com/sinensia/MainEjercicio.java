/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import static com.sinensia.ParseoLineaCliente.parsearCliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        // TODO code application logic here
    
        //Convertimos el .txt en en variable tipo File
        File fichRutaRelativa = new File("../Ejercicio_ficheros.txt");
        
        //Iniciaalizamos el Scanner con el que leeremos el archivo File
        Scanner escaner = null;
        
        //Creamos el HashMap para ir guardando lo que leamos en el File
        HashMap<Long, Cliente> mapaDat = new HashMap<>();
        try {
            System.out.println("Leyendo fichero");
            
            //Convertimos el archivo File a Scanner
            escaner = new Scanner(fichRutaRelativa);
            while (escaner.hasNextLine()) { // Hasta el siguiente \n
                //Convertimos cada linea en variable String
                String linea = escaner.nextLine();
                //Sacamos cada linea por pantalla
                System.out.println(">>>> \"" + linea + "\"");
                try {
                    //Le pasamos cada linea a parsearCliente y obtenemos la
                    //variable cliente
                    Cliente cliente = parsearCliente(linea);
                    //Introduciomos cada cliente al hashmap(acceso por clave id)
                    mapaDat.put(cliente.getId(), cliente);
                } catch (Exception ex) {
                    System.err.println("Error en parseo: " + ex.getMessage());
                }
            }
            //Recorremos el HashMap y vamos sacando el valor
            for (Map.Entry<Long, Cliente> ent : mapaDat.entrySet()) {
                System.out.println("Cli: " + ent.getValue().toString());
            }
        } catch (Exception ex) {
            System.err.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    //Cerramos el escaner
                    escaner.close();
                }
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        }
    
    
    }
    
    
}
