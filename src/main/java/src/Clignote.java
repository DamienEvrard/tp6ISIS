/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author damie
 */
public class Clignote extends Effet{
    
    public Clignote(int rep, Bandeau band, String mess) {
        super(rep, band, mess);
    }

    @Override
    public void doSomething() {
        bandeau.setMessage(this.message);
        for(int r =0; r<this.repetition;r++){
            for(int i = 0;i<=10;i++ ){
                bandeau.setForeground(bandeau.getBackground());
                bandeau.sleep(100);
                bandeau.setForeground(Color.BLACK);
                bandeau.sleep(100);
            }
            
        }
        
    }
    
}
