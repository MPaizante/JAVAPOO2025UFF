package Introducao.Polimorfismo.Test;

import Introducao.Polimorfismo.dominio.Computador;
import Introducao.Polimorfismo.dominio.Tomate;
import Introducao.Polimorfismo.servico.CalculadoraImposto;

public class PrdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Vaio", 3500);
        Tomate tomate = new Tomate("Vermelho",5);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("======================================");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
