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

    public void retirar() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
        boolean exito = cliente.getCuenta().retirar(monto);

        if (exito) {
            JOptionPane.showMessageDialog(null, "Retiro exitoso. \n Nuevo saldo: $" + cliente.getCuenta().getSaldoCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Error. Saldo insuficiente(Ahorros)o sobregiro excedido(Corriente).");
        }
    }
        
    public void mostrarDatos(){
    JOptionPane.showMessageDialog(null, cliente.mostrarDatosCliente());
    }
        
    public void consultarSaldo(){
    JOptionPane.showMessageDialog(null,"Saldo actual: $"+cliente.getCuenta().getSaldoCuenta());
    }


}
