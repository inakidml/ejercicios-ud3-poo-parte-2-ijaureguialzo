/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuentabancaria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author widemos
 */
public class CuentaBancaria {

    private String codigoCuenta;

    private Titular[] titulares = new Titular[EjercicioCuentaBancaria.MAX_TITULARES];
    private int numTitulares = 0;

    public void add(Titular t) {
        titulares[numTitulares] = t;
        numTitulares++;
    }

    private Apunte[] apuntes = new Apunte[EjercicioCuentaBancaria.MAX_APUNTES];
    private int numApuntes = 0;

    public double calcularSaldo() {

        double saldo = 0;

        for (int i = 0; i < numApuntes; i++) {
            saldo += apuntes[i].getCantidad();
        }

        return saldo;
    }

    public void nuevoApunte(double cantidad) {

        Apunte a = new Apunte();

        a.setCantidad(cantidad);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        a.setFecha(dateFormat.format(date));

        // 3
        apuntes[numApuntes] = a;

        // 4 
        a.setCuenta(this);

        numApuntes += 1;
    }

    public void listadoTitulares() {
        for (int i = 0; i < numTitulares; i++) {
            System.out.println(titulares[i]);
        }
    }

    public void borrarTitulares() {
        for (int i = 0; i < numTitulares; i++) {
            titulares[i].remove(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "codigoCuenta=" + codigoCuenta + '}';
    }

    /**
     * @return the codigoCuenta
     */
    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    /**
     * @param codigoCuenta the codigoCuenta to set
     */
    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

}
