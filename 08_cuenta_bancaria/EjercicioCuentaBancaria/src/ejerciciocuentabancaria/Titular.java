/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuentabancaria;

/**
 *
 * @author widemos
 */
public class Titular {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String fechaAlta;

    private CuentaBancaria[] cuentas = new CuentaBancaria[EjercicioCuentaBancaria.MAX_CUENTAS];
    private int numCuentas = 0;

    public void add(CuentaBancaria c) {
        cuentas[numCuentas] = c;
        numCuentas++;
    }

    public void remove(CuentaBancaria c) {

        int j = 0;
        while (j < numCuentas && cuentas[j] != c) {
            j++;
        }

        if (j < numCuentas) {
            // Encontrado! A borrar!

            for (int i = j; i < numCuentas - 1; i++) {
                cuentas[i] = cuentas[i + 1];
            }

            if (numCuentas == EjercicioCuentaBancaria.MAX_CUENTAS) {
                cuentas[EjercicioCuentaBancaria.MAX_CUENTAS - 1] = null;
            }

            numCuentas -= 1;
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", fechaAlta=" + fechaAlta + '}';
    }

    public void listadoPosiciones() {
        for (int i = 0; i < numCuentas; i++) {
            System.out.println(cuentas[i]);
            System.out.println("  Saldo: " + cuentas[i].calcularSaldo());
        }
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
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the fechaAlta
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

}
