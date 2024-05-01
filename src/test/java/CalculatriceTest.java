package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import main.java.resources.Calculatrice;

public class CalculatriceTest {
    private Calculatrice calculatrice;

    @Before
    public void setUp() {
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAddition() {
        assertEquals(4.0, calculatrice.calculer('+', 2.0, 2.0), 0.001);
    }

    @Test
    public void testSoustraction() {
        assertEquals(2.0, calculatrice.calculer('-', 4.0, 2.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculatrice.calculer('*', 3.0, 2.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculatrice.calculer('/', 4.0, 2.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionParZero() {
        calculatrice.calculer('/', 4.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateurInvalide() {
        calculatrice.calculer('%', 4.0, 2.0);
    }
}
