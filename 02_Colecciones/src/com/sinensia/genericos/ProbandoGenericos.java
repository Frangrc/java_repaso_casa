/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin - Paco
 */
public class ProbandoGenericos {

public static void probarMetodo(){

    int num=10;
    Integer objNum= new Integer(10); //Objeto que hace referencia a una pos.memoria
    num=11;
    String texto = "" + String.valueOf(num);
    String texto2 = "" + objNum.toString();       
    //Convertimos tipo primitivo en objeto(Boxing)
    
    //Creamos la lista de enteros
    ArrayList<Integer> listaInt=new ArrayList<>();
    //Insertamos los enteros
    insertarDobleGenerico(listaInt, 10);
    insertarDobleGenerico(listaInt, 15);
    System.out.println("Enteros: "+ listaInt.toString());
   
    //Creamos la lista de cadenas de texto
    ArrayList<String> listaStr = new ArrayList<>();
    //Insertamos las cadenas de texto
    insertarDobleGenerico(listaStr, "texto 1");
    insertarDobleGenerico(listaStr, "texto 2");
    System.out.println("Cadenas: " + listaStr.toString());
    
    //Creamos la lista de fechas
    ArrayList<Date> listaDate = new ArrayList<>();
    //Insertamos las fechas
    insertarDobleGenerico(listaDate, new Date(82, 4, 10));
    insertarDobleGenerico(listaDate, new Date(84, 9, 20));
    System.out.println("Fechas: " + listaDate.toString());
     
    //Creamos la lista de datos decimales(double)
    ArrayList<Double> listaDouble = new ArrayList<>();
    insertarDobleGenerico(listaDouble, new Double(2.55));
    
}

//Método para añadir cualquier tipo de dato a la lista
public static<Tipo> void insertarDobleGenerico (ArrayList<Tipo> lista, Tipo valor) {
        lista.add(valor);
        lista.add(valor);
    }
        
//Método para añadir datos tipo Integer a una lista        
public static void insertarDoble(ArrayList<Integer> lista, int valor) {
        lista.add(valor);
        lista.add(valor);
    }

//Método para datos String a una lista
    public static void insertarDoble(ArrayList<String> lista, String valor) {
        lista.add(valor);
        lista.add(valor);
    }

}