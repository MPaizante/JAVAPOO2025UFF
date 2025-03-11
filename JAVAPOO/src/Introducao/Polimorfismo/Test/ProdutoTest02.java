package Introducao.Polimorfismo.Test;

import Introducao.Polimorfismo.dominio.Computador;
import Introducao.Polimorfismo.dominio.Produto;
import Introducao.Polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Computador produto = new Computador("F15",3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------");

        Tomate tomate = new Tomate("Liso",5);
        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calcularImposto());

    }
}
