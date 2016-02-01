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

    private LineaTicket[] lineas = new LineaTicket[EjercicioTicket.MAX_LINEAS];

    private int numLineas = 0;

    public void add(LineaTicket l) {
        // Copiar la referencia en el array del Ticket
        lineas[getNumLineas()] = l;

        // Uno más
        numLineas++;
    }

    public double total() {
        
        double total = 0;

        for (int i = 0; i < numLineas; i++) {
            total += lineas[i].total();            
        }

        return total;
    }

    public void listado() {
        // Mostrar todas las líneas del Ticket
        System.out.println("PRODUCTO    CANTIDAD    TOTAL");
        for (int i = 0; i < numLineas; i++) {
            System.out.format("%12s %6sx%s %6s\n",
                    lineas[i].getProducto(),
                    lineas[i].getCantidad(),
                    lineas[i].getPrecio(),
                    lineas[i].total());
        }
    }


    /**
     * @return the numLineas
     */
    public int getNumLineas() {
        return numLineas;
    }

}
