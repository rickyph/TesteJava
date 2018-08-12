
package cursocourcera;

public class Compra1 {
        int valorTotal;
        int numeroParcelas;

// Compra a Vista
public void Compra1AVista(int valor){
     numeroParcelas = 1;
     valorTotal = valor;
}
// Compra Parcelada
public void Compra1Parcelada(int valorParcela, int qtdParcelas){
    numeroParcelas = qtdParcelas;
    valorTotal = valorParcela * qtdParcelas;
}

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    public int getValorParcela(){
        return valorTotal / numeroParcelas;
    }

}