package Introducao.POO.test;


import Introducao.POO.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Carro-nome1";
        carro1.modelo = "Carro-modelo1";
        carro1.ano = 1999;
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Carro-nome2";
        carro2.modelo = "Carro-modelo2";
        carro2.ano = 1999;
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }

}
