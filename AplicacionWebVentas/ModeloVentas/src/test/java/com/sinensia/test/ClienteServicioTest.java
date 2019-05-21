/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.test;

import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.logica.ServicioClientes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteServicioTest {
    
    private static ServicioClientes servCli;
    public ClienteServicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    servCli=new ServicioClientes();
    }
    
    @Test
    public void clienteOk_1(){
    servCli.crear("Ok","email@du.com", "ok12", "30", "on");
    assertEquals(servCli.obtenerUno("email@du.com").getNombre(),"Ok");
    }
    
    @Test
    public void clienteMal_1(){
    servCli.crear("Ok","email@du.com", "", "30", "on");
    assertNull(servCli.obtenerUno("clienteMal@du.com"));
    
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
// @Test
//    public void probarJUnit() {
//        assertEquals(10, 10);
//        assertEquals("Texto", "Texto");
//        // assertEquals("texto", "Texto");
//        //assertNotEquals("Texto", "tExto");
//    }
//
//    @Test
//    public void probarClienteDAO() {
//        ClienteDAO daoCli = new ClienteDAO();
//        daoCli.poner(new Cliente(1, "Pru", "pru@pru", (short) 20, (short) 1, "Pru123"));
//        daoCli.poner(new Cliente(2, "Pru2", "pru@pru2", (short) 22, (short) 0, "Pru123"));
//
//        assertEquals(daoCli.leerTodos().size(), 2);
//        Cliente cli = daoCli.leerUno(2);
//        assertTrue(cli.getEmail().equals("pru2@peu"));
//        //assertSame(cli, cli);
//    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
