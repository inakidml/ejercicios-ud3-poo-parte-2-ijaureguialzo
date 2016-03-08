/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalarma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioAlarma {

    public static final int MAX_SENSORES = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Alarma alarma = new Alarma();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        Boolean mostrarMenu=true;

        do {
            opcion=0;
            if (mostrarMenu) {
                System.out.println("1. Activar alarma\n"
                    + "2. Desactivar alarma (necesario PIN)\n"
                    + "3. Consultar sensores\n"
                    + "4. Salir");
            System.out.print("Opción: ");
            mostrarMenu=false;
            }
            
            if (System.in.available()>0) {//si hay dato lee
             opcion = Integer.parseInt(br.readLine());
            }
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    // Pedir el teléfono de aviso
                    System.out.print("Escribe el teléfono de aviso: ");
                    int telefono = Integer.parseInt(br.readLine());

                    alarma.setTelefonoAviso(telefono);

                    // Activar la alarma
                    alarma.activar();
                    mostrarMenu=true;
                    break;
                case 2:
                    System.out.print("Escribe el PIN: ");
                    int PIN = Integer.parseInt(br.readLine());

                    alarma.desactivar(PIN);
                    mostrarMenu=true;
                    break;
                case 3:
                    alarma.consultarSensores();
                    mostrarMenu=true;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR: Opción incorrecta...");
            }
            
        } while (opcion != 4);

    }

}
