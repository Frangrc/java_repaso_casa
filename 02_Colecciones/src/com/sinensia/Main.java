package com.sinensia;

import com.sinensia.dao.ClienteDAO;
import com.sinensia.dao.ProbandoDAO;
import com.sinensia.genericos.ProbandoGenericos;
import com.sinensia.poo_avanzando.ProbandoAnimales;
import com.sinensia.pruebas.Fechas;
import com.sinensia.pruebas.Colecciones;
import com.sinensia.pruebas.Ficheros;
import static com.sinensia.pruebas.Herencia.probandoHerencia;
import com.sinensia.pruebas.Polimorfismo;
import com.sinensia.pruebas.TratamientoCadenas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
            /*Polimorfismo.polimorfeandoConListas();
            Polimorfismo.clientes.add(new Cliente(7, "Yo", null));
            Polimorfismo.poliformHashMap();*/
            //Colecciones.ejemploListas();
            //Colecciones.ejemploSet();
            //Colecciones.ejemploHashMap();
            //Colecciones.ejemploListas();
            //Fechas.probar();
            //probandoHerencia();*/
            // ProbandoAnimales.probarClasesAbstractas();
            //ProbandoGenericos.probarMetodo();
            //ProbandoDAO.probarCliente();
            //Ficheros.probarEscritura();
//        try {Ficheros.probarEscritura();
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
            //Ficheros.lecturaFich();
    //Colecciones.comparaciones();
    TratamientoCadenas.pruebasString();
    }
}
