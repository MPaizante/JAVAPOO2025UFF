package Introducao.POO.test;

import Introducao.POO.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Matheus";
        System.out.println(professor.nome);
    }
}
