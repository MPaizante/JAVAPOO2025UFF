package AP3.ClassesUtilitarias.Polimorfismo;

public abstract class Produto implements Taxavel {
    private double imposto;
    private String nome;
    private double valor;

    public Produto(String nome, double valor, double imposto) {
        this.nome = nome;
        this.imposto=imposto;
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public String getNome(){
        return this.nome;
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando");
        return getValor() * imposto;
    }

}
