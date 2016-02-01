/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioticket;

/**
 *
 * @author widemos
 */
public class Ticket {

    private LineaTicket[] lineas = new LineaTicket[10];

    private int numLineas = 0;

    public void add(LineaTicket l) {
        // Copiar la referencia en el array del Ticket
        lineas[getNumLineas()] = l;

        // Uno más
        numLineas++;
    }

    public double total() {
        return 0;
    }

    public void listado() {

    }

    /**
     * @return the lineas
     */
    public LineaTicket[] getLineas() {
        return lineas;
    }

    /**
     * @return the numLineas
     */
    public int getNumLineas() {
        return numLineas;
    }

}
