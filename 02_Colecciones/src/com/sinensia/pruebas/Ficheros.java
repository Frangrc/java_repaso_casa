/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Admin - Paco
 */
public class Ficheros {
    
public static void probarEscritura() throws IOException {
    String[] lineasTexto = {
    "Linea primera",
        "Linea segunda",
        "Linea tercera"};
    
    FileWriter fichero= null;
    try{
    fichero=new FileWriter("Fichero_texto.txt" );
    for(int i=0;i<100000;i++){
    for(String linea : lineasTexto){
    fichero.write(linea + "\r\n");
    }
    }
    fichero.write("Fin de fichero" +"\r\n");
    //fichero.close();
    }
    catch (Exception ex){
    System.err.println("Mensaje error: " +ex.getMessage());
    }
    finally{
//    try{
    fichero.close();
    System.out.println("Fichero cerrado");
    }
//        fichero.close();
//    }
    }
   
public static void escriturasStream(){

String[] lineasTexto={
"Linea primera",
        "Linea segunda",
        "Linea tercera"

};

Writer out=null;
try{
FileOutputStream streamFich;
streamFich=new FileOutputStream("fich_2.txt");
OutputStreamWriter streamWriter;

//Crea la codificacicion, los datos de salida los pone en UTF-8
streamWriter=new OutputStreamWriter(streamFich, "UTF-8");

//El buffer recibe datos, cuando se rellena los envia al Stream de salida
out=new BufferedWriter(streamWriter);



for(String linea: lineasTexto){

try{
out.write(linea + "\r\n");
}
catch (IOException ex){
System.err.println("Error al escribiot fich: " + ex.getMessage());
}

}

}

catch(UnsupportedEncodingException | FileNotFoundException ex2){
System.out.println("Error 2: " + ex2.getMessage());
}
finally{
try{
out.close();
System.out.println("Fichero cerrado ");
}
catch(IOException ex3){
System.err.println("Error de cierre fich" + ex3.getMessage());

}

}
}

public static void lecturaFich(){

File fichFormWin=new File("C:\\Users\\Admin\\Desktop\\CURSO_JAVA\\curso_java_spring.git\\02_colecciones");
File fichFormJava=new File("C:/Users/Admin/Desktop/CURSO_JAVA/curso_java_spring.git/02_colecciones");
File fichRutaRelativa= new File("Fichero_texto.txt");

Scanner escaner=null;
try{
    System.out.println("Leyendo fich");
    escaner = new Scanner(fichRutaRelativa);
while (escaner.hasNextLine()){//Busca hasta el sihuiente cambio de linea
String linea=escaner.nextLine();
System.out.println(">>>>>>>> \"" + linea+ "\"");
//linea=new String("otra cosa");
if(linea.compareTo("Linea segunda")<0)
System.out.println("    es menor");

else if(linea.compareTo("Linea segunda")>0)
 System.out.println("    es mayor");

else System.out.println("    es igual");

}
}
catch(Exception ex){
    System.out.println("Mensaje: " + ex.getMessage());
}
finally{

    try{
        if(escaner != null){
        escaner.close();
        
        }
    }
    catch(Exception ex2){
           System.err.println("Mensaje al cerrar: "+ ex2.getMessage());
            }
   
}


}


}


