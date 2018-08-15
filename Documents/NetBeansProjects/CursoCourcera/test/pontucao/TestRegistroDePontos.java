
package pontucao;

import org.junit.Test;
import static org.junit.Assert.*;
import pontuacao.CalculadoraBonus;
import pontuacao.RegistroPontos;
import pontuacao.Usuario;


public class TestRegistroDePontos {
    @Test
    //Testando Registro de Pontos
    public void TestCriarTopicos() {
        Usuario user = new Usuario();
        user.nome = "Henrique";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp =  new RegistroPontos(cb);
        rp.criarUmTopico(user);
        assertEquals(user.pontos, 5);
    }
    @Test
    public void TestCriarTopicoVip() {
        Usuario user = new Usuario();
        user.nome = "Henrique";
        user.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp =  new RegistroPontos(cb);
        rp.criarUmTopico(user);
        assertEquals(user.pontos, 25);
    }
    @Test
    public void TestCriarTopicoBonusDoDia() {
        Usuario user = new Usuario();
        user.nome = "Henrique";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp =  new RegistroPontos(cb);
        rp.criarUmTopico(user);
        assertEquals(user.pontos, 15);
    }
    @Test
    public void TestCriarTopicoViopBonusDoDia() {
        Usuario user = new Usuario();
        user.nome = "Henrique";
        user.vip = false;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp =  new RegistroPontos(cb);
        rp.criarUmTopico(user);
        assertEquals(user.pontos, 75);
    }
    @Test
    public void TestCriarTopicoViopBonusDoDiaAnterior(){
        Usuario user = new Usuario();
        user.nome = "Paulo";
        user.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDiaAnterior = 5;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(user);
        assertEquals(user.pontos, 25);
    }
}
