package Introducao.POO.test;

import Introducao.POO.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Matheus";
        funcionario.idade = 26;
        funcionario.salario = new double[]{1000,2000,3000};

        funcionario.imprimeSalario();

    }
}
