/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Gato extends Mascota implements Mamifero {
    
    public Gato(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    
    @Override
    public void mover() {
        System.out.println(nombre +  " Trepa por el edificio.");
    }    
    
    @Override
    public void comer(){
    System.out.println(nombre +  " Come sardinas");
    }

@Override 
public void volar(){

throw new UnsupportedOperationException("No puede volar el el gato");

}

@Override
public void saludarAlPropietario(){

 System.out.println(propietario.getNombre());
}

@Override
    public String nombrar() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Caballo " + nombre; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mamar1(Mamifero mam) {
        
        return "El gato " + nombre + " mama del "+
                mam.toString() + " usando toString"; 
    
    }
    
    @Override
    public String mamar2(Mamifero mam) {

    //Como nombre es caracteristica de la clase animal
  if(mam instanceof Animal) { //Si mam es instancia de animal lo convertimos a tipo animal
            Animal anim = (Animal) mam;
            return "El gato " + nombre + " mama de "+
                anim.getNombre() + " haciendo casting";}
            else 
            return null;
            
    } 

//No hace falta sobreescribir mamar3 porque la implementamos aquí
    public String mamar3(Mamifero mam) {
        
        return "El gato " + nombre + " mama del "+
                mam.nombrar() + " usando metodo nombrar"; 
    
    }

}   