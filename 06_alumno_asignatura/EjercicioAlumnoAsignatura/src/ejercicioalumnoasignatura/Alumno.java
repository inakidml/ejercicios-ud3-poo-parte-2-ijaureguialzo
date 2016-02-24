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
public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;

    private Asignatura[] asignaturas = new Asignatura[EjercicioAlumnoAsignatura.MAX_ASIGNATURAS];
    int numAsignaturas = 0;

    public boolean matricularEn(Asignatura a) {
        if (numAsignaturas < EjercicioAlumnoAsignatura.MAX_ASIGNATURAS) {
            asignaturas[numAsignaturas] = a;
            numAsignaturas++;

            return true;
        } else {
            return false;
        }
    }

    public void listadoAsignaturas() {
        int horas = 0;

        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println(asignaturas[i]);

            horas += asignaturas[i].getHorasSemanales();
        }

        System.out.println("Total de horas: " + horas);
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
