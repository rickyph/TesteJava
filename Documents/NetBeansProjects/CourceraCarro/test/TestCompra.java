

import comercio.Compra;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCompra {

    @Test
  public void TestCompraAVista() {
        Compra c = new Compra(500);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(500, c.getValorTotal());
        assertEquals(500, c.getValorParcela());
    }
    @Test
  public void compraParcelsda(){
      Compra c = new Compra(4,250);
        assertEquals(4, c.getNumeroParcelas());
        assertEquals(1000, c.getValorTotal());
        assertEquals(250, c.getValorParcela());
          
        }
}

