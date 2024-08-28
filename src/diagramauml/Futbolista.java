/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramauml;

/**
 *
 * @author cdiaz
 */
public class Futbolista extends Club {
    public String nombre;
    public int numPlayera;
    private String posicion;

    public Futbolista(String nombreDelClub, String nombre, int numPlayera, String posicion) {
        super(nombreDelClub);
        this.nombre=nombre;
        this.numPlayera=numPlayera;
        this.posicion=posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlayera() {
        return numPlayera;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPlayera(int numPlayera) {
        this.numPlayera = numPlayera;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}
