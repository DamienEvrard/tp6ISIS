/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bandeau.Bandeau;

/**
 *
 * @author damie
 */
public abstract class Effet {
    
    public int repetition;
    public String message;
    Bandeau bandeau;
    
    public Effet(int rep, Bandeau band, String mess){
        this.repetition = rep;
        this.bandeau=band;
        this.message=mess;
    }
    
    public abstract void doSomething();
    
}
    

