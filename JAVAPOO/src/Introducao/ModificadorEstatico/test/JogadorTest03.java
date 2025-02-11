package Introducao.ModificadorEstatico.test;

import Introducao.ModificadorEstatico.dominio.Jogador;
import Introducao.ModificadorEstatico.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Matheus");
        Time time = new Time("Brasil");
        Jogador [] jogadores = {jogador};
        jogador.setTime(time);
        time.setJogadores(jogadores
        );

    }
}
