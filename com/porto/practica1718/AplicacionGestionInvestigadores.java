package com.porto.practica1718;

import java.util.*;
/**
 * Write a description of class AplicacionGestionInvestigadores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AplicacionGestionInvestigadores
{
   private Set<Investigador> investigadores;
   private Set<Institucion> instituciones;
   private Set<Publicacion> publicaciones;

    /**
     * Constructor for objects of class AplicacionGestionInvestigadores
     */
    public AplicacionGestionInvestigadores()
    {
        this.investigadores=new HashSet<>();
        this.instituciones=new HashSet<>();
        this.publicaciones=new HashSet<>();
    }

   
    public Boolean addInstitucion(Institucion i)
    {
        this.instituciones.add(i);
        return Boolean.TRUE;
    }
}
