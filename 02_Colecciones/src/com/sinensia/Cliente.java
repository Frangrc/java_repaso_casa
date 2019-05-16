package com.sinensia;
import com.sinensia.dao.GenericoDAO;

public class Cliente extends Entidad implements Comparable<Cliente> {
        
    protected String nombre;
    private String email;
    private boolean activo;

    /*public Cliente () { // Constructor por defecto
        
    }*/
    public Cliente(long id, String nombre, String email) /* throws Exception*/ {
        
        super(id); //Heredamos id de la clase padre
        if (nombre == null || nombre == "") {
            // throw new Exception("Nombre de cliente inválido");
            System.err.println("Nombre de cliente inválido");
        }
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
    }
    public long getId() {
        return this.id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre == "") {
            // throw new Exception("Nombre de cliente inválido");
            System.err.println("Nombre de cliente inválido");
        }
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void mostrar() {
        System.out.println("Cliente " + nombre);
        System.out.println("  Id: " + this.id);
        System.out.println("  Email: " + this.getEmail());
    
    }

    @Override
    public String toString() {
        
       return "Cliente [" + id + ", " + nombre + ", " + email + "]";
    
    }

    @Override
    public int compareTo(Cliente otroCli) {
        //Comparamos por nombre por el compareTo de String
    if(nombre.compareTo(otroCli.nombre)==0){
    //Si coinciden, comparamos por email
        return email.compareTo(otroCli.email);
        
    }
    else{//Devolvemos la comparacion por nombre
    return nombre.compareTo(otroCli.nombre);
    
    }
    }


}
