/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioAlumnoAsignatura {

    public static final boolean DEBUG = false;

    public static final int MAX_ALUMNOS = 100;
    public static final int MAX_ASIGNATURAS = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
        Asignatura[] asignaturas = new Asignatura[MAX_ASIGNATURAS];

        int numAlumnos = 0;
        int numAsignaturas = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Objetos de prueba
        if (DEBUG) {
            Alumno a1 = new Alumno("Luis", "No se", "luis@ikasle.egibide.org");
            Alumno a2 = new Alumno("María", "Tampoco se", "maria@ikasle.egibide.org");
            Alumno a3 = new Alumno("Laura", "Sigo sin saber", "laura@ikasle.egibide.org");

            alumnos[0] = a1;
            alumnos[1] = a2;
            alumnos[2] = a3;

            numAlumnos = 3;

            Asignatura as1 = new Asignatura("Matemáticas", 8);
            Asignatura as2 = new Asignatura("Física", 5);

            asignaturas[0] = as1;
            asignaturas[1] = as2;

            numAsignaturas = 2;

            // Rojo (diagrama en Evernote)
            a1.matricularEn(as1);
            a2.matricularEn(as1);
            a3.matricularEn(as1);

            as1.matricular(a1);
            as1.matricular(a2);
            as1.matricular(a3);

            // Verde
            a2.matricularEn(as2);
            a3.matricularEn(as2);

            as2.matricular(a2);
            as2.matricular(a3);
        }
        // Menú        
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. Crear nuevo alumno.\n"
                    + "2. Crear nueva asignatura.\n"
                    + "3. Matricular alumno en asignatura.\n"
                    + "4. Listado de alumnos matriculados en una asignatura.\n"
                    + "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n"
                    + "6. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    // Nuevo alumno

                    if (numAlumnos < MAX_ALUMNOS) {

                        // Crear objeto
                        Alumno a = new Alumno();

                        // Rellenar objeto
                        System.out.print("Nombre: ");
                        a.setNombre(br.readLine());
                        System.out.print("Apellidos: ");
                        a.setApellidos(br.readLine());
                        System.out.print("Email: ");
                        a.setEmail(br.readLine());

                        // Almacenar objeto
                        alumnos[numAlumnos] = a;
                        numAlumnos += 1;
                    } else {
                        System.out.println("ERROR: No caben más alumnos...");
                    }

                    break;
                case 2:
                    // Nueva asignatura

                    if (numAsignaturas < MAX_ASIGNATURAS) {
                        // Crear objeto
                        Asignatura as = new Asignatura();

                        // Rellenar objeto
                        System.out.print("Nombre: ");
                        as.setNombre(br.readLine());
                        System.out.print("Horas/semana: ");
                        as.setHorasSemanales(Integer.parseInt(br.readLine()));

                        // Almacenar objeto
                        asignaturas[numAsignaturas] = as;
                        numAsignaturas++;
                    } else {
                        System.out.println("ERROR: No caben más asignaturas...");
                    }
                    break;
                case 3:
                    // Matricular alumno en asignatura

                    // Elegir alumno
                    System.out.println("Alumnos");
                    for (int i = 0; i < numAlumnos; i++) {
                        System.out.println((i + 1) + ". " + alumnos[i]);
                    }
                    System.out.print("Selecciona alumno: ");
                    int alumnoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                    // Elegir asignatura
                    System.out.println("Asignaturas");
                    for (int i = 0; i < numAsignaturas; i++) {
                        System.out.println((i + 1) + ". " + asignaturas[i]);
                    }
                    System.out.print("Selecciona asignatura: ");
                    int asignaturaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    // ¡¡¡Matricula!!!
                    Asignatura asignatura = asignaturas[asignaturaSeleccionada];
                    Alumno alumno = alumnos[alumnoSeleccionado];

                    if (alumno.matricularEn(asignatura)) {
                        System.out.println("INFO: Alumno matriculado en asignatura correctamente...");

                        if (asignatura.matricular(alumno)) {
                            System.out.println("INFO: El alumno se ha matriculado correctamente...");
                        } else {
                            System.out.println("ERROR: No se ha podido hacer la matrícula en la asignatura...");
                        }

                    } else {
                        System.out.println("ERROR: No se ha podido matricular al alumno en la asignatura...");
                    }

                    break;
                case 4:
                    // Listar alumnos matriculados en una asignatura

                    // Elegir asignatura
                    System.out.println("Asignaturas");
                    for (int i = 0; i < numAsignaturas; i++) {
                        System.out.println((i + 1) + ". " + asignaturas[i]);
                    }
                    System.out.print("Selecciona asignatura: ");
                    asignaturaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    // Listar
                    asignaturas[asignaturaSeleccionada].listadoAlumnos();

                    break;
                case 5:
                    // Listar las asignaturas en las que está matriculado un alumno
                    // + total de horas

                    // Elegir alumno
                    System.out.println("Alumnos");
                    for (int i = 0; i < numAlumnos; i++) {
                        System.out.println((i + 1) + ". " + alumnos[i]);
                    }
                    System.out.print("Selecciona alumno: ");
                    alumnoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                    // Listado                    
                    alumnos[alumnoSeleccionado].listadoAsignaturas();

                    break;
                case 6:
                    System.out.println("¯\\_(ツ)_/¯");
                    break;
                default:
                    System.out.println("ERROR: Opción incorrecta...");
            }

        } while (opcion != 6);
    }

}
