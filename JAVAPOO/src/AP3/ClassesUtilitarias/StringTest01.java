package AP3.ClassesUtilitarias;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Matheus";
        String nome2 = "Matheus";
        System.out.println(nome2.equals(nome));
        System.out.println(nome2 == nome);
        nome = nome.concat(" Paizante");
        System.out.println(nome);
        String nome3 = new String("Matheus");
        System.out.println(nome2 == nome3);
        System.out.println(nome2.equals(nome3));
        System.out.println(nome2 == nome3.intern());



    }
}
