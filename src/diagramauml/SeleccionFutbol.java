/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramauml;
import java.util.ArrayList;
/**
 *
 * @author cdiaz
 */
public class SeleccionFutbol {
    protected int id;
    protected String nomSeleccion;
    private ArrayList<Futbolista> listaFutbolista= new ArrayList<>();
    
    public SeleccionFutbol(int id, String nomSeleccion, ArrayList<Futbolista> listaFutbolista) {
        this.id = id;
        this.nomSeleccion = nomSeleccion;
        this.listaFutbolista=listaFutbolista;
        
    }

    public int getId() {
        return id;
    }

    public String getNomSeleccion() {
        return nomSeleccion;
    }

    public ArrayList<Futbolista> getListaFutbolista() {
        return listaFutbolista;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNomSeleccion(String nomSeleccion) {
        this.nomSeleccion = nomSeleccion;
    }

    public void setListaFutbolista(ArrayList<Futbolista> listaFutbolista) {
        this.listaFutbolista = listaFutbolista;
    }
    
    
}
