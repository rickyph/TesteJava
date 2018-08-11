
package courceracarro;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Carro {
    int potencia;
    int velocidade;
    String nome;
   
void acelerar(){
    velocidade += potencia;
}
void frear(){
    velocidade = velocidade / 2;
}
int getVelocidade(){
    return velocidade;
}
void imprimir(){
    System.out.println("O Carro "+nome+ " Está a velocidade de " +getVelocidade()+ " Km/hs" +"ciadde");
}
}
