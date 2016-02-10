/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotermostato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author widemos
 */
public class Termostato {
    
    private double temperaturaObjetivo;
    
    private Termometro termometro = new Termometro();
    private Calefactor calefactor;
    
    public void init() {
        // Pide al usuario la temperatura objetivo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Temperatura objetivo: ");
        try {
            temperaturaObjetivo = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Termostato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void run() {
    
        double temperaturaActual = termometro.getTemperatura();
    
        if( temperaturaActual < temperaturaObjetivo ) {
            calefactor.encender();

            while( temperaturaActual < temperaturaObjetivo ) { 
                System.out.format("Tª: %.4f\n",temperaturaActual);
                temperaturaActual += 1;
            }
            
            calefactor.apagar();
        }
    
    }
    
    public Termostato() {
        calefactor = new Calefactor();
    }
    
}
