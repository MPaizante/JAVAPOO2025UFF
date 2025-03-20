package Introducao.Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.05;
    public Televisao(String nome, double valor){
        super(nome,valor);

    }
    @Override
    public double calcularImposto(){
        System.out.println("Calculando Imposto...");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
