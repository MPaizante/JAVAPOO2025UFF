package Introducao.Polimorfismo.Test;

import Introducao.Polimorfismo.dominio.Computador;
import Introducao.Polimorfismo.dominio.Televisao;
import Introducao.Polimorfismo.dominio.Tomate;
import Introducao.Polimorfismo.servico.CalculadoraImposto;

public class PrdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Vaio", 3500);
        Tomate tomate = new Tomate("Vermelho",5);
        Televisao televisao = new Televisao("LG",3500);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("======================================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("======================================");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
