/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

//Clase Dragon que hereda de clase mascota con interfaz de depredador asignada
public class Dragon extends Mascota implements Depredador {

    public Dragon(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }

    public Dragon(String nombre, float tamanho, int patas) {
        super(patas, true, false, nombre, tamanho);
    }

    //Sobreescribimos método heredado de la clase Mascota
    @Override
    public void saludarAlPropietario(){
    System.out.println(propietario.getNombre() + " te saludo con mirada chunga");
    }
    
    
    //Sobreescribimos métodos heredados de la clase Animal(mover, volar, comer)
    @Override
    public void mover() {
    System.out.println(nombre +  " Vuela asustando a la peña"); 
    }

    @Override
    public void volar() {
      System.out.println(nombre +  " Vuela te quema y te come");   }

    @Override
    public void comer() {
       System.out.println(nombre +  " Come de todo");    }

    
//Sobreescribimos método heredado de la interfaz Depredador
    @Override
    public void cazar(String presa) {
        System.out.println(nombre + " quema y mata " + presa) ;  
    
    }
    
}
