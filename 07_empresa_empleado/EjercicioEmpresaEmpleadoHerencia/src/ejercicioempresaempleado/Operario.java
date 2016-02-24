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
public class Operario extends Empleado {

    private double salarioHora;
    private int horasContrato;

    @Override
    public String toString() {
        return "Operario{" + "salarioHora=" + salarioHora + ", horasContrato=" + horasContrato + '}';
    }

    /**
     * @return the salarioHora
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    /**
     * @param salarioHora the salarioHora to set
     */
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    /**
     * @return the horasContrato
     */
    public int getHorasContrato() {
        return horasContrato;
    }

    /**
     * @param horasContrato the horasContrato to set
     */
    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

}
