package com.porto.practica1718;


/**
 * Write a description of class Ubicacion here.
 *
 * @author JOSE LUIS PORTO VILELA
 * @version 0
 */
public class Ubicacion
{
    
    private String direccion;
    private String ciudad;
    private String pais;

    /**
     * Constructor for objects of class Ubicacion
     */
    public Ubicacion()
    {
        
    }
    
    public Ubicacion(String direccion,String ciudad,String pais)
    {
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.pais=pais;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDireccion(){
        return this.direccion;
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCiudad(){
        return this.ciudad;
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
    
    
}
