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
public class EjercicioEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Nueva empresa
        Empresa empresa = new Empresa();
        
        // Empleados de prueba
        Empleado e = new Empleado("Pepe","23764672354",10);
        empresa.add(e);
        e = new Empleado("Luis","34232",40);
        empresa.add(e);
        e = new Empleado("María","4534534534",40);
        empresa.add(e);
        e = new Empleado("Manuel","345345345345",30);
        empresa.add(e);

        Empleado[] masAntiguos = empresa.buscarMasAntiguos();
        
    }
    
}
