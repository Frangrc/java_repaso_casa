/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.pruebas;

/**
 *
 * @author Admin - Paco
 */
public class TratamientoCadenas {
public static void pruebasString() 
{
String quijote="En un lugar de la Mancha...";
if(quijote.contains("Mancha"))
    System.out.println("Contiene mancha");

if(quijote.contains("manCHa"))
    System.out.println("Contiene manCHa");

else
    System.out.println("No contiene manCHa");

if(quijote.toLowerCase().contains("manCHa".toLowerCase()))
    System.out.println("Conteiene manCHa - version minusculas");
    
else
   System.out.println("No contiene manCHa");


if(quijote.startsWith("En un lugar"))
    System.out.println("Comienza con 'En un lugar'");


 System.out.println("chartAt(6)= " + quijote.charAt(6));
 
 System.out.println(String.format("El texto '%s' tiene '%d' caracteres", quijote, quijote.length()));


 System.out.println(String.format("%.4f, %.3f, %.2f, %.1f", 1.1f, 2.2f, 3.3f, 4.4f ));

    System.out.println("Mancha esta en la posicion "+ quijote.indexOf("Mancha"));
 
 
  if(! quijote.isEmpty())
        System.out.println("Quijote no esta vacia");
  
    System.out.println("La ultima 'a' esta en " + quijote.lastIndexOf('a'));
    
    
    System.out.println("Trozo de cadena: "+ quijote.substring(6,14));
    
    String palabras[]=quijote.split(" ");
    for(String palabra : palabras){
        System.out.println("PALABRA:" + palabra);
    }
    
    String strCsv="Francisco, 1865768687, Calle Marceliano, Alumno ";
    for(String dato : strCsv.split(",")){
        System.out.println("DATO:" + dato.trim());
    }
    
//if(quijote.startsWith("En un lugar"))
//    System.out.println("Comienza con 'En un lugar'");
}

}
