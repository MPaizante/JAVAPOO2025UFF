package Introducao.ModificadorEstatico.test;

import Introducao.ModificadorEstatico.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Mercedes",275);
        Carro carro3 = new Carro("Audi",290);
        System.out.println();
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
