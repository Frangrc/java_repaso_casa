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
    //assert=afirmar/asegurar
    assertNotNull(servCli.insertar("Ok","email@du.com", "ok12", "30", "on"));
    assertEquals(servCli.obtenerUno("email@du.com").getNombre(),"Ok");
    servCli.eliminar("email@du.com");
    assertNull(servCli.obtenerUno("email@du.com"));
    }
    
    @Test
    public void clienteOk_2(){
    servCli.insertar("Cliente Ok","email1@du.com", "ok12", "30", "on");
    servCli.insertar("Cliente Ok","email2@du.com", "ok12", "25", "on");
    assertEquals(servCli.obtenerUno("email1@du.com").getEdad(),30);
    assertTrue(servCli.obtenerUno("email2@du.com").getActivo()==1);
    servCli.eliminar("email1@du.com");
    servCli.eliminar("email2@du.com");
    assertNull(servCli.obtenerUno("email1@du.com"));
    assertNull(servCli.obtenerUno("email2@du.com"));
    }
    
       
    @Test
    public void clienteMal_Nombre(){
    servCli.insertar("","clienteMal@du.com", "ok12", "30", "on");
    assertNull(servCli.obtenerUno("clienteMal@du.com"));
    }
    
    @Test
    public void clienteMal_OtrosCampos(){
    servCli.insertar("Nombre bien","", "ok12", "30", "on");
    assertNull(servCli.obtenerUno(""));
    servCli.insertar("Bien","client@du.com", "", "30", "on");
    servCli.insertar("Ok","client2_@du.com", "ok12", "0", "on");
    servCli.insertar("Ok","client3_@du.com", "ok12", "noNum", "on");
    
    assertNull(servCli.obtenerUno("client@du.com"));
    assertNull(servCli.obtenerUno("client2_@du.com"));
    assertNull(servCli.obtenerUno("client3_@du.com"));
    
    }
    
    @Test 
    public void cliente_ModificarOK() throws Exception {
    assertNotNull(servCli.insertar("Cliente Ok","client@du.com", "ok22", "30", "on"));
    Cliente cliente=servCli.obtenerUno("client@du.com");
    servCli.modificar(cliente.getId(),"Cli1","clientnew@du.com", "NuevaPswd", "30", "on");
    cliente=servCli.obtenerUno("clientnew@du.com");
    assertEquals(cliente.getPassword(), "NuevaPswd");
    servCli.eliminar("clientnew@du.com");
    assertNull(servCli.obtenerUno("clientnew@du.com")) ; 
    }
    
    
   @Test 
    public void cliente_ModificarMal() throws Exception{
    assertNotNull(servCli.insertar("Cliente Ok","client@du.com", "ok22", "30", "on"));
    Cliente cliente=servCli.obtenerUno("client@du.com");
    assertNull(servCli.modificar(cliente.getId(),"Cli1","clientnew@du.com", "NuevaPswd", "hh", "on"));
    cliente=servCli.obtenerUno("client@du.com");
    assertEquals(cliente.getEdad(), 30);
    servCli.eliminar("client@du.com");
    assertNull(servCli.obtenerUno("client@du.com"));
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
