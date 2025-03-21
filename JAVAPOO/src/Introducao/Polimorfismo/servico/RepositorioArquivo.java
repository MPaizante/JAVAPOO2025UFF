package Introducao.Polimorfismo.servico;

import Introducao.Polimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um arquivo.");
    }
}
