package Introducao.MiniInterfaces.test;

import Introducao.MiniInterfaces.dominio.DatabaseLoad;
import Introducao.MiniInterfaces.dominio.FileLoad;

public class DataLoadTest01 {
    public static void main(String[] args) {
        DatabaseLoad databaseLoad = new DatabaseLoad();
        FileLoad fileLoad = new FileLoad();
        databaseLoad.Load();
        fileLoad.Load();
        fileLoad.remove();
        DatabaseLoad.retrieveMaxDataSize();
    }
}
