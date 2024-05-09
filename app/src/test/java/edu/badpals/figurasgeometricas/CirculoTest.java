package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTest {

    @Test
    public void circuloAreaTest(){
        Circulo circulo = new Circulo(5.0);
        assertEquals(25, circulo.area());
    }

    @Test
    public void circuloNombreTest(){
        Circulo circulo = new Circulo("circulo",7.0);
        assertEquals("circulo", circulo.getNombre());
        assertEquals(49, circulo.area());
    }
}
