package Introducao.Exeption;

import java.io.File;


public class ExeceptionTest0 {
    public static void criarNovoArquivo(){
        File file = new File("arquivo\\test.txt");
        try {
            boolean criado = file.createNewFile();
            System.out.println(criado);
        }catch (Exception e ){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        criarNovoArquivo();
    }
}
