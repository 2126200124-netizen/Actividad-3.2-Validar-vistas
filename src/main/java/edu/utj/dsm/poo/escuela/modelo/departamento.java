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

public class departamento {
    
    private int idDepartamento;
    private String nombreDepartamento;
    private String edificio;

    public departamento() {
        this.idDepartamento = 0;
        this.nombreDepartamento = "";
        this.edificio = "";
    }

    public departamento(int idDepartamento, String nombreDepartamento, String edificio) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.edificio = edificio;
    }

    // Getters y Setters
    public int getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(int idDepartamento) { this.idDepartamento = idDepartamento; }
    public String getNombreDepartamento() { return nombreDepartamento; }
    public void setNombreDepartamento(String nombreDepartamento) { this.nombreDepartamento = nombreDepartamento; }
    public String getEdificio() { return edificio; }
    public void setEdificio(String edificio) { this.edificio = edificio; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        departamento that = (departamento) o;
        return idDepartamento == that.idDepartamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepartamento);
    }

    @Override
    public String toString() {
        return "ID Departamento: " + idDepartamento + ", Nombre: " + nombreDepartamento + ", Edificio: " + edificio;
    }
}