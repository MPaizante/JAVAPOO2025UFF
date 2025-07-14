package AP3.ClassesUtilitarias.Exceções;

import java.io.File;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("aquivo.txt");
        try{
           boolean isCriado = file.createNewFile();
            System.out.println(isCriado);
            int [] nums = {1,2};
            System.out.println(nums[3]);

        }catch (Exception e){
            e.printStackTrace();
            //System.out.println("Erro!" + e);

        }

    }
}
