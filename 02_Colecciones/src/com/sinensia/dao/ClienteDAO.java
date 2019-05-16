/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author Admin - Paco
 */
public class ClienteDAO implements InterfazDAO<Cliente> {
    
    HashMap<Long, Cliente> mapa;
    Cliente List;
    
public ClienteDAO() {
mapa= new HashMap<>();

}

    @Override
    public void poner(Cliente cli){
    if(cli==null){
    System.err.println("No se pueden añadir nulos");
    return;
    }
    //Metemos el dato cliente en el HashMap
    mapa.put(cli.getId(), cli);

}

    @Override
    public Cliente leerUno(long id){
    //Si el mapa contiene clave 
    if(mapa.containsKey(id)){
    //Obtenemos el dato del HashMap mediante el identificador
    return mapa.get(id);

    }
    System.err.println("Clave/ID no encontrado " + id);
    return null;

}
    
    @Override
    public void eliminar(Cliente cliente) {
       mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public List<Cliente> leerTodos() {
      
   //Creamos lista con tipo Cliente como argumento     
   ArrayList<Cliente> lista;
   lista = new ArrayList<Cliente>();
   
    for (Map.Entry<Long,Cliente> ent  : mapa.entrySet()) {
    
    //Obtenemos el valor de la lista
    lista.add(ent.getValue());
    }
    return lista; //Devolvemos la lista
    
    }

@Override
public void modificar(Cliente nuevoValor){

Cliente cli= mapa.get(nuevoValor.getId());
cli.setActivo(nuevoValor.isActivo());
cli.setNombre(nuevoValor.getNombre());
cli.setEmail(nuevoValor.getEmail());

}

    
    
    

}

