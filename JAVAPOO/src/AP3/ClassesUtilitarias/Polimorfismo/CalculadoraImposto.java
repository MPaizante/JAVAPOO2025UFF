package AP3.ClassesUtilitarias.Polimorfismo;

public class CalculadoraImposto{
    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        System.out.println("Relatorio de imposto do Computador: "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.calcularImposto();
        System.out.println("Relatorio de imposto do Computador: "+imposto);
    }


}
