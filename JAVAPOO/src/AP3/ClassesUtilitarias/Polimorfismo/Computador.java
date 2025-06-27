package AP3.ClassesUtilitarias.Polimorfismo;

public class Computador extends Produto{
    private static final double IMPOSTO = 0.15;
    public Computador(String nome, double valor){
        super(nome,valor);
    }
    @Override
    public double calcularImposto(){
        System.out.println("Calculando");
        return getValor() * IMPOSTO;
    }
}
