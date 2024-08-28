/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramauml;

import java.util.ArrayList;

/**
 *
 * @author cdiaz
 */
public class DiagramaUml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Informacion de los Futbolistas
       int numFut1 = 16;
       String nomFut1= "Diego";
       String clubFut1 = "Cuervos";
       String posFut1= "delantero";
       
       int numFut2 = 14;
       String nomFut2= "Armando";
       String clubFut2 = "Cuervos";
       String posFut2= "defensa";
       
       int numFut3 = 16;
       String nomFut3= "Maradona";
       String clubFut3 = "Cuervos";
       String posFut3= "medio";
 
       //Crea 3 nuevos futbolistas
       Futbolista futbolista1 = new Futbolista(clubFut1, nomFut1, numFut1, posFut1);
       Futbolista futbolista2 = new Futbolista(clubFut2, nomFut2, numFut2, posFut2);
       Futbolista futbolista3 = new Futbolista(clubFut3, nomFut3, numFut3, posFut3);
       
       //Crea nueva lista de Futbolistas
       ArrayList<Futbolista> listaFutbolista= new ArrayList<>();
       
       // agregar a los tres futbolistas
       listaFutbolista.add( futbolista1);
       listaFutbolista.add( futbolista2);
       listaFutbolista.add(futbolista3);
       
       //informacion de la seleccion
       int id =1;
       String nombreDeSeleccion = "cuervos";
       
       // creacion de nueva seleccion 
       SeleccionFutbol nuevaSeleccion = new SeleccionFutbol(id, nombreDeSeleccion, listaFutbolista);
       
       //mostrar los elementos de nuevaSeleccion
        System.out.println("El id de Seleccion es "+nuevaSeleccion.getId());
        System.out.println("La seleccion es "+nuevaSeleccion.getNomSeleccion());
        //Lammar el arrayList
        ArrayList<Futbolista> nuevaSeleccionArray = new ArrayList<>();
        nuevaSeleccionArray = nuevaSeleccion.getListaFutbolista();
        int contador = 1;
        
       for(Futbolista futbolistaArray: nuevaSeleccionArray){
        System.out.println("El nombre del futbolista" +contador +" es "+futbolistaArray.getNombre());
        System.out.println("Su posicion es "+futbolistaArray.getPosicion());
        System.out.println("El nombre del Club es "+futbolistaArray.getNombreDelClub());
        System.out.println("Su numero de Playera es "+futbolistaArray.getNumPlayera());
        contador++;
       }
    }
    
}
