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
    
    // Constante definida a nivel de clase
    public static final int MAX_ALUMNOS = 24;
    
    private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private int contador = 0; // Número de objetos en el array
    
    public Alumno buscarAlumno( String nombre ) {
        
        // Aquí dejaremos el alumno, si lo encontramos
        Alumno encontrado = null;
        
        int i = 0;

        // Recorrer hasta que se nos acaben los datos o lo encontremos
        while( i < contador && !alumnos[i].getNombre().equals(nombre) ) {
            i++;
        }

        // ¿Hemos parado antes del final? -> Encontrado
        if( i < contador )
        {
            // Copiamos su referencia para devolverla al programa principal
            encontrado = alumnos[i];
        }

        // Devolvemos el objeto. Si no hemos encontrado alumno, devolverá null
        return encontrado;
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
