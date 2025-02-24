package Introducao.ModificardorFinal.test;

import Introducao.ModificardorFinal.dominio.Carro;
import Introducao.ModificardorFinal.dominio.Comprpador;
import Introducao.ModificardorFinal.dominio.Ferrari;

public class TestCarro01 {
    public static void main(String[] args) {
        Comprpador comprador = new Comprpador();
        Carro carro = new Carro("Gol");
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.getNome());
        System.out.println(carro.COMPRADOR.getNome());
        Ferrari ferrari = new Ferrari("Abbbbb");
        ferrari.imprime();
    }
}
