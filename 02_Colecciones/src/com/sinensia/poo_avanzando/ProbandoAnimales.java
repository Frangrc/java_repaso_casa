/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.poo_avanzando;
import com.sinensia.Cliente;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ProbandoAnimales {
    
    public static void probarClasesAbstractas ()  {
        
        //Creamos objeto Tucan y le pasamos sus atributos especificos
        Tucan unTucan = new Tucan("Turigualpa", 15.8f);
        unTucan.mover();
        unTucan.volar();
        unTucan.comer();
        unTucan.peligro();
        
        TortugaNinja michelangelo = new TortugaNinja("Michelangelo", 175.5f);
        michelangelo.mover();
        michelangelo.volar();
        michelangelo.comer();
        
        //Creamos objeto Cliente y le asignamos el nombre
        Cliente yo=new Cliente(3, "Paco", null);
        michelangelo.setPropietario(yo);
        michelangelo.pedirComida();
        michelangelo.saludarAlPropietario();
        
        //Creamos objeto tipo Gato y le pasamos sus atributos especificos
        Gato wiskas=new Gato("Wiskas", 2f);
        wiskas.mover();
        wiskas.comer();
       
        //Ejemplo de realizar un casting desde clase Animal a clase Mascota
        //para poder usar sus métodos específicos de mascota
        Animal miDragon= new Dragon("Drago", 4959);//cast implicito
        ((Mascota) miDragon).setPropietario(yo);//cast explicito
        ((Mascota) miDragon).saludarAlPropietario();
        ((Mascota) miDragon).pedirComida();
        
        //Creamos otro objeto Dragón y llamamos a los métodos
        Dragon miOtroDragon= new Dragon("Smaug", 7000);
        miOtroDragon.mover();
        miOtroDragon.volar();
        miOtroDragon.comer();
        
        //Llamamos a saludar propietario desde miOtroDragon
        miOtroDragon.setPropietario(yo);
        miOtroDragon.saludarAlPropietario();
        miOtroDragon.cazar("enanos");
        
        Leon leon=new Leon("Mufasa",2.88f);
       
        //Inicializamos objeto scanner
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos por teclado elegir el animal que va a mamar
        System.out.println("Elija quién mama de quién: (Mufasa/Wiskas)");
        String quienMama = scanner.nextLine();
        System.out.println(leon.mamar3(wiskas));
        if("Mufasa".equals(quienMama)){
            System.out.println("Elia la opción de método: (1/2/3)");
            String opcion = scanner.nextLine();
            if("1".equals(opcion)){
            System.out.println(leon.mamar1(wiskas));
            }
            else if("2".equals(opcion)){
            System.out.println(leon.mamar2(wiskas));
            }
            else if("3".equals(opcion)){
            System.out.println(leon.mamar3(wiskas));
            }
        }
        
        else if ("Wiskas".equals(quienMama)){
            System.out.println("Elia la opción de método: (1/2)");
            String opcion = scanner.nextLine();
            if("1".equals(opcion)){
            System.out.println(leon.mamar1(wiskas));
            }
            else if("2".equals(opcion)){
            System.out.println(leon.mamar2(wiskas));
            }
            else if("3".equals(opcion)){
            System.out.println(leon.mamar3(wiskas));
            }
        }
        

        try {   //Sentencias que vamos a ejecutar
            unTucan.volar();
            michelangelo.volar();
        } 
          //Si en el try se lanza una excepción del tipo indicado en el
          //paréntesis de cada catch, sacamos el mensaje correspondiente.
          catch (UnsupportedOperationException error) {
            System.err.println(error.getMessage());            
        } catch (StringIndexOutOfBoundsException ex) {            
            System.err.println(" Error en el String " + ex.getMessage());  
        } catch (Exception ex) {            
            System.err.println(" Error general " + ex.getMessage());  
        } finally {
            System.out.println("Siempre me ejecuto. Cerremos recursos");
        }
    }  
}
