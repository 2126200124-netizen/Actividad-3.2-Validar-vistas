/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.dsm.poo.escuela.persistencia;

import edu.utj.dsm.poo.escuela.modelo.administrador;
import java.util.ArrayList;

/**
 *
 * @author jorgi
 */
public class administradorArraylist implements listable<administrador> {

    
    private final ArrayList<administrador>lista;

    public administradorArraylist() {
        this.lista = new ArrayList<>();
    }
    
    
    @Override
    public boolean agregar(administrador elemento) {
        return lista.add(elemento);
    }

    @Override
    public boolean actualizar(administrador elemento, int posicion) {
        if (lista.contains(elemento)){
            lista.set(posicion, elemento);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(administrador elemento) {
           return lista.remove(elemento);
    }

    @Override
    public ArrayList<administrador> listar() {
           return  (ArrayList<administrador>) lista.clone();
    }

    @Override
    public ArrayList<administrador> consultar(String dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   @Override
    public administrador traer(String dato) {
        
        for (administrador admin : lista) {
            
            if (admin.getRFC() != null && admin.getRFC().equals(dato)) {
                return admin; 
            }
        }
        return null; 
    }
}
