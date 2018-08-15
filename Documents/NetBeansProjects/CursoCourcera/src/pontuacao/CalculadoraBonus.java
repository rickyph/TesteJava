
package pontuacao;


public class CalculadoraBonus {
   public int bonusDoDia = 1;
   public int bonusDoDiaAnterior = 1;
  
   public int bonus(Usuario user){
       int  multiplicador = bonusDoDia;
            if(user.vip)
                multiplicador *= 5;
            return multiplicador;
   }
   public class CalculadoraBons1 {
       public int bonus(Usuario user){
       int  multiplicador = bonusDoDiaAnterior;
            if(user.vip)
                multiplicador *= 2;
            return multiplicador;
   }

   }
}
