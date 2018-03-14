package com.porto.practica1718;

import java.util.*;
/**
 * Write a description of class Institucion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Institucion
{
    private String name;
    private Ubicacion ubicacion;
    private List<Investigador> investigadores;

    /**
     * Constructor for objects of class Institucion
     */
    public Institucion()
    {
        this.investigadores=new ArrayList<>();
    }
    
    public Institucion(String name,Ubicacion ubicacion)
    {
        this.name=name;
        this.ubicacion=ubicacion;
        this.investigadores=new ArrayList<>();
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  
}
