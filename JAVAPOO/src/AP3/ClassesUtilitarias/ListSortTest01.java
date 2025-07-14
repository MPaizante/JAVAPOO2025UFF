package AP3.ClassesUtilitarias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack On Titan");
        mangas.add("Berserk");
        mangas.add("Naruto");
        mangas.add("DBZ");
        mangas.add("Full Metal");
        mangas.add("DANDANDAN");
        Collections.sort(mangas);
        for(String manga : mangas){
            System.out.println(manga);
        }
        System.out.println("==================================");
        for (int i = 0; i < mangas.size(); i++) {
            System.out.println(mangas.get(i));
        }
        System.out.println(mangas);
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(25.0);
        dinheiros.add(100.0);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
        for (Double dinheiro: dinheiros){
            System.out.println(dinheiro);
        }

    }
}
