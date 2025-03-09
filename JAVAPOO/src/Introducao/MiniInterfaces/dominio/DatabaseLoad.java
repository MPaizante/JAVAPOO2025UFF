package Introducao.MiniInterfaces.dominio;

public class DatabaseLoad implements DadosLoad {
    @Override
    public void Load(){
        System.out.println("Carregando dados do banco de dados.");
    }
}
