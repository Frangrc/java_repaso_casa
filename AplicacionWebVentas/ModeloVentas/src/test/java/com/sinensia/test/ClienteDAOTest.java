/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.dao.InterfazDAO;
import com.sinensia.modelo.dao.MySQLClienteDAO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteDAOTest {
    
    private static MySQLClienteDAO daoCli;
    
 
    
    @BeforeClass
    public static void setUpClass() {
        daoCli = new MySQLClienteDAO();
        assertNotNull("Error inicializacion DAO",daoCli);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

     @Test
     public void clienteBien1() {     
     //4 clientes bien    
     assertNotNull(daoCli.insertar(new Cliente(null, "Pru", "prux@pru", (short) 20, (short) 1, "Pru123")));
              
     //assertEquals(4, daoCli.obtenerTodos().size());
     assertEquals("prux@pru", daoCli.obtenerUno("prux@pru").getEmail());
     daoCli.eliminar("prux@pru");
     assertNull(daoCli.obtenerUno("prux@pru"));
     
     }

     @Test     
     public void clienteMal_1() {
        //assertEquals(4, daoCli.obtenerTodos().size());
     assertNull(daoCli.insertar(new Cliente(null, "", "prux@pru", (short) 20, (short) 1, "Pru123")));
     assertEquals("prux@pru", daoCli.obtenerUno(1).getEmail());
     
     }



}
