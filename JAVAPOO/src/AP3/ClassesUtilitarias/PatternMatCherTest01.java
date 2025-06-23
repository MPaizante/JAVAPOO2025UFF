package AP3.ClassesUtilitarias;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatCherTest01 {
    public static void main(String[] args) {
        String regex = "";
        String texto = "abaaba";
        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("Indice: 0123");
        System.out.println(regex);
        System.out.println(matcher);

    }
}
