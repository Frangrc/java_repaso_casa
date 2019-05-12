/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;

import com.sinensia.Cliente; //Importamos clase Cliente para usarla en propietario

//Clase abstracta Mascota que hereda de clase Animal
public abstract class Mascota extends Animal {

    
    
    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, float tamanho) {
        super(patas, aerobico, acuatico, nombre, tamanho);
    }

    //Atributo específico de la clase mascota con sus get y set
    protected Cliente propietario;
    
    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    //Creamos e implementamos método específico para la clase mascota
    public void pedirComida(){
    System.out.println(propietario.getNombre() + " ALIMENTAME!!");
    }
    
    //Creamos método específico de forma abstracta para la clase mascota
    public abstract void saludarAlPropietario();
    
    
    
    
    }
    
    
    

    

