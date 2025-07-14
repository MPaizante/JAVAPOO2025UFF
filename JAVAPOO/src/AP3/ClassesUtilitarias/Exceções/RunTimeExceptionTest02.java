package AP3.ClassesUtilitarias.Exceções;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));

    }
    private static int divisao(int a , int b){
        if(b == 0){
            throw new RuntimeException("Erro!");
        }
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;

    }
}
