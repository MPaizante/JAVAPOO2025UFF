package Introducao.ModificadorEstatico.test;

import Introducao.ModificadorEstatico.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafú");

        Jogador [] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }
    }

}
