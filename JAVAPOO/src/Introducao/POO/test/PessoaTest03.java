package Introducao.POO.test;

import Introducao.POO.dominio.Pessoa;

public class PessoaTest03 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Matheus");
        pessoa.setIdade(26);
        pessoa.setSexo('M');

        pessoa.imprime();
    }
}
