package AP3.ClassesUtilitarias.Polimorfismo;

public class Tomate extends Produto{
    private String dataValidade;
    //private static final double IMPOSTO = 0.1;
    public Tomate(String nome, double valor, double imposto){
        super(nome,valor,imposto);
    }


    public String getDataValidade() {
        return dataValidade;
    }
}
