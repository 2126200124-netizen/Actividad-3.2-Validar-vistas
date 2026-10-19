/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.dsm.poo.escuela.modelo;


import java.util.Objects;


public class horario {
    
    private int idHorario;
    private String diaSemana;
    private String horaInicio;
    private String horaFin;

    public horario() {
        this.idHorario = 0;
        this.diaSemana = "";
        this.horaInicio = "";
        this.horaFin = "";
    }

    public horario(int idHorario, String diaSemana, String horaInicio, String horaFin) {
        this.idHorario = idHorario;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getters y Setters
    public int getIdHorario() { return idHorario; }
    public void setIdHorario(int idHorario) { this.idHorario = idHorario; }
    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }
    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }
    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        horario horarioObj = (horario) o;
        return idHorario == horarioObj.idHorario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHorario);
    }

    @Override
    public String toString() {
        return "ID Horario: " + idHorario + ", Días: " + diaSemana + " de " + horaInicio + " a " + horaFin;
    }
}