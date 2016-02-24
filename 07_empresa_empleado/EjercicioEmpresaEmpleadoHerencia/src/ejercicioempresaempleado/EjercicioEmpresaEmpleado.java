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

            System.out.println("1. Empresa\n"
                    + "  11. Crear nueva empresa\n"
                    + "  12. Borrar una empresa\n"
                    + "2. Añadir empleados (a una empresa)\n"
                    + "  21. Añadir operario\n"
                    + "  22. Añadir directivo\n"
                    + "  23. Listar empleados (de la empresa)\n"
                    + "3. Listados\n"
                    + "  31. Todas las empresas\n"
                    + "  32. Todos los empleados\n"
                    + "  33. Listado por empresa y empleado\n"
                    + "4. Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 11:
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
                case 12:
                    // TODO - Borrar una empresa 
                    break;
                case 21:
                    // Añadir un operario
                    if (numEmpresas > 0) {

                        // Elegir empresa
                        for (int i = 0; i < numEmpresas; i++) {
                            System.out.println((i + 1) + ". " + empresas[i].getNombre());
                        }

                        System.out.print("Elige empresa: ");
                        int n = Integer.parseInt(br.readLine()) - 1;

                        if (n < numEmpresas) {

                            Operario o = new Operario();

                            System.out.print("Nombre: ");
                            o.setNombre(br.readLine());
                            System.out.print("Apellidos: ");
                            o.setApellidos(br.readLine());
                            System.out.print("Fecha nacimiento: ");
                            o.setFechaNacimiento(br.readLine());
                            System.out.print("Fecha contrato: ");
                            o.setFechaContrato(br.readLine());

                            System.out.print("Salario/hora: ");
                            o.setSalarioHora(Double.parseDouble(br.readLine()));
                            System.out.print("Horas de contrato: ");
                            o.setHorasContrato(Integer.parseInt(br.readLine()));

                            empresas[n].anyadirEmpleado(o);

                        } else {
                            System.out.println("ERROR: Empresa incorrecta...");
                        }
                    } else {
                        System.out.println("ERROR: No hay empresas...");
                    }
                    break;
                case 22:
                    // Añadir un directivo
                    if (numEmpresas > 0) {

                        // Elegir empresa
                        for (int i = 0; i < numEmpresas; i++) {
                            System.out.println((i + 1) + ". " + empresas[i].getNombre());
                        }

                        System.out.print("Elige empresa: ");
                        int n = Integer.parseInt(br.readLine()) - 1;

                        if (n < numEmpresas) {

                            Directivo d = new Directivo();

                            System.out.print("Nombre: ");
                            d.setNombre(br.readLine());
                            System.out.print("Apellidos: ");
                            d.setApellidos(br.readLine());
                            System.out.print("Fecha nacimiento: ");
                            d.setFechaNacimiento(br.readLine());
                            System.out.print("Fecha contrato: ");
                            d.setFechaContrato(br.readLine());

                            System.out.print("Salario anual: ");
                            d.setSalarioAnual(Double.parseDouble(br.readLine()));
                            System.out.print("Bonus personal: ");
                            d.setBonusPersonal(Double.parseDouble(br.readLine()));

                            empresas[n].anyadirEmpleado(d);

                        } else {
                            System.out.println("ERROR: Empresa incorrecta...");
                        }
                    } else {
                        System.out.println("ERROR: No hay empresas...");
                    }
                    break;
                case 23:
                    // Listado de empleado de una empresa
                    if (numEmpresas > 0) {

                        // Elegir empresa
                        for (int i = 0; i < numEmpresas; i++) {
                            System.out.println((i + 1) + ". " + empresas[i].getNombre());
                        }

                        System.out.print("Elige empresa: ");
                        int n = Integer.parseInt(br.readLine()) - 1;

                        empresas[n].listadoEmpleados();
                    }
                    break;
                case 31:
                    // Listado de empresas
                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println(empresas[i]);
                    }
                    break;
                case 32:
                    // Listado de todos los empleados
                    for (int i = 0; i < numEmpresas; i++) {
                        empresas[i].listadoEmpleados();
                    }
                    break;
                case 33:
                    // Listado detallado de empresas y empleados
                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println(empresas[i]);
                        empresas[i].listadoEmpleados();
                    }
                    break;
                case 4:
                    System.out.println("INFO: Saliendo...");
                    break;
                default:
                    System.out.println("ERROR: Opción incorrecta...");
            }

        } while (opcion != 4);

    }

}
