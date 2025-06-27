package AP3.ClassesUtilitarias.Polimorfismo;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Vaio",3000.0);
        Tomate tomate = new Tomate("Vermelho",10.0);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
