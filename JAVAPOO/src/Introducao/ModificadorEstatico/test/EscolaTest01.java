package Introducao.ModificadorEstatico.test;

import Introducao.ModificadorEstatico.dominio.Escola;
import Introducao.ModificadorEstatico.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Matheus");
        Professor professor2 = new Professor("Paizante");
        Professor professor3 = new Professor("Araujo");
        Professor [] professores = {professor1,professor2, professor3};
        Escola escola = new Escola("C. E. Paizante",professores );

        escola.imprime();

    }
}
