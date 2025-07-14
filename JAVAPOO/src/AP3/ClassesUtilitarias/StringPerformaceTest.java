package AP3.ClassesUtilitarias;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (inicio - fim)+"ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBiulder(10000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (inicio2 - fim2)+"ms");

    }
    private static void concatString(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    private static void concatStringBiulder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
