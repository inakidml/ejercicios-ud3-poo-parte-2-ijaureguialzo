/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalarma;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class Sensor {

    private int umbral;

    public Sensor() {
        Random r = new Random();
        umbral = r.nextInt(100) + 1;
    }

    public boolean hayMovimiento() {
        Random r = new Random();
        int n = r.nextInt(100) + 1;

        return n > umbral;
    }

}
