

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alien
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class BarajaEspañola
{
    private Stack <Carta> enJuego;
    private ArrayList <Carta> descarte; 
    
 
    
    public BarajaEspañola()
    {
	
    }
    
    public void mezclar()
    {
	Collections.shuffle(descarte); ///Se mezcla el descarte
	
	for(int i=0;i<descarte.size();i++) ///Ver For Each
	{
	    enJuego.push(descarte.get(i));
            
	}
	
	descarte.clear();
	
    }
    
    public Carta darLaCartaDeArriba()
    {
	return enJuego.pop(); //Hay que manejar la excepción de que la Pila podría estar vacía
    }
    
    public void guardarCartaUsada(Carta carta)
    {
	descarte.add(carta);
    }
    
    public boolean hayCartas()
    {
	return !enJuego.isEmpty();
    }
    
    
}
