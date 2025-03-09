package Introducao.ClassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.salario = salario;
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Funcionario{"+"nome:"+this.nome+" salario:"+this.salario+"}";
    }

    public double getSalario(){
        return salario;
    }

}
