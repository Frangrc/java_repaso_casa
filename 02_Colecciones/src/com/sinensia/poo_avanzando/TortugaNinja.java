/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import java.util.logging.Level;
import java.util.logging.Logger;

//Clase TortugaNinja que hereda de clase Mascota
public class TortugaNinja extends Mascota {

    public TortugaNinja(String nombre, float tamanho) {
        super(4, true, true, nombre, tamanho);
    }
    
    
    //Sobreescribimos los metodos heredados de la clase abstracta Animal
    @Override
    public void mover() {
        System.out.println(nombre +  " Salto mortal de edificio en edificio.");
    }
    
    @Override
    public void comer(){
    System.out.println(nombre +  " Come pizza y hamburguesas");
    }
    
    @Override 
    public void volar(){
    System.out.println(nombre +  "No puede volar"); 
    }

    
    //Sobreescribimos el metodo abstracto heredado de la clase Mascota
    @Override
    public void saludarAlPropietario(){
    System.out.println("Hola" + propietario.getNombre());
    }

}
