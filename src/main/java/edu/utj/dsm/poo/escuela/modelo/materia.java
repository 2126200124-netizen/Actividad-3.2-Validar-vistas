/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.dsm.poo.escuela.modelo;


import java.util.Objects;

public class materia {

    private int idMateria;
    private String codigo;
    private String nombre;
    private int creditos;

    /**
     * Constructor vacío por defecto.
     */
    public materia() {
        this.idMateria = 0;
        this.codigo = "";
        this.nombre = "";
        this.creditos = 0;
    }

    /**
     * Constructor con atributos mínimos indispensables.
     * 
     * @param idMateria Identificador único entero de la materia.
     * @param codigo Código alfanumérico de la materia.
     * @param nombre Nombre de la materia.
     * @param creditos Créditos académicos.
     */
    public materia(int idMateria, String codigo, String nombre, int creditos) {
        this.idMateria = idMateria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void mostrarDetallesMateria() {
        System.out.println("Materia: " + nombre + " (" + codigo + ") - Créditos: " + creditos);
    }

    // --- Getters y Setters ---
    
    public int getIdMateria() { 
        return idMateria; 
    }
    
    public void setIdMateria(int idMateria) { 
        this.idMateria = idMateria; 
    }

    public String getCodigo() { 
        return codigo; 
    }
    
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getCreditos() { 
        return creditos; 
    }
    
    public void setCreditos(int creditos) { 
        this.creditos = creditos; 
    }

    // --- Métodos Estándar ---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        materia materiaObj = (materia) o;
        return idMateria == materiaObj.idMateria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMateria);
    }

    @Override
    public String toString() {
        return "ID Materia: " + idMateria + ", Código: " + codigo + ", Nombre: " + nombre + ", Créditos: " + creditos;
    }
}