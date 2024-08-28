/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramauml;

/**
 *
 * @author cdiaz
 */
public class Club implements Entrenamientos {
    public String nombreDelClub;
    public int cantidadDeIntegrantes;

    public Club(String nombreDelClub) {
        this.nombreDelClub = nombreDelClub;
    }

    public String getNombreDelClub() {
        return nombreDelClub;
    }

    public int getCantidadDeIntegrantes() {
        return cantidadDeIntegrantes;
    }

    public void setNombreDelClub(String nombreDelClub) {
        this.nombreDelClub = nombreDelClub;
    }

    public void setCantidadDeIntegrantes(int cantidadDeIntegrantes) {
        this.cantidadDeIntegrantes = cantidadDeIntegrantes;
    }

    @Override
    public void entrenar(String velocidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void entrenar(String velocidad, String fuerza) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
