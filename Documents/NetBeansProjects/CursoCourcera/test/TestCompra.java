
import comercio.Compra;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCompra {
    @Test
    //Compra a Vista
    public void TestCompra() {
        Compra c = new Compra (500);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(500, c.getValorParcela());
        assertEquals(500, c.getValorTotal());
    }
    @Test
    //Compra parcelada
    public void CompraParcelada(){
        Compra c = new Compra (2, 1000);
        assertEquals(2, c.getNumeroParcelas());
        assertEquals(2000, c.getValorTotal());
        assertEquals(1000, c.getValorParcela());
   }
    
}
