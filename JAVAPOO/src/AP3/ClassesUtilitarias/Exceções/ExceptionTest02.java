package AP3.ClassesUtilitarias.Exceções;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IOException {
        File file = new File("Matheus.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println(isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
