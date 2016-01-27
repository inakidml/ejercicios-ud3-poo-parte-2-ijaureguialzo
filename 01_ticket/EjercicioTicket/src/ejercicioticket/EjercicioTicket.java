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
public class EjercicioTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ticket t = new Ticket();
        
        LineaTicket l = new LineaTicket();
        l.setProducto("Patatas");
        l.setPrecio(0.90);
        l.setCantidad(5);
        
        t.getLineas()[0] = l;
        
        l = new LineaTicket();
        l.setProducto("Tomates");
        l.setPrecio(0.5);
        l.setCantidad(2);
        
        LineaTicket[] lineas = t.getLineas();
        lineas[1] = l;

    }
    
}
