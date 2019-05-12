/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteVip extends Cliente {

    private String beneficios;

    public ClienteVip(long id, String nombre, String email) {
        super(id, nombre, email);
        beneficios = "";
    }    
    public ClienteVip(long id, String nombre, String email, String beneficios) {
        super(id, nombre, email);
        this.beneficios = beneficios;
    }    

    public String getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public void mostrar() {
        super.mostrar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ES VIP: " + beneficios);
    }
    
}
