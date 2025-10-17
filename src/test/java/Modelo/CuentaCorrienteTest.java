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
public class CuentaCorrienteTest {

    @Test
    public void testRetirarConSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(100, "456", 0, "Verónica", "16/10/2025");
        cuenta.consignar(10);
        cuenta.retirar(50); 
        assertEquals(60, cuenta.getCupoSobregiro());
    }

    @Test
    public void testConsignarSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(100, "456", 0, "Verónica", "16/10/2025");
        cuenta.consignarSobregiro(50);
        assertEquals(100, cuenta.getCupoSobregiro());
    }

}
