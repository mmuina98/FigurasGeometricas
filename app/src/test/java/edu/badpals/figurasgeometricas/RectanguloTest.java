package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {

    @Test
    public void rectanguloAreaTest(){
        Rectangulo rectangulo = new Rectangulo(4.0,5.0);
        assertEquals(20 ,rectangulo.area());
    }

    @Test
    public void rectanguloAreaTest2(){
        Rectangulo rectangulo = new Rectangulo(2.0,5.0);
        assertEquals(10 ,rectangulo.area());
    }

    @Test
    public void rectanguloSobrecargaTest(){
        Rectangulo rectangulo = new Rectangulo("rectangulo",2.0,3.0);
        assertEquals("rectangulo" ,rectangulo.getNombre());
        assertEquals(6 ,rectangulo.area());
    }

}
