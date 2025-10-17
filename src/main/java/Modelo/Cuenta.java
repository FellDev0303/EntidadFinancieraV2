/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Cuenta {

    protected String numeroCuenta;
    protected double saldoCuenta;
    protected String titular;
    protected String fechaApertura;

    public Cuenta(String numeroCuenta, double saldoCuenta, String titular, String fechaApertura) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.titular = titular;
        this.fechaApertura = fechaApertura;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

}
