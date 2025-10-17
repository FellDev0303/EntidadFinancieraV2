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
 * @author Vero
 */
public class ClienteTest {

    @Test
    public void testCrearCliente() {
        CuentaAhorros cuenta = new CuentaAhorros(0.02, "123", 0, "Carlos", "16/10/2025");
        Cliente cliente = new Cliente("Carlos", cuenta);
        assertEquals("Carlos", cliente.getNombre());
        assertEquals("123", cliente.getCuenta().getNumeroCuenta());
    }
}
