package AP3.ClassesUtilitarias.Polimorfismo;

public abstract class Produto implements Taxavel {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

}
