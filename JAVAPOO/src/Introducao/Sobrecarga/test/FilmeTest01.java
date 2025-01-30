package Introducao.Sobrecarga.test;

import Introducao.Sobrecarga.dominio.Filme;

public class FilmeTest01 {

    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.init("Velozes e Furiosos","Cinema" , 11, "Ação");

        filme.imprime();
    }

}
