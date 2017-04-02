
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alien
 */
public class Vuelta
{
    private HashMap<Jugador,Carta> vuelta;
    
    public void addMano(Jugador jugador, Carta carta)
    {
	vuelta.put(jugador, carta);
    }
    
    public Carta cartaDelJugador(Jugador jugador)
    {
	return vuelta.get(jugador);
    }
    
}
