// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.modelo;

import java.util.Objects;

/**
 *
 * @author jorgi
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String telefono, RFC;
/**
 * Cronstructor de la clase persona
 * @param nombre
 * @param apellido
 * @param edad
 * @param telefono 
 */
    public Persona(String nombre, String apellido, int edad, String telefono){
    this.apellido=apellido;
    this.nombre=nombre;
    this.telefono=telefono;
    this.edad=edad;
    this.RFC=RFC;
}
    /**
     * Obtiene el nombre de la persona
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Establece el nombre de la persona
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    } 
    /**
     * Obtiene el apellido de la persona
     * @return apellido
     */
    public String getApellido(){
        return apellido;
    }
    /**
     * Establece el apellido de la persona 
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    /**
     * Establece la edad de la persona
     * @return edad 
     */
    public int getEdad(){
        return edad;
    }
    /**
     * Establece la edad de la persona
     * @param edad 
     */
    public void setEdad(int edad){
        this.edad=edad;
    }
    /**
     * Obtener el telefono de la persona
     * @return telefono
     */
    public String getTelefono(){
        return telefono;
    }
    /**
     * Establece el telefono de la persona
     * @param telefono 
     */
    public void getTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public void setRFC(String RFC){
        this.RFC=RFC;
    }
    public String getRFC(){
        return RFC;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.RFC);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.RFC, other.RFC);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + ", RFC=" + RFC + '}';
    }
    
    
    
}


