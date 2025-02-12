package Introducao.Heranca.test;

import Introducao.Heranca.dominio.Funcionario;
import Introducao.Heranca.dominio.Pessoa;
import Introducao.Heranca.dominio.Endereco;

public class Aula01Test01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("AAAA","222222-222");
        Pessoa pessoa = new Pessoa("Aluno","111111111-11", endereco);
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario =new Funcionario();
        funcionario.setNome("Matheus");
        funcionario.setIdade(26);
        funcionario.setSalario(2015.85);
    }
}
