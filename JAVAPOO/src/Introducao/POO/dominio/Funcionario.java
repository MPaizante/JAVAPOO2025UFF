package Introducao.POO.dominio;

import java.sql.Array;

public class Funcionario {
    public String nome = null;
    public byte idade = 0;
    public double [] salario = null;
    public double res = 0;

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

}
