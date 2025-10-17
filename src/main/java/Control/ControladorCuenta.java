/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import javax.swing.JOptionPane;
import Modelo.*;

/**
 *
 * @author LENOVO
 */
public class ControladorCuenta {

    private Cliente cliente;

    public ControladorCuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void consignar() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a consignar: "));
        boolean exito = cliente.getCuenta().consignar(monto);

        if (exito) {
            JOptionPane.showMessageDialog(null, "Consignación exitosa. \n Nuevo saldo: $" + cliente.getCuenta().getSaldoCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Error. El monto debe ser mayor que cero.");
        }

    }

}
