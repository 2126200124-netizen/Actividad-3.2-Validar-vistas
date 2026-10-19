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

public class asistencia {
    
    private int idAsistencia;
    private String matriculaAlumno;
    private String fecha;
    private boolean presente;

    public asistencia() {
        this.idAsistencia = 0;
        this.matriculaAlumno = "";
        this.fecha = "";
        this.presente = false;
    }

    public asistencia(int idAsistencia, String matriculaAlumno, String fecha, boolean presente) {
        this.idAsistencia = idAsistencia;
        this.matriculaAlumno = matriculaAlumno;
        this.fecha = fecha;
        this.presente = presente;
    }

    // Getters y Setters
    public int getIdAsistencia() { return idAsistencia; }
    public void setIdAsistencia(int idAsistencia) { this.idAsistencia = idAsistencia; }
    public String getMatriculaAlumno() { return matriculaAlumno; }
    public void setMatriculaAlumno(String matriculaAlumno) { this.matriculaAlumno = matriculaAlumno; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public boolean isPresente() { return presente; }
    public void setPresente(boolean presente) { this.presente = presente; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        asistencia that = (asistencia) o;
        return idAsistencia == that.idAsistencia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAsistencia);
    }

    @Override
    public String toString() {
        return "ID Asistencia: " + idAsistencia + ", Alumno: " + matriculaAlumno + ", Fecha: " + fecha + ", Presente: " + presente;
    }
}
