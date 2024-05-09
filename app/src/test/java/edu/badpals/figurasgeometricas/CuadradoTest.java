package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuadradoTest {

    @Test
    public void cuadradoAreaTest(){
        Cuadrado cuadrado = new Cuadrado(5);
        assertEquals(25, cuadrado.area());
    }

    @Test
    public void cuadradoNombreTest(){
        Cuadrado cuadrado = new Cuadrado("cuadrao",5);
        assertEquals("cuadrao", cuadrado.getNombre());
    }
}
