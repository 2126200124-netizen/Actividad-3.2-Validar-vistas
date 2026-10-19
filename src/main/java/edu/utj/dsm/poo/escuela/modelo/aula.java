/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.dsm.poo.escuela.modelo;


import java.util.Objects;


public class aula {
    
    private int idAula;
    private String numeroAula;
    private int capacidad;
    private boolean estaDisponible;

    public aula() {
        this.idAula = 0;
        this.numeroAula = "";
        this.capacidad = 0;
        this.estaDisponible = true;
    }

    public aula(int idAula, String numeroAula, int capacidad) {
        this.idAula = idAula;
        this.numeroAula = numeroAula;
        this.capacidad = capacidad;
        this.estaDisponible = true;
    }

    public void ocuparAula() {
        this.estaDisponible = false;
    }

    public void liberarAula() {
        this.estaDisponible = true;
    }

    // Getters y Setters
    public int getIdAula() { return idAula; }
    public void setIdAula(int idAula) { this.idAula = idAula; }
    public String getNumeroAula() { return numeroAula; }
    public void setNumeroAula(String numeroAula) { this.numeroAula = numeroAula; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public boolean isEstaDisponible() { return estaDisponible; }
    public void setEstaDisponible(boolean estaDisponible) { this.estaDisponible = estaDisponible; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        aula aulaObj = (aula) o;
        return idAula == aulaObj.idAula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAula);
    }

    @Override
    public String toString() {
        return "ID Aula: " + idAula + ", Número: " + numeroAula + ", Capacidad: " + capacidad;
    }
}