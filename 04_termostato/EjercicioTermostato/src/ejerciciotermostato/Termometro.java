/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotermostato;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class Termometro {
    
    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return new Random().nextDouble()*35-5;
    }
    
}
