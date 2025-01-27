package Introducao.POO.test;

import Introducao.POO.dominio.Pessoa;

public class PessoaTest02 {

    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        Pessoa estudante2 = new Pessoa();

        estudante.idade = 18;
        estudante.nome = "Matheus";
        estudante.sexo = 'M';
        System.out.println("O meu nome: "+ estudante.nome+ ", minha idade: "+ estudante.idade+", meu sexo: " + estudante.sexo);
        System.out.println("----------------------------------------");
        estudante2.idade = 26;
        estudante2.nome = "Araujo";
        estudante2.sexo = 'M';
        System.out.println("O meu nome: "+ estudante2.nome+ ", minha idade: "+ estudante2.idade+", meu sexo: " + estudante2.sexo);



    }
}
