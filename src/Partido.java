/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author tomasmoran
 */
public class Partido {

    private ArrayList<Jugador> jugadores;
    private ArrayList<Vuelta> vueltas;

    public boolean partido_terminado() {
        boolean finish = false;
        
        
        
        return finish;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void add_jugadores() {

        Jugador aux = new Jugador();
        jugadores.add(aux);

    }

    // public Jugador GET.GANADOR(); ---> Falta objeto ganador
    public ArrayList<Vuelta> getVueltas() {  // Add class "Vuelta"
        return vueltas;
    }

    private Partido(); // Constructor partido.

}
