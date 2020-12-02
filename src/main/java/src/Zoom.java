/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author damie
 */
public class Zoom extends Effet{
    
    public Zoom(int rep, Bandeau band, String mess) {
        super(rep, band, mess);
    }

    @Override
    public void doSomething() {
        bandeau.setMessage(this.message);
        for(int r =0; r<this.repetition;r++){
            for (int i = 5; i < 60 ; i+=5) {
                    bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
                    bandeau.sleep(50);
            }
        }
        
    }
    
}
