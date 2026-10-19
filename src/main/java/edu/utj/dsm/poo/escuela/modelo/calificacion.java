/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.dsm.poo.escuela.modelo;

/**
 *
 * @author jorgi
 */
import java.util.Objects;
public class calificacion {
   
    // Atributos
    private String materia;
    private double valorCalificacion;
    private String periodo; 
    private String matriculaAlumno;
    private  int idCalificaciones;

    // Constructor
    public calificacion(String materia, double valorCalificacion, String periodo, String matriculaAlumno, int idCalificaciones) {
        this.materia = materia;
        this.valorCalificacion = valorCalificacion;
        this.periodo = periodo;
        this.matriculaAlumno = matriculaAlumno;
        this.idCalificaciones = 0;
    }

    
    public boolean estaAprobada() {
        return this.valorCalificacion >= 70.0; 
    }

    public void mostrarCalificacion() {
        System.out.println("--- Reporte de Calificación ---");
        System.out.println("Alumno (Matrícula): " + matriculaAlumno);
        System.out.println("Materia: " + materia);
        System.out.println("Periodo: " + periodo);
        System.out.println("Calificación: " + valorCalificacion);
        
        if (estaAprobada()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        System.out.println("------------------------------");
    }

    // Getters y Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getValorCalificacion() {
        return valorCalificacion;
    }

    public void setValorCalificacion(double valorCalificacion) {
        this.valorCalificacion = valorCalificacion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getMatriculaAlumno() {
        return matriculaAlumno;
    }

    public void setMatriculaAlumno(String matriculaAlumno) {
        this.matriculaAlumno = matriculaAlumno;
    }
    public void setidCalificaciones(int idCalificaciones){
        this.idCalificaciones=idCalificaciones;
    }
    public int getidCalificaciones(){
        return idCalificaciones;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        calificacion that = (calificacion) o;
        return idCalificaciones == that.idCalificaciones; // Basado estrictamente en el id entero
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCalificaciones); // Basado estrictamente en el id entero
    }

    @Override
    public String toString() {
        return "ID Calificación: " + idCalificaciones + ", Materia: " + materia + 
               ", Calificación: " + valorCalificacion + ", Periodo: " + periodo + 
               ", Alumno: " + matriculaAlumno;
    }
    
}

