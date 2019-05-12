/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

/**
 *
 * @author Admin
 */
public class Leon extends AnimalSalvaje implements Depredador, Mamifero {
    
    public Leon(String nombre, float tamanho) {
        super(4, true, false, nombre, tamanho);
    }
    
    @Override
    public void mover() {
        System.out.println(nombre +  " Corre por Africa");
    }    
    
    @Override
public void comer(){
System.out.println(nombre +  " Come gacelas");
}

@Override 
public void volar(){

throw new UnsupportedOperationException("No puede volar el el gato");
}

    @Override
    public void cazar(String presa) {
       System.out.println(nombre + "corre y caza" + presa) ; 
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
    public void peligro(){
    System.out.println(nombre +  " puede atacarte si te acercas");

}
    
    @Override
    public String mamar1(Mamifero mam) {
            return "El leon " + nombre + " mama de "+
                mam.toString() + " usando toString"; 
    }

    @Override
    public String mamar2(Mamifero mam) {
    //Como nombre es caracteristica de la clase animal
    if(mam instanceof Animal) { //Si mam es instancia de animal lo convertimos a tipo animal
            Animal anim = (Animal) mam;
            return "El león " + nombre + " mama de "+
                anim.getNombre() + " haciendo casting";}
            else 
            return null;       
    
    }

    public String mamar3(Mamifero mam) {
        
        return "El gato " + nombre + " mama de "+
                mam.nombrar() + " usando método nombrar"; 
    
    }

}
   

