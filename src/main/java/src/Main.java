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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Bandeau monBandeau = new Bandeau();
       Senario senario = new Senario(monBandeau);
       
       senario.ajouteEffet(new Rotation(2, monBandeau, "tournicoti"));
       senario.ajouteEffet(new Zoom(2, monBandeau, "zoomicoti"));
       senario.ajouteEffet(new Clignote(2, monBandeau, "clignoticoti"));
       senario.jouerEffets();
       
       
    }
    
}
