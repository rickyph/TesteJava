
package pontuacao;


public class CalculadoraBons1 {
       public int bonusDoDiaAnterior = 2; 
  
   public int bonus(Usuario user){
       int  multiplicador = bonusDoDiaAnterior;
            if(user.vip)
                multiplicador *= 2;
            return multiplicador;
   }
   
}
