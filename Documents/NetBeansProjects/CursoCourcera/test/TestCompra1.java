

import comercio.Compra;
import cursocourcera.Compra1;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCompra1 {
    @Test
    //Test Compra a Vista
    public void TestCompra1AVista() {
        Compra c = new Compra (5000);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(5000, c.getValorParcela());
        assertEquals(5000, c.getValorTotal());
    }
    @Test
    //Test Compora Parcelada
    public void Compra1Parcelada(){
        Compra c = new Compra (5,250);
        assertEquals(5, c.getNumeroParcelas());
        assertEquals(250, c.getValorParcela());
        assertEquals(1250, c.getValorTotal());
    }
}
