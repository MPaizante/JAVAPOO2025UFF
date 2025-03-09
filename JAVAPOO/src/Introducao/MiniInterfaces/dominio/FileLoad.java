package Introducao.MiniInterfaces.dominio;

public class FileLoad implements DadosLoad {
    @Override
    public void Load(){
        System.out.println("Carregando dados de um arquivo.");
    }
}
