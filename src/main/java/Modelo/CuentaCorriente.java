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
    
    @Override
    public boolean retirar(double monto) {
        if (monto <= 0) {
            return false;
        }

        if (monto <= saldoCuenta) {
            saldoCuenta -= monto;
            return true;
        }

        double faltante = monto - saldoCuenta;
        if (faltante <= cupoSobregiro) {
            saldoCuenta = 0;
            cupoSobregiro -= faltante;
            return true;
        }

        return false;
    }
        @Override
    public boolean consignar(double monto) {
        if (monto <= 0) {
            return false;
        }
        saldoCuenta += monto;
        return true;
    }
    
    public boolean consignarSobregiro(double monto) {
        if (monto <= 0) {
            return false;
        }
        if (cupoSobregiro + monto > LIMITE_MAXIMO) {
            return false;
        }
        cupoSobregiro += monto;
        return true;
    }
    
    @Override
    public String mostrarDatos() {
        return "Titular: " + titular
                + "\nNúmero de cuenta: " + numeroCuenta
                + "\nFecha de apertura: " + fechaApertura
                + "\nTipo de cuenta: Corriente"
                + "\nSaldo actual (solo cuenta): $" + saldoCuenta
                + "\nCupo de sobregiro disponible: $" + cupoSobregiro
                + "\nSaldo total disponible (saldo + sobregiro): $" + (saldoCuenta + cupoSobregiro);
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }
}
