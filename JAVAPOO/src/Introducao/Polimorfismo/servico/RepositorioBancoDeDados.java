package Introducao.Polimorfismo.servico;

import Introducao.Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando no Bando de Dados.");
    }
}
