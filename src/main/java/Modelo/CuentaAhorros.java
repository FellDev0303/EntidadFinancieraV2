/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
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
}

