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
public class Rotation extends Effet{
    
    public Rotation(int rep, Bandeau band, String mess) {
        super(rep, band, mess);
    }

    @Override
    public void doSomething() {
        bandeau.setMessage(this.message);
        for(int r = 0; r<this.repetition;r++){
            for (int i = 0; i <= 100; i++) {
                    bandeau.setRotation(2*Math.PI*i / 100);
                    bandeau.sleep(25);
            }
        }
    }
    
}
