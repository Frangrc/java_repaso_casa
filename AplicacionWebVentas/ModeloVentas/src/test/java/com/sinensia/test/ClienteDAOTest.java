/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteDAOTest {
    
    private static ClienteDAO daoCli;
    
 
    
    @BeforeClass
    public static void setUpClass() {
        daoCli = new ClienteDAO();
        assertNotNull("Error inicializacion DAO",daoCli);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

//     @Test
//     public void clienteBien1() {     
//     //4 clientes bien    
//     daoCli.poner(new Cliente(null, "Pru", "pru@pru", (short) 20, (short) 1, "Pru123"));
//    
//          
//     //assertEquals(4, daoCli.leerTodos().size());
//     assertEquals("pru@pru", daoCli.leerUno(3).getEmail());
//     daoCli.eliminar(1);
//     assertNull(daoCli.leerUno(1));
//     
//     }
//
//     @Test     
//     public void clienteMal_1() {
//         assertEquals(4, daoCli.leerTodos().size());
//       daoCli.poner(new Cliente(null, "", "pru@pru", (short) 20, (short) 1, "Pru123"));
//     assertEquals("pru@pru", daoCli.leerUno(3).getEmail());
//     
//     }



}
