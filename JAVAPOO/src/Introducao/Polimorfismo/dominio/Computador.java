package Introducao.Polimorfismo.dominio;

public class Computador extends Produto implements Taxavel{
    public static final double IMPOSTO_PORCENTO = 0.05;
    public Computador(String nome, double valor){
        super(nome,valor);
    }
    public double calcularImposto(){
        System.out.println("Calculando imposto PC");
        return this.valor * IMPOSTO_PORCENTO ;
    }
}
