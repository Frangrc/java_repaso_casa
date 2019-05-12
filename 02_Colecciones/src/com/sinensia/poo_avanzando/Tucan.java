/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

//Clase Tucan que hereda de la clase AnimalSalvaje
public class Tucan extends AnimalSalvaje {
    
    //Realizamos la construccion en funcion del valor de los atributos que
    //conocemos de esta clase
    public Tucan(String nombre, float tamanho) {
        super(2, true, false, nombre, tamanho);
    }
    
    //Sobreescribimos los métodos heredados de la clase Animal(mover, ccomer,volar)
    @Override
    public void mover() {
        System.out.println(nombre +  " Volando va!");
    }

    @Override
    public void comer(){
    System.out.println(nombre +  " Come alpiste");
    }

    @Override 
    public void volar(){
    System.out.println(nombre +  " Si puede volar");
    }
    
    //Sobreescribimos método específico de la clase AnimalSalvaje
    @Override
    public void peligro() {
        System.out.println(nombre +  " puede atacarte si te acercas");    }

    }
