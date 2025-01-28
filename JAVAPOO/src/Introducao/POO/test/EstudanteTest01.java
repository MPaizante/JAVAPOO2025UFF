package Introducao.POO.test;

import Introducao.POO.dominio.Estudante;
import Introducao.POO.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Matheus";
        estudante01.idade = 26;
        estudante01.sexo = 'M';

        estudante02.nome = "Araujo";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);


    }
}
