package Introducao.Polimorfismo.servico;

import Introducao.Polimorfismo.dominio.Computador;
import Introducao.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do PC: "+imposto);
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor do PC: " + (computador.getValor()+imposto));
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do tomate: "+imposto);
        System.out.println("Tomate: "+tomate.getNome());
        System.out.println("Valor do tomate: " + (tomate.getValor()+imposto));
    }
}
