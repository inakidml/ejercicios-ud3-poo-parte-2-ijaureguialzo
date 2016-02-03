/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Agenda agenda = new Agenda();

        String respuesta = null;

        do {

            // Crear el objeto Alumno
            Alumno a = new Alumno();

            // Rellenar el objeto Alumno
            System.out.print("Nombre: ");
            a.setNombre(br.readLine());
            System.out.print("Teléfono: ");
            a.setTelefono(br.readLine());
            System.out.print("Domicilio: ");
            a.setDomicilio(br.readLine());
            System.out.print("Fecha cumpleaños: ");
            a.setFechaCumple(br.readLine());

            // Guardar el objeto en el Ticket
            agenda.add(a);

            // ¿Continuar?
            System.out.print("¿Quiere añadir otro alumno? (s|n): ");
            respuesta = br.readLine();

        } while (agenda.totalAlumnos() < Agenda.MAX_ALUMNOS && respuesta.equalsIgnoreCase("s"));

        // Búsqueda lineal en el array de la primera ocurrencia
        System.out.print("Nombre a buscar: ");
        String nombre = br.readLine();

        // Si lo encontramos hay objeto, si no, null
        Alumno busqueda = agenda.buscarAlumno(nombre);

        if (busqueda != null) {
            System.out.println("Encontrado!!");
            System.out.println(busqueda);
        } else {
            System.out.println("NO encontrado...");
        }

    }

}
