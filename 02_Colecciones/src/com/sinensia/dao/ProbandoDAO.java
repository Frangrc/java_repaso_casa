/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import java.util.List;

/**
 *
 * @author Admin - Paco
 */
public class ProbandoDAO {
public static void probarCliente() {
    
    ClienteDAO repoCli = new ClienteDAO();
    repoCli.poner(new Cliente(1, "Ana", "aaa@ijim"));
    repoCli.poner(new ClienteInvitado(2, "Juan", "ddk@rr"));
    repoCli.poner(new ClienteInvitado(3, "Bea", "ddk@oo"));
    //System.out.println("Juan: " + repoCli.leerUno(2).toString());
    //System.out.println("Repo: " + repoCli.leerUno(2).toString());

repoCli.modificar(new ClienteInvitado(2, "Juan Bonilla", "@irjir"));
Cliente cli=repoCli.leerUno(2);
//System.out.println("Cliente modificadp: " + cli.toString());
repoCli.eliminar(1);
List<Cliente> lista = repoCli.leerTodos();

    for(Cliente cliente: lista){

        System.out.println("Cliente " + cliente.toString());
        }

    }

}
