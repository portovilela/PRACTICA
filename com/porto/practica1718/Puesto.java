
/**
 * Enumeration class Puesto - write a description of the enum class here
 *
 * @author jose luis porto vilela
 * @version 0
 */

package com.porto.practica1718;
public enum Puesto
{
    PROF_AYUDANTE("Profesor Ayudante"),
    PROF_AYUDANTE_DOCTOR("Profesor Ayudante Doctor");
    
    private String puesto;
    private Puesto(String puesto){
        this.puesto=puesto;}
        
    public String getPuesto()  {
        return this.puesto;
    }
}
    
