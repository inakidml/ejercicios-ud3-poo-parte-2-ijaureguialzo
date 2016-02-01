/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Ticket t = new Ticket();

        String respuesta = null;

        do {

            // Crear el objeto LineaTicket
            LineaTicket l = new LineaTicket();

            // Rellenar la LineaTicket
            System.out.print("Producto: ");
            l.setProducto(br.readLine());
            System.out.print("Precio: ");
            l.setPrecio(Double.parseDouble(br.readLine()));
            System.out.print("Cantidad: ");
            l.setCantidad(Integer.parseInt(br.readLine()));

            // Guardar el objeto en el Ticket
            t.add(l);
            
            // ¿Continuar?
            System.out.print("¿Quiere añadir otro producto? (s|n): ");
            respuesta = br.readLine();

        } while (t.getNumLineas() < 10 && respuesta.equalsIgnoreCase("s") );

        
        double total = 0;
        
        // Mostrar todas las líneas del Ticket
        System.out.println("PRODUCTO    CANTIDAD    TOTAL");
        for (int i = 0; i < t.getNumLineas(); i++) {
            System.out.format("%12s %6sx%s %6s\n",
                    t.getLineas()[i].getProducto(),
                    t.getLineas()[i].getCantidad(),
                    t.getLineas()[i].getPrecio(),
                    t.getLineas()[i].total());

            total += t.getLineas()[i].total();
        }
        System.out.println("TOTAL: "+total);
        
    }

}
