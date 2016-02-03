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
public class Alumno {
    
    private String nombre;
    private String telefono;
    private String domicilio;
    private String fechaCumple;

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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechaCumple
     */
    public String getFechaCumple() {
        return fechaCumple;
    }

    /**
     * @param fechaCumple the fechaCumple to set
     */
    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", telefono=" + telefono + ", domicilio=" + domicilio + ", fechaCumple=" + fechaCumple + '}';
    }
    
    
}
