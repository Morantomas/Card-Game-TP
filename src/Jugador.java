/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.themajor_card;

/**
 *
 * @author tomasmoran
 */
public class Jugador {
    
    private String name;
    private int points;
    private Carta card;
    
    public void Set_card(Carta aux){
        card=aux;
    }
    
    public Carta getCard() {
        return card;
    }
    
    public void sumar1punto(){
        points+=1;
    }
    
    public int getPoints() {
        return points;
    }
    
    public Carta devolver_cartas(){ // Aiuda
        return card;
    }
    
    public void player(String name){
        this.name=name;
    }
    
    public String getName() {
        return name;
    }
    
    
}
