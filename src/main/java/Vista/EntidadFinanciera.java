/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;
import Control.ControladorCuenta;
import Modelo.*;

/**
 *
 * @author LENOVO
 */
public class EntidadFinanciera {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema bancario c:.");

        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del titular: ");
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta: ");
        String fechaApertura = JOptionPane.showInputDialog("Ingrese la fecha de apertura (DD/MM/AAAA):");

        int tipoCuenta = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione el tipo de cuenta:\n1. Ahorros\n2. Corriente"));

        Cuenta cuenta;
        boolean esCorriente = false;

        if (tipoCuenta == 1) {
            double tasa = 10;
            cuenta = new CuentaAhorros(tasa, numeroCuenta, 0, nombre, fechaApertura);
        } else {
            double cupo = 1000;
            cuenta = new CuentaCorriente(cupo, numeroCuenta, 0, nombre, fechaApertura);
            esCorriente = true;
        }

        Cliente cliente = new Cliente(nombre, cuenta);
        Control.ControladorCuenta controlador = new ControladorCuenta(cliente);

        int opcion = -1;

        while (opcion != 0) {
            String input = JOptionPane.showInputDialog(
                    "===== MENÚ =====\n"
                    + "1. Consignar dinero\n"
                    + "2. Retirar dinero\n"
                    + "3. Consultar saldo\n"
                    + "4. Ver datos de la cuenta\n"
                    + "5. Consignar dinero al sobregiro\n"
                    + "0. Salir\n\n"
                    + "Elija una opción:");

            if (input == null) {
                break;
            }

            opcion = Integer.parseInt(input);

            if (opcion == 1) {
                controlador.consignar();
            } else if (opcion == 2) {
                controlador.retirar();
            } else if (opcion == 3) {
                controlador.consultarSaldo();
            } else if (opcion == 4) {
                controlador.mostrarDatos();
            } else if (opcion == 5) {
                if (esCorriente) {
                    CuentaCorriente ctaCorriente = (CuentaCorriente) cuenta;
                    double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuánto desea consignar al sobregiro: "));
                    if (ctaCorriente.consignarSobregiro(monto)) {
                        JOptionPane.showMessageDialog(null, "Consignación al sobregiro realizada correctamente.\nCupo actual: $" + ctaCorriente.getCupoSobregiro());
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No puede exceder el límite de sobregiro ($1000) o monto inválido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Esta opción solo aplica para cuentas corrientes.");
                }
            } else if (opcion == 0) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema bancario.");
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }

        System.exit(0);
    }
}
