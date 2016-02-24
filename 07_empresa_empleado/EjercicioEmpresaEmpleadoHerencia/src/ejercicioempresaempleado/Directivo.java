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
public class Directivo extends Empleado {

    private double salarioAnual;
    private double bonusPersonal;

    @Override
    public String toString() {
        return "Directivo{" + "salarioAnual=" + salarioAnual + ", bonusPersonal=" + bonusPersonal + '}';
    }

    /**
     * @return the salarioAnual
     */
    public double getSalarioAnual() {
        return salarioAnual;
    }

    /**
     * @param salarioAnual the salarioAnual to set
     */
    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    /**
     * @return the bonusPersonal
     */
    public double getBonusPersonal() {
        return bonusPersonal;
    }

    /**
     * @param bonusPersonal the bonusPersonal to set
     */
    public void setBonusPersonal(double bonusPersonal) {
        this.bonusPersonal = bonusPersonal;
    }

}
