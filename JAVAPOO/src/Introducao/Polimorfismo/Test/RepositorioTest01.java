package Introducao.Polimorfismo.Test;

import Introducao.Polimorfismo.Repositorio.Repositorio;
import Introducao.Polimorfismo.servico.RepositorioBancoDeDados;
import Introducao.Polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioMemoria();
        repositorioBancoDeDados.salvar();
        
    }
}
