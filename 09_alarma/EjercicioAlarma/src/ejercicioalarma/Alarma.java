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
public class Alarma {

    private int PIN;
    private boolean activada = false;
    private int telefonoAviso;

    private int contadorIntentos = 0;

    private Sensor[] sensores = new Sensor[EjercicioAlarma.MAX_SENSORES];
    private int numSensores = 0;

    public Alarma() {

        Random r = new Random();
        numSensores = r.nextInt(5) + 1;

        for (int i = 0; i < numSensores; i++) {
            sensores[i] = new Sensor();
        }

        // Generar PIN de 4 dígitos
        PIN = r.nextInt(10000);
        System.out.format("PIN: %04d\n", PIN);
    }

    public void consultarSensores() {
        if (activada == true) {
            for (int i = 0; i < numSensores; i++) {
                if (sensores[i].hayMovimiento()) {
                    // ALARMA!!!!!!
                    System.out.println("ALARMA!!! Llamando al teléfono " + telefonoAviso + "...");
                    System.out.println("El sensor activo es el " + (i + 1));
                } else {
                    // Aquí no hay nada que ver.                
                }
            }
        }
    }

    public void activar() {
        activada = true;
    }

    public void desactivar(int PIN) {
        if (PIN == this.PIN) {
            activada = false;
            System.out.println("INFO: Alarma desactivada...");
            contadorIntentos = 0;
        } else {
            System.out.println("ERROR: Código erróneo...");
            contadorIntentos += 1;

            if (contadorIntentos >= 3) {
                System.out.println("ALARMA!!!!");
            }
        }
    }

    /**
     * @return the telefonoAviso
     */
    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    /**
     * @param telefonoAviso the telefonoAviso to set
     */
    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }

}
