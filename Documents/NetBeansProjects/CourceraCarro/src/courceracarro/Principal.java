
package courceracarro;


public class Principal {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.potencia = 100;
        c1.nome = "Civic";
        c1.velocidade = 0;
        
        Carro c2 = new Carro();
        c2.potencia = 150;
        c2.nome = "Corola";
        c2.velocidade = 0;
        
        Carro c3 = new Carro();
        c3.potencia = 150;
        c3.nome = "Corola";
        c3.velocidade = 0;
        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        
        c2.acelerar();
        c2.acelerar();
        c2.frear();
        
        c1.imprimir();
        c2.imprimir();
        System.out.println("Imprimindo c3");
        c3.imprimir();
    }
}
