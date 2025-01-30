package Introducao.POO.dominio;

import java.sql.Array;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double [] salario = null;
    private double res = 0;

    public void imprimeSalario(){
        if (this.salario != null) {
            for (int i = 0; i < this.salario.length; i++) {
                System.out.println((i + 1) + "º Salario: " + this.salario[i]);
                res += this.salario[i];
            }
            res = res/3;
        }
        System.out.println("==================================");
        System.out.println("Nome: " + this.nome+"| Idade: "+this.idade + "|Media Salario: " + this.res);
        System.out.println("==================================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
