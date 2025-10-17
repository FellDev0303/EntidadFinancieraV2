/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class CuentaAhorrosTest {

    @Test
    public void testConsignar() {
        CuentaAhorros cuenta = new CuentaAhorros(0.02, "123", 0, "José", "16/10/2025");
        cuenta.consignar(50000);
        assertEquals(50000, cuenta.getSaldoCuenta());
    }

    @Test
    public void testRetirar() {
        CuentaAhorros cuenta = new CuentaAhorros(0.02, "123", 0, "José", "16/10/2025");
        cuenta.consignar(30000);
        cuenta.retirar(10000);
        assertEquals(20000, cuenta.getSaldoCuenta());
    }

}
