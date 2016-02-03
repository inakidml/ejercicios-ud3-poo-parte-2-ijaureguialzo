/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleados;

/**
 *
 * @author widemos
 */
public class Empresa {

    public static final int MAX_EMPLEADOS = 40;

    private Empleado[] empleados = new Empleado[MAX_EMPLEADOS];
    private int numEmpleados = 0;

    /**
     * Este método añade un objeto de tipo Empleado a la Empresa.
     *
     * @param e El empleado que queremos añadir.
     * @return Devuelve true si se ha podido añadir, false en caso contrario.
     *
     */
    public boolean add(Empleado e) {
        if (numEmpleados < MAX_EMPLEADOS) {
            empleados[numEmpleados] = e;
            numEmpleados++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Buscamos los empleados que más tiempo llevan en la empresa.
     *
     *
     * @return Array con los empleados que más tiempo llevan.
     */
    public Empleado[] buscarMasAntiguos() {

        // Array para guardar los empleados que más tiempo llevan
        Empleado[] lista = new Empleado[MAX_EMPLEADOS];
        int recuento = 0;

        // Encontrar el valor máximo
        int max = 0;
        if (empleados[0] != null) {
            max = empleados[0].getDias();
        }

        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getDias() > max) {
                max = empleados[i].getDias();
            }
        }

        // Buscar los objetos que tengan como dias a max
        for (int i = 0; i < numEmpleados; i++) {
            if( empleados[i].getDias() == max ) {
                // Hay que añadirlo a la lista para devolver
                lista[recuento] = empleados[i];
                recuento++;
            }
        }
        
        // Devolver el resultado
        return lista;
    }

}
