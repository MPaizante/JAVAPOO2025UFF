package AP3.ClassesUtilitarias;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Matheus";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("a","i"));
        String numeros = "0123456";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,numeros.length()));
        String nome2 = "          Matheus           ";
        System.out.println(nome2.trim());

    }
}
