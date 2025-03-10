package Introducao.MiniInterfaces.dominio;

public interface DadosLoad {
    public abstract void Load();
    public abstract void checkPermission();
    public static final int MAX_DATA_SIZE = 10;

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface.");
    };
}
