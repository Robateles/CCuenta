package cuenta;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CCuentaTest {


    @Test
    public void testIngresarNegativo() {
        CCuenta c = new CCuenta();
        assertEquals(1, c.ingresar(-10));
        assertEquals(0, c.dSaldo);
    }


    @Test
    public void testIngresarCorrecto() {
        CCuenta c = new CCuenta();
        assertEquals(0, c.ingresar(100));
        assertEquals(100, c.dSaldo);
    }


    @Test
    public void testRetirarCorrecto() {
        CCuenta c = new CCuenta();
        c.ingresar(200);
        c.retirar(50);
        assertEquals(150, c.dSaldo);
    }
}