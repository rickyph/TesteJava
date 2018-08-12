
package cursocourcera;

public class Compra {
    int valorTotal;
    int numeroParcelas;
    
    //Compra A Vista
    public void CompraAVista(int valor){
        valorTotal = valor;
        numeroParcelas = 1; 
    }
    
    //Compra Parcerlada
    public void CompraParcelada(int valorParcela, int qtdparcelas){
        numeroParcelas = qtdparcelas;
        valorTotal = valorParcela * qtdparcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    public int getValorParcela(){
        return valorTotal / numeroParcelas ;
    }
}
