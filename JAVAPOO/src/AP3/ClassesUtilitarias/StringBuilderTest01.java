package AP3.ClassesUtilitarias;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        nome.concat(" Araujo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Matheus");
        sb.append(" Araujo");
        System.out.println(sb.toString());

    }
}
