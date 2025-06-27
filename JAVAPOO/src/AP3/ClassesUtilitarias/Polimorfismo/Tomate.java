package AP3.ClassesUtilitarias.Polimorfismo;

public class Tomate extends Produto{
    private static final double IMPOSTO = 0.1;
    public Tomate(String nome, double valor){
        super(nome,valor);
    }
    @Override
    public double calcularImposto(){
        System.out.println("Calculando");
        return getValor() * IMPOSTO;
    }
}
