package AP3.ClassesUtilitarias.Polimorfismo;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Vaio",3000.0,0.12);
        Tomate tomate = new Tomate("Vermelho",9,0.17);
        Televisao televisao = new Televisao("LG 50\" ",2000,0.35);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
