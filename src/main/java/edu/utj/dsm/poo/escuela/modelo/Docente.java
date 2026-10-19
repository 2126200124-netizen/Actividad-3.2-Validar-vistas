// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.modelo;

import java.util.Objects;

/**
 * Clase que representan a los docentes
 * @author jorgi
 */
public class Docente extends Persona{
    private String numDocente;
    private String especialidad;

    public Docente(String nombre, String apellido, int edad, String telefono, String numDocente,String especialidad) {
        super(nombre, apellido, edad, telefono);
    this.numDocente=numDocente;
    this.especialidad=especialidad;
    }
    
    /**
     * Obtiene el numero del docente
     * @return Docente
     */
    public String getNumDocente(){
        return numDocente;
    }
    /**
     * Establece el numero del docente
     * @param numDocente
     */
    public void setNumDocente(String numDocente){
        this.numDocente=numDocente;
    }
    /**
     * Obtiene la especialidad del docente
     * @return 
     */
    public String getespecialidad(){
        return especialidad;
    }
    /**
     * Establece la especialidad del docente
     * @param especialidad 
     */
    public void setespecialidad(String especialidad){
        this.especialidad=especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.numDocente);
        hash = 89 * hash + Objects.hashCode(this.especialidad);
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
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.numDocente, other.numDocente)) {
            return false;
        }
        return Objects.equals(this.especialidad, other.especialidad);
    }

    @Override
    public String toString() {
        return super.toString()+ "Docente{" + "numDocente=" + numDocente + ", especialidad=" + especialidad + '}';
    }
    
}

