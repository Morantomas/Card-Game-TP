/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.themajor_card;

import java.util.ArrayList;

/**
 *
 * @author tomasmoran
 */
public class Partido {
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<vuelta> vueltas; // agregar Clase vuelta
    
    public boolean partido_terminado(){
        boolean finish=false;
        if( "jugador" == 10 points){ // Cuando un partido termina
        finish=true;
    }
        return finish;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void add_jugadores(){
        
        Jugador aux= new Jugador();
        jugadores.add(aux);
        
    }
    
    // public Jugador gGET.GANADOR(); ---> Falta objeto ganador
    
    public ArrayList<vuelta> getVueltas() {  // Add class "Vuelta"
        return vueltas;
    }
    
    private Partido(); // Constructor partido.
    
    
    
   
}
