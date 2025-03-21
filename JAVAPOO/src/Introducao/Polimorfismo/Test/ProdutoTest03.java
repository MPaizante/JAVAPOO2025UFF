package Introducao.Polimorfismo.Test;

import Introducao.Polimorfismo.dominio.Computador;
import Introducao.Polimorfismo.dominio.Produto;
import Introducao.Polimorfismo.dominio.Tomate;
import Introducao.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("Negativo", 4000);
        Tomate tomate = new Tomate("Pelado",15);
        tomate.setDataValidade("20/08/2026");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
