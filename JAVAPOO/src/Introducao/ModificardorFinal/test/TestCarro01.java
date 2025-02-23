package Introducao.ModificardorFinal.test;

import Introducao.ModificardorFinal.dominio.Carro;

public class TestCarro01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol");
        System.out.println(carro.VELOCIDADE_LIMITE);
    }
}
