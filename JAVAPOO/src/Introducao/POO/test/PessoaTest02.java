package Introducao.POO.test;

import Introducao.POO.dominio.Pessoa;

public class PessoaTest02 {

    public static void main(String[] args) {
        Pessoa estudante = new Pessoa("A","B","X");
        Pessoa estudante2 = new Pessoa("A","B","C");

        estudante.setIdade(18);
        estudante.setNome("Matheus");
        estudante.setSexo('M');
        System.out.println("O meu nome: "+ estudante.getNome()+ ", minha idade: "+ estudante.getIdade()+", meu sexo: " + estudante.getSexo());
        System.out.println("----------------------------------------");
        estudante2.setIdade(26);
        estudante2.setNome("Araujo");
        estudante2.setSexo('M');
        System.out.println("O meu nome: "+ estudante2.getNome()+ ", minha idade: "+ estudante2.getIdade()+", meu sexo: " + estudante2.getSexo());



    }
}
