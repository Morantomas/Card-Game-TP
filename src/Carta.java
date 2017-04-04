/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasmoran
 */
public class Carta {
    
    private String palo;
    private int number;
    
    public String getpalo(){
        return palo;
    }
    
    public int getnumber(){
        return number;
    }
    
    @Override
    public String toString(){
        return "Carta[Palo=" +palo+ "Number="+number+"]";
    }
    
    public Carta(){
        palo="espada";
        number=5;
    }
    
    
    
    
    
    
    
    
    
}
