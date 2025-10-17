/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaCorriente extends Cuenta {

    private double cupoSobregiro;
    private final double LIMITE_MAXIMO = 1000;

    public CuentaCorriente(double cupoSobregiro, String numeroCuenta, double saldoCuenta, String titular, String fechaApertura) {
        super(numeroCuenta, saldoCuenta, titular, fechaApertura);
        this.cupoSobregiro = cupoSobregiro;
    }

}
