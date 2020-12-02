/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author damie
 */
public class Senario {
    
    private ArrayList<Effet> listeEffets;
    private Bandeau bandeau;
    
    public Senario(Bandeau band){
        this.listeEffets = new ArrayList<>();
        this.bandeau=band;
        
    }
    
    public void jouerEffets(){
        for(Effet e:listeEffets){
           e.doSomething();
           bandeau.sleep(1000);
       }
    }
    
    public void ajouteEffet(Effet eff){
        
        this.listeEffets.add(eff); 
    }
    
    
}
