/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.dao;


import java.util.List;



/**
 *Interfaz Data Access PObject para toda la App
 * @author Paco
 * @param <T> Entidad para interfaz DAO
 */

//Creamos interfaz genérica(T)
public interface InterfazDAO<T> {
    
    T insertar(T valor);
    T obtenerUno(Integer id);
    List<T> obtenerTodos();
    void eliminar(T valor);
    void eliminar(Integer id);
    T modificar(T nuevoValor);
}
