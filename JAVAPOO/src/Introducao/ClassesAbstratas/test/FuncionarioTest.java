package Introducao.ClassesAbstratas.test;

import Introducao.ClassesAbstratas.dominio.Desenvolvedor;
import Introducao.ClassesAbstratas.dominio.Funcionario;
import Introducao.ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paizante",10000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mat",5000);
        System.out.println(desenvolvedor);
    }
}
