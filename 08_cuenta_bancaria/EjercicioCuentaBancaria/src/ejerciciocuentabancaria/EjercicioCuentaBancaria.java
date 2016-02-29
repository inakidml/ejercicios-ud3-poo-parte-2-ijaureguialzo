/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuentabancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioCuentaBancaria {

    public static final int MAX_TITULARES = 1000;
    public static final int MAX_CUENTAS = 1000;
    public static final int MAX_APUNTES = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        Titular[] titulares = new Titular[MAX_TITULARES];
        int numTitulares = 0;

        CuentaBancaria[] cuentas = new CuentaBancaria[MAX_CUENTAS];
        int numCuentas = 0;

        do {

            System.out.println("1. Titular\n"
                    + "11. Nuevo titular\n"
                    + "2. Cuenta bancaria\n"
                    + "21. Nueva cuenta\n"
                    + "22. Nuevo apunte\n"
                    + "23. Borrar cuenta\n"
                    + "3. Consultas\n"
                    + "31. Dado un titular, saldo de todas sus cuentas\n"
                    + "32. Dada una cuenta, titulares asociados\n"
                    + "4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 11:
                    // Nuevo titular

                    Titular t = new Titular();

                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    t.setApellidos(br.readLine());
                    System.out.print("DNI: ");
                    t.setDNI(br.readLine());
                    System.out.print("Fecha de alta: ");
                    t.setFechaAlta(br.readLine());

                    titulares[numTitulares] = t;

                    numTitulares++;

                    break;
                case 21:
                    // Nueva cuenta

                    CuentaBancaria c = new CuentaBancaria();

                    System.out.print("Código de cuenta: ");
                    c.setCodigoCuenta(br.readLine());

                    cuentas[numCuentas] = c;
                    numCuentas++;

                    for (int i = 0; i < numTitulares; i++) {
                        System.out.println((i + 1) + ". " + titulares[i]);
                    }

                    System.out.print("Elige: ");
                    int titularSeleccionado = Integer.parseInt(br.readLine()) - 1;

                    // 1
                    c.add(titulares[titularSeleccionado]);

                    // 2
                    titulares[titularSeleccionado].add(c);

                    break;
                case 22:
                    // Nuevo apunte

                    for (int i = 0; i < numCuentas; i++) {
                        System.out.println((i + 1) + ". " + cuentas[i]);
                    }

                    System.out.print("Elige: ");
                    int cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    System.out.print("Cantidad: ");
                    double cantidad = Double.parseDouble(br.readLine());

                    cuentas[cuentaSeleccionada].nuevoApunte(cantidad);

                    break;
                case 23:
                    // Borrar cuenta

                    for (int i = 0; i < numCuentas; i++) {
                        System.out.println((i + 1) + ". " + cuentas[i]);
                    }

                    System.out.print("Elige: ");
                    cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    // 5
                    cuentas[cuentaSeleccionada].borrarTitulares();

                    // 6
                    for (int i = cuentaSeleccionada; i < numCuentas - 1; i++) {
                        cuentas[i] = cuentas[i + 1];
                    }

                    if (numCuentas == MAX_CUENTAS) {
                        cuentas[MAX_CUENTAS - 1] = null;
                    }

                    numCuentas--;

                    break;
                case 31:
                    // Dado titular, saldo de cuentas
                    for (int i = 0; i < numTitulares; i++) {
                        System.out.println((i + 1) + ". " + titulares[i]);
                    }

                    System.out.print("Elige: ");
                    titularSeleccionado = Integer.parseInt(br.readLine()) - 1;

                    titulares[titularSeleccionado].listadoPosiciones();

                    break;
                case 32:
                    // Dada cuenta, titulares
                    for (int i = 0; i < numCuentas; i++) {
                        System.out.println((i + 1) + ". " + cuentas[i]);
                    }

                    System.out.print("Elige: ");
                    cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    cuentas[cuentaSeleccionada].listadoTitulares();

                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR: Opción incorrecta...");
            }

        } while (opcion != 4);

    }

}
