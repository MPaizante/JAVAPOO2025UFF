package Introducao.POO.test;

import Introducao.POO.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Matheus";
        estudante01.idade = 26;
        estudante01.sexo = 'M';

        estudante02.nome = "Araujo";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        estudante01.imprime();

        estudante02.imprime();

    }
}
