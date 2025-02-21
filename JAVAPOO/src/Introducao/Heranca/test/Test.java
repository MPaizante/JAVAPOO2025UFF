package Introducao.Heranca.test;

public class Test {
    private String nome;
    private int idade;
    private float saldo;
    private int conta;
    void RealizarSaque(float s){
        saldo = saldo - s;
    }
    float RequisitaSaldo(){
        return saldo;
    }
    public Test(String nome, int idade, float saldo){
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }
    public Test(String nome, int idade, float saldo, int conta){
        this(nome, idade, saldo);
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getConta() {
        return conta;
    }

    public static void main(String[] args) {
        Test cliente1 = new Test("Matheus",26,5000,52);
        System.out.println("Nome: "+cliente1.getNome()+" Saldo: "+cliente1.getSaldo()+" conta:"+cliente1.getConta());
    }
}
