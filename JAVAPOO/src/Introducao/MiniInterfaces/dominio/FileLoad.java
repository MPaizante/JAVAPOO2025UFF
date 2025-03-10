package Introducao.MiniInterfaces.dominio;

public class FileLoad implements DadosLoad , DataRemove {
    @Override
    public void Load(){
        System.out.println("Carregando dados de um arquivo.");
    }
    @Override
    public void remove(){
        System.out.println("Removendo dados do arquivo.");
    }
    @Override
    public void checkPermission(){
        System.out.println("Checando.............");
    }
}
