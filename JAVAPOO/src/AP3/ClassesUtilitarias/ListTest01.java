package AP3.ClassesUtilitarias;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(8);
        nomes.add("Matheus");
        nomes.add("Paizante");
        System.out.println(nomes.size());
       for(String nome : nomes){
           System.out.println(nome.replace("a","o"));
       }
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
