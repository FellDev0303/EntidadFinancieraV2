/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.*;

/**
 *
 * @author LENOVO
 */
public class ControladorCuentaTest {

    @Test
    public void testConsignarYConsultarSaldo() {
        CuentaAhorros cuenta = new CuentaAhorros(0.02, "001", 0, "José", "16/10/2025");
        Cliente cliente = new Cliente("José", cuenta);
        ControladorCuenta controlador = new ControladorCuenta(cliente);

        cuenta.consignar(20000);
        assertEquals(20000, cuenta.getSaldoCuenta());
    }

    @Test
    public void testRetirarCuentaCorriente() {
        CuentaCorriente cuenta = new CuentaCorriente(100, "002", 0, "Ana", "16/10/2025");
        Cliente cliente = new Cliente("Ana", cuenta);
        ControladorCuenta controlador = new ControladorCuenta(cliente);

        cuenta.consignar(10);
        cuenta.retirar(50);
        assertEquals(60, cuenta.getCupoSobregiro());
    }
}
