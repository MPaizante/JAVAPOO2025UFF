package Introducao.Polimorfismo.dominio;

public class Tomate extends Produto implements Taxavel{
    public static final double IMPOSTO_PORCENTO = 0.03;
    private String dataValidade;

    public Tomate(String nome, double valor){
        super(nome,valor);
    }
    @Override
    public double calcularImposto(){
        System.out.println("Calculando imposto TOMATE");
        return this.valor * IMPOSTO_PORCENTO;
    }
    public String getDataValidade(){
        return this.dataValidade;
    }
    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
}
