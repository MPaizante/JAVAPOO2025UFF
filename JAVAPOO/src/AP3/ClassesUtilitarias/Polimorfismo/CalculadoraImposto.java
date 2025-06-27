package AP3.ClassesUtilitarias.Polimorfismo;

public class CalculadoraImposto{
    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        System.out.println("Relatorio de imposto do Computador: "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.calcularImposto();
        System.out.println("Relatorio de imposto do Tomate: "+imposto);
    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do produto "+produto.getNome());
        System.out.println("Calculando...");
        System.out.println("Valor do produto: "+produto.getValor());
        double imposto = produto.calcularImposto();
        double valorTotal = imposto + produto.getValor();
        System.out.println("Imposto:" + imposto);
        System.out.println("Valor total do "+produto.getNome()+": "+valorTotal+".");
        System.out.println("================================");
    }
}
