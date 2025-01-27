package Introducao.POO.test;

import Introducao.POO.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        estudante.idade = 18;
        estudante.nome = "Matheus";
        estudante.sexo = 'M';
        System.out.println("O meu nome: "+ estudante.nome+ ", minha idade: "+ estudante.idade+", meu sexo: " + estudante.sexo);
    }
}
