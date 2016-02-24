/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumnoasignatura;

/**
 *
 * @author widemos
 */
public class Asignatura {

    private String nombre;
    private int horasSemanales;

    private Alumno[] alumnos = new Alumno[EjercicioAlumnoAsignatura.MAX_ALUMNOS];
    int numAlumnos = 0;

    public boolean matricular(Alumno a) {
        if (numAlumnos < EjercicioAlumnoAsignatura.MAX_ALUMNOS) {
            alumnos[numAlumnos] = a;
            numAlumnos++;

            return true;
        } else {
            return false;
        }
    }

    public void listadoAlumnos() {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(alumnos[i]);
        }
    }

    public Asignatura() {
    }

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", horasSemanales=" + horasSemanales + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the horasSemanales
     */
    public int getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * @param horasSemanales the horasSemanales to set
     */
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

}
