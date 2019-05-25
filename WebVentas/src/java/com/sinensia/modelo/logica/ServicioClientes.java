/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Cliente;
//import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.dao.MySQLClienteDAO;
import java.util.List;

/**
 *
 * @author Admin - Paco
 */
public class ServicioClientes {

    private MySQLClienteDAO dao;

    public ServicioClientes() {
        dao = new MySQLClienteDAO();
    }

    public Cliente insertar(String nombre, String email, String passwd, String edad, String activo) {
      
              if (validar(nombre, email, passwd, edad, activo)) {
            short iEdad = Short.parseShort(edad);
            short iActivo = (short) ("on".equals(activo) ? 1 : 0);
            
            Cliente nuevoCli = new Cliente(null, nombre, email, iEdad, iActivo, passwd);
            nuevoCli = dao.insertar(nuevoCli);
            return nuevoCli;
        } else {
            return null;
        }
    }

//Campos unicos id y email
    public Cliente obtenerUno(int id) {
        return dao.obtenerUno(id);
    }

    public Cliente obtenerUno(String email) {
    return dao.obtenerUno(email);
//        for (Cliente c : dao.obtenerTodos()) {
//            if (c.getEmail().equals(email)) 
//                return c;
//        }   
//    return null;
    }

    public void eliminar(int id){
    dao.eliminar(id);
    }
    
    public void eliminar(String email){
    
    Cliente cli = obtenerUno(email);
    Integer id = cli.getId();
    eliminar(id);
    }
    
    public Cliente modificar(int id,String nombre, String email, String passwd, String edad, String activo)
    throws Exception
    {
    Cliente cli=null;
        if(validar(nombre, email,passwd,edad,activo)){
        cli=new Cliente(id,nombre,email, Short.parseShort(edad),(short)("on".equals(activo) ? 1 : 0) ,passwd);
        cli=dao.modificar(cli);
        }//else{
//            throw new Exception("Validacion erronea en cliente");
//        }
    return cli;
    }
    
    public boolean validar(String nombre, String email, String passwd, String edad, String activo){
    
    if (nombre == null || nombre.equals("")) {
            return false;
        }
    
    if (email == null || email.equals("")||passwd==null || passwd.equals("")) {
            return false;
        }  
        short iEdad = 0;
        try{iEdad =Short.parseShort(edad);}
        catch(Exception e){return false;}
       
        if (iEdad <= 0) {
            return false;
        }
        //activo puede ser null, por eso de esta forma es mejor que activo.equals("on")
        short iActivo = (short) ("on".equals(activo) ? 1 : 0);
        
        //TO DO: Faltan ciertas validaciones
        return true;
    }

public List<Cliente> obtenerTodos(){
return dao.obtenerTodos();

}

}
