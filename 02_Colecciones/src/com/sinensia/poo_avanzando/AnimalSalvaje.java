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
public abstract class AnimalSalvaje extends Animal {
    
    
    
    public AnimalSalvaje(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }
    
    private int tamanhoMin;

    public int getTamanhoMin() {
        return tamanhoMin;
    }

    public void setTamanhoMin(int tamañoMin) {
        this.tamanhoMin = tamanhoMin;
    }
 
    public abstract void peligro();
    
}
