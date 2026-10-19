// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.modelo;

import java.util.Objects;

/**
 * Clase que representa a los alumnos
 * @author jorgi
 */
public final class Alumno extends Persona {
    private String matricula;
    private String grado;
    private int calificacion;

    public Alumno(String nombre, String apellido, int edad, String telefono, String matricula, String grado, int calificacion) {
        super(nombre, apellido, edad, telefono);
        this.grado=grado;
        this.matricula=matricula;
        this.calificacion=calificacion;
    }
    /**
     * Obtiene la matricula del alumno
     * @return Return
     */
    public String getMatricula(){
        return matricula;
    }
    /**
     * Establece la matricula del alumno
     * @param matricula 
     */
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    /**
     * Obtiene el grado del alumno
     * @return Grado
     */
    public String getGrado(){
        return grado;
    }
    /**
     * Establece el grado del alumno
     * @param grado 
     */
    public void setGrado(String grado){
        this.grado=grado;
    }
    /**
     * Obtiene la calificacion el alumno
     * @return 
     */
    public int getCalificacion(){
        return calificacion;
    }
    /**
     * Establece la calificacion del alumno
     * @param calificacion 
     */
    public void setCalificacion(int calificacion){
        this.calificacion=calificacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.matricula);
        hash = 83 * hash + Objects.hashCode(this.grado);
        hash = 83 * hash + this.calificacion;
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
        final Alumno other = (Alumno) obj;
        if (this.calificacion != other.calificacion) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.grado, other.grado);
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "matricula=" + matricula + ", grado=" + grado + ", calificacion=" + calificacion + '}';
    }
    
}
