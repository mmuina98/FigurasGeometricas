package edu.badpals.figurasgeometricas;

import edu.badpals.figurasgeometricas.drawable.Drawable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElipseTest {

    @Test
    public void areaElipseTest(){
        FiguraGeometrica elipse = new Elipse(5.0, 3.0);
        assertEquals(15*3.14, elipse.area());
    }

    @Test
    public void sobrecargaElipseTest(){
        FiguraGeometrica elipse = new Elipse("elipse", 7.0, 6.0);
        assertEquals(42*3.14, elipse.area());
    }

    @Test
    public void circuloDrawableTest(){
        FiguraGeometrica elipse = new Elipse("Elipse",7.0,10.0);

        assertEquals("Esto es una: Elipse", ((Drawable)elipse).draw());
    }
}
