/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.utj.dsm.poo.escuela.persistencia;

import java.util.ArrayList;

/**
 *
 * @author jorgi
 */
public interface listable <T> {
    public boolean agregar(T elemento);
    public boolean actualizar(T elemento, int posicion);
    public boolean eliminar(T elemento);
    public ArrayList <T> listar();
    public ArrayList<T> consultar (String dato);
    public T traer(String dato);
}
