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

        int numLineas = 0;
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

            // Copiar la referencia en el array del Ticket
            t.getLineas()[numLineas] = l;

            // Uno más
            numLineas++;
            
            // ¿Continuar?
            System.out.print("¿Quiere añadir otro producto? (s|n): ");
            respuesta = br.readLine();

        } while (numLineas < 10 && respuesta.equalsIgnoreCase("s") );

        
        double total = 0;
        
        // Mostrar todas las líneas del Ticket
        System.out.println("PRODUCTO    CANTIDAD    TOTAL");
        for (int i = 0; i < numLineas; i++) {
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
