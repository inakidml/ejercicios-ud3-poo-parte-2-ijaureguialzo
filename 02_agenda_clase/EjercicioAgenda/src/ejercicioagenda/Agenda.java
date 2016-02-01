/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagenda;

/**
 *
 * @author widemos
 */
public class Agenda {
    
    public static final int MAX_ALUMNOS = 24;
    
    private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private int contador = 0;
    
    public Alumno buscarAlumno( String nombre ) {
        return null;
    }
    
    public void add( Alumno alumno ) {        
        alumnos[contador] = alumno;
        contador++;
    }

    /**
     * @return the contador
     */
    public int totalAlumnos() {
        return contador;
    }

    
}
