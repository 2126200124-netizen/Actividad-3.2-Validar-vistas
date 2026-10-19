// Morones Torres Jorge Arnulfo
package edu.utj.dsm.poo.escuela.modelo;

/**
 * Clase que representa al administrativo
 * @author jorgi
 */
public class administrador extends Persona {
    private String turno;
    private String area;
    private int idAdministrador;

    
    public administrador(String nombre, String apellido, int edad, String telefono, String turno, String area) {
        super(nombre, apellido, edad, telefono);
        this.area = area;
        this.turno = turno;
        this.idAdministrador = 0;
    }

    /**
     * Obtiene el turno del administrativo
     * @return turno
     */
    public String getTurno(){
        return turno;
    }
    
    /**
     * Establece el turno del administrativo
     * @param turno 
     */
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    /**
     * Obtiene el area del administrativo
     * @return area
     */
    public String getArea(){
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    
    public int getidAdministrador(){
        return idAdministrador;
    }
    
    public void setidAdministrador(int idAdministrador){
        this.idAdministrador = idAdministrador;
    }
}
