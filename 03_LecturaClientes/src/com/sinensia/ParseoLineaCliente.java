/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import static com.sinensia.pruebas.Polimorfismo.clientes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin - Paco
 */
public class ParseoLineaCliente {
/*Le pasaremos como argumento las lineas en formato String que vayamos leyendo
  d         el fichero y las convertiremos al formato Cliente*/
    static Cliente parsearCliente(String linea) {
        //Dividimos cada linea en sus respectivos campos usando como referencia
        //las comas que los separan y la metemos en un array de String
        String campos[] = linea.split(",");
        //Inicializamos variable cliente
        Cliente cliente = null;
        //Si la longitud del array es de 4 o 5 (4 o 5 campos)
        if (campos.length == 4 || campos.length == 5) { 
            //Convertimos el campo [0] en entero y se lo pasamos al atributo id
            long id = Integer.parseInt(campos[0]);
            String nombre = campos[1];      String email = campos[2];
            //Convertimos el campo[3] en tipo booleano
            boolean activo = campos[3].equals("true") ? true : false;
            int duracionMax = 0;
            if (campos.length == 5) {
            /*Si detectamos que hay un quinto campo, que será el de la duración
            máxima para clientes invitados*/
                //Convertimos el campo en entero
                duracionMax = Integer.parseInt(campos[4]);
                /*Creamos objeto cliente de tipo ClienteInvitado haciendo casting,
                y le asignamos el atributo de duración máxima que hemos leido*/
                //Sólo id, nombre y email están en el constructor
                cliente = new ClienteInvitado(id, nombre, email);
                ((ClienteInvitado) cliente).setDuracionMax(duracionMax);
            } else {//Sino será tipo Cliente, creamos objeto cliente de tipo Cliente
                    // y le pasamos los atributos que hemos leido
                cliente = new Cliente(id, nombre, email);
            }
            //Le asignamos el atributo activo
            cliente.setActivo(activo);
        }
        return cliente;
    }
    
}
