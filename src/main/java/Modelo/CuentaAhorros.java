/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaAhorros extends Cuenta {

    private double tasaInteres;

    public CuentaAhorros(double tasaInteres, String numeroCuenta, double saldoCuenta, String titular, String fechaApertura) {
        super(numeroCuenta, saldoCuenta, titular, fechaApertura);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
    public double calcularIntereses() {
        return saldoCuenta * (tasaInteres / 100);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()
                + "\nTipo de cuenta: Ahorros"
                + "\nTasa de interés: " + tasaInteres + "%"
                + "\nInterés generado: $" + calcularIntereses();
    }

}
