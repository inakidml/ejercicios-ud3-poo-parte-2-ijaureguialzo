/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempresaempleado;

/**
 *
 * @author widemos
 */
public class Empresa {

    private String nombre;
    private String anyoFundacion;

    private Empleado[] empleados = new Empleado[EjercicioEmpresaEmpleado.MAX_EMPLEADOS];
    private int numEmpleados = 0;

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", anyoFundacion=" + anyoFundacion + '}';
    }

    public void anyadirEmpleado(Empleado e) {
        empleados[numEmpleados] = e;
        numEmpleados++;
    }

    public void listadoEmpleados() {
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println(empleados[i]);

            switch (empleados[i].getClass().getSimpleName()) {
                case "Operario":
                    Operario o = (Operario) empleados[i];
                    System.out.println(o);
                    break;
                case "Directivo":
                    Directivo d = (Directivo) empleados[i];
                    System.out.println(d);
                    break;
                default:
            }

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
     * @return the anyoFundacion
     */
    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    /**
     * @param anyoFundacion the anyoFundacion to set
     */
    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    /**
     * @return the empleados
     */
    public Empleado[] getEmpleados() {
        return empleados;
    }

    /**
     * @return the numEmpleados
     */
    public int getNumEmpleados() {
        return numEmpleados;
    }

    /**
     * @param numEmpleados the numEmpleados to set
     */
    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

}
