
package pkg01_ejemplojava;

public class Main {

  
    public static void main(String[] args) {
      boolean condicion = 5 == 5 && true;  
    if(condicion || false){
        System.out.println("Es verdadero");
    }
    else if (5>7){
    
    System.out.println("No se ejecuta");
    }
    else if (8<9){
    
    System.out.println("No se ejecuta");
    
    }
    else{
    System.out.println("Cualquier otro caso");
    }  
    char letra='B';
    switch (letra){
        case 'A':
            System.out.println("Aaaaaa");
            break;
         case 'B':
            System.out.println("Bbbbbb");
            break;
         case 'C':
            System.out.println("Ccccccc");
            break;
    
    
    }
    String formateado =nombreApell("Paco", "Garcia Garcia");
    System.out.println(formateado);
    
    Tucan miPajaro=new Tucan();//Creamos objeto tipi Tucan
    miPajaro.longitud=20.5F;
    System.out.println("Long tucan:" + miPajaro.longitud);
    
    Tucan otroPajaro=new Tucan();
    otroPajaro.longitud=39.9F;
    
    System.out.println("Mi tucan:" + miPajaro.longitud);
    System.out.println("Otro tucan:" + otroPajaro);
    
    otroPajaro=miPajaro;//Apuntamos al espacio de memoria donde está miPajaro
    
    Tucan nuevoTuc=new Tucan();
    System.out.println("Nuevo Tucan:" + nuevoTuc.longitud);
    
    
    }
    
    
    
    
 static String nombreApell(String nombre, String apellidos){
 
 return apellidos + ", " + nombre;
 }

}