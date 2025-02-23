package Introducao.Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, int idade){
        super(nome,cpf,endereco,idade);
    }

    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome,cpf);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
