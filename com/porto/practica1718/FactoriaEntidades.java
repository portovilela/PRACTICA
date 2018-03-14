package com.porto.practica1718;


/**
 * Write a description of class FactoriaEntidades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoriaEntidades
{
    

    /**
     * Constructor for objects of class FactoriaEntidades
     */
    private FactoriaEntidades()
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Investigador crearNuevo(String nombre,String apellidos,String email, Puesto puesto)
    {
        return new Investigador(nombre,apellidos,email,puesto);
       
    }
}
