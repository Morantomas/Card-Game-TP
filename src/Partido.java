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
    
    public boolean partidoTerminado()
    {
	boolean flag=false;
	
	for (Jugador iJugador : jugadores) ///Recorremos
	{
	    if (iJugador.getPoints()==10)
	    {
		flag=true;
	    }
	}
	
	return flag;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void addJugadores(){
        
        Jugador aux= new Jugador();
        jugadores.add(aux);
        
    }
    
    public Jugador getGanador()
    {
	Jugador ganador=null;
	
	for (Jugador iJugador : jugadores)
	{
	    if(iJugador.getPoints()==10)
		ganador=iJugador;
	}
	
	return ganador;
    }
    
    public ArrayList<Vuelta> getVueltas() {  // Add class "Vuelta"
        return vueltas;
    }
    
    private Partido()
    {
	
    }
    
    
    
   
}
