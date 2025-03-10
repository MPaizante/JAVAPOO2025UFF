package Introducao.MiniInterfaces.dominio;

public class DatabaseLoad implements DadosLoad, DataRemove {
    @Override
    public void Load(){
        System.out.println("Carregando dados do banco de dados.");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checando.............");
    }
    @Override
    public void remove(){
        System.out.println("Removendo do banco de Dados.");
    }
}
