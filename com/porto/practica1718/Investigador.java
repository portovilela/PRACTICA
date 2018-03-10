
/**
 * Write a description of class Investigador here.
 *
 * @author jose luis porto vilela
 * @version 0
 */

package com.porto.practica1718;

import java.util.*;

public class Investigador
{
    // instance variables - replace the example below with your own
    
    private static final String campos[]={"NOMBRE","APELLIDOS","EMAIL","PUESTO"};
    
    
    private String nombre;
    private String apellidos;
    private String email;
    private Puesto puesto;

    /**
     * Constructor for objects of class Investigador
     */
    public Investigador()
    {
        // initialise instance variables
       
    }
    
    
     public Investigador(String nombre,String apellidos,String email, Puesto puesto)
    {
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.email=email;
       this.puesto=puesto;
       
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(final String nombre){
        this.nombre=nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public void setApellidos(final String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(final String email){
        this.email=email;
    }
    
    public Puesto getPuesto(){
        return this.puesto;
    }
    
    public void setPuesto(final Puesto puesto){
        this.puesto=puesto;
    }
    
    public void mostrarInfoInvestigador(){
        List<String> lineas=new ArrayList<>();
        List<String> camposl=Arrays.asList(campos);
        for(String campo:camposl){
            lineas.add(makeLinea(campo));
        }
        for(String line:lineas){
            System.out.println(line);
        }
            
    }
    
    private String makeLinea(String caso){
        if(campos[0].equals(caso)){
            return makeLineaNombre();
        }else if(campos[1].equals(caso)){
            return makeLineaApellidos();
        }else if(campos[2].equals(caso)){
            return makeLineaEmail();
        }else if(campos[3].equals(caso)){
            return makeLineaPuesto();
        }
        else{
            return "";
        }
        
    }
    
    private String makeLineaNombre(){
        StringBuilder linea=new StringBuilder("Nombre: ");
        linea.append(this.nombre);
        return linea.toString();
        
    }
    
    private String makeLineaApellidos(){
        StringBuilder linea=new StringBuilder("Apellido: ");
        linea.append(this.apellidos);
        return linea.toString();
        
    }
    
    private String makeLineaEmail(){
        StringBuilder linea=new StringBuilder("Email: ");
        linea.append(this.email);
        return linea.toString();
        
    }
    
    private String makeLineaPuesto(){
        StringBuilder linea=new StringBuilder("Puesto: ");
        linea.append(this.puesto.getPuesto());
        return linea.toString();
        
    }
        

  
}
