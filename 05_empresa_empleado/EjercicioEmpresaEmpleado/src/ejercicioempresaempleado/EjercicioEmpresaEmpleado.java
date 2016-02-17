/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempresaempleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioEmpresaEmpleado {

    public static final int MAX_EMPRESAS = 10;
    public static final int MAX_EMPLEADOS = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Empresa[] empresas = new Empresa[MAX_EMPRESAS];
        int numEmpresas = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("1. Crear nueva empresa.\n"
                    + "2. Añadir empleado a empresa ya existente.\n"
                    + "3. Listado de empresas.\n"
                    + "4. Listado detallado de empresas y empleados.\n"
                    + "5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Nueva empresa
                    if (numEmpresas < MAX_EMPRESAS) {
                        Empresa e = new Empresa();

                        System.out.print("Nombre: ");
                        e.setNombre(br.readLine());
                        System.out.print("Año de fundación: ");
                        e.setAnyoFundacion(br.readLine());

                        empresas[numEmpresas] = e;
                        numEmpresas++;
                    } else {
                        System.out.println("ERROR: No caben más empresas...");
                    }
                    break;
                case 2:
                    // Nuevo empleado (asociado a una empresa)
                    if (numEmpresas > 0) {
                        for (int i = 0; i < numEmpresas; i++) {
                            System.out.println(i + empresas[i].getNombre());
                        }

                        System.out.print("Elige empresa: ");
                        int n = Integer.parseInt(br.readLine());

                        if (n < numEmpresas) {
                            Empleado ee = new Empleado();

                            System.out.print("Nombre: ");
                            ee.setNombre(br.readLine());
                            System.out.print("Apellidos: ");
                            ee.setApellidos(br.readLine());
                            System.out.print("Fecha nacimiento: ");
                            ee.setFechaNacimiento(br.readLine());
                            System.out.print("Fecha contrato: ");
                            ee.setFechaContrato(br.readLine());

                            //empresas[n].anyadirEmpleado(ee);                    
                            empresas[n].getEmpleados()[empresas[n].getNumEmpleados()] = ee;
                            empresas[n].setNumEmpleados(empresas[n].getNumEmpleados() + 1);
                        } else {
                            System.out.println("ERROR: Empresa incorrecta...");
                        }
                    } else {
                        System.out.println("ERROR: No hay empresas...");
                    }
                    break;
                case 3:
                    // Listado de empresas
                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println(empresas[i]);
                    }
                    break;
                case 4:
                    // Listado detallado de empresas y empleados
                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println(empresas[i]);
                        for (int j = 0; j < empresas[i].getNumEmpleados(); j++) {
                            System.out.println(empresas[i].getEmpleados()[j]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("INFO: Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opción incorrecta...");
            }

        } while (opcion != 5);

    }

}
