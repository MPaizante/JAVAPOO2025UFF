package Introducao.ModificadorEstatico.test;

import Introducao.ModificadorEstatico.dominio.Jogador;
import Introducao.ModificadorEstatico.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 =new Jogador("Matheus");
        Jogador jogador2 =new Jogador("Paizante");
        Jogador jogador3 =new Jogador("Araujo");

        Time time = new Time("OJUARA");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
