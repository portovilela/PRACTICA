package com.porto.practica1718;


/**
 * Write a description of class Lanzador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lanzador
{
   public static void main(String args[]){
       Investigador inv1=new Investigador();
       inv1.setNombre("José");
       inv1.setApellidos("Porto Vilela");
       inv1.setEmail("portovilela@gmail.com");
       inv1.setPuesto(Puesto.PROF_AYUDANTE);
       inv1.mostrarInfoInvestigador();
       System.out.println("");
    }
}
